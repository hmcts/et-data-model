package uk.gov.hmcts.et.common.model.bulk.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Organizes/structures data that populates a single-select list, i.e. select one item from
 * a drop-down selection list when rendered in a user interface.
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class DynamicFixedListType {
    /**
     * The currently selected item(key-value/code-label pair).
     */

    private DynamicValueType value;
    /**
     * The list of items to select from.
     */
    @JsonProperty("list_items")
    private List<DynamicValueType> listItems;

    /**
     * Creates an instance and sets only the currently selected item.
     *
     * @param value the item to set as currently selected
     * @return an instance with only currently selected field set
     */
    public static DynamicFixedListType of(DynamicValueType value) {
        Objects.requireNonNull(value);
        DynamicFixedListType dynamicFixedListType = new DynamicFixedListType();
        dynamicFixedListType.value = value;
        return dynamicFixedListType;
    }

    /**
     * Creates an instance and sets only the list of items to select from.
     *
     * @param listItems items to select one item from
     * @return an instance with only the list of items field set
     */
    public static DynamicFixedListType from(List<DynamicValueType> listItems) {
        DynamicFixedListType dynamicFixedListType = new DynamicFixedListType();
        dynamicFixedListType.listItems = listItems;
        return dynamicFixedListType;
    }

    /**
     * Creates an instance and sets both the list of items to select from and the currently selected item.
     * It sets currently selected element from the original parameter. Depending on the parameters,
     * this might involve copying, newly adding, or correcting the currently selected item details(i.e. code & label).
     *
     * @param selectListItems list of items that may or may not contain the currently selected value
     * @param original a source of selected value to set in the new dynamic fixed list instance it creates
     * @return an instance with the currently selected item and list of items set
     */
    public static DynamicFixedListType from(List<DynamicValueType> selectListItems, DynamicFixedListType original) {
        DynamicFixedListType dynamicFixedListType = DynamicFixedListType.from(selectListItems);

        if (original == null) {
            return dynamicFixedListType;
        }

        Optional<DynamicValueType> selectedValue = DynamicFixedListType.getSelectedValue(original);
        if (selectedValue.isPresent()) {
            // when the list of items to select from contains the selected item from the original fixed list -
            // full match, i.e. code & label
            List<DynamicValueType> originalCodeAndLabelItems = getListItemsWithOriginalCodeAndLabel(selectListItems,
                selectedValue.get());
            if (!originalCodeAndLabelItems.isEmpty()) {
                dynamicFixedListType.setValue(original.getValue());
                return dynamicFixedListType;
            }

            // when the list of items to select from contains the selected item from the original fixed list -
            // partial match, i.e. code only
            List<DynamicValueType> listWithOnlyOriginalCode = getListItemsWithOnlyOriginalCode(selectListItems,
                selectedValue.get());
            if (!listWithOnlyOriginalCode.isEmpty()) {
                selectedValue.get().setLabel(listWithOnlyOriginalCode.get(0).getLabel());
                dynamicFixedListType.setValue(original.getValue());
                return dynamicFixedListType;
            }

            // when the list of items to select from does not contain the selected item from the original fixed list
            boolean itemsListHasNoOriginalValue = dynamicFixedListType.listItems.stream()
                .noneMatch(i -> i.getCode().equals(selectedValue.get().getCode()));
            if (itemsListHasNoOriginalValue) {
                return recreateDynamicFixedListType(dynamicFixedListType.listItems,
                    selectedValue.get(), original.getValue());
            }
        }
        return dynamicFixedListType;
    }

    private static DynamicFixedListType recreateDynamicFixedListType(List<DynamicValueType> currentListItems,
                                                              DynamicValueType selectedValue,
                                                              DynamicValueType originalValue) {
        DynamicValueType existingDynamicValueType = new DynamicValueType();
        existingDynamicValueType.setCode(selectedValue.getCode());
        existingDynamicValueType.setLabel(selectedValue.getLabel());
        List<DynamicValueType> transferListItems = new ArrayList<>(currentListItems);
        transferListItems.add(existingDynamicValueType);
        DynamicFixedListType newDynamicFixedListType = DynamicFixedListType.from(transferListItems);
        newDynamicFixedListType.setValue(originalValue);
        return newDynamicFixedListType;
    }

    private static List<DynamicValueType> getListItemsWithOriginalCodeAndLabel(List<DynamicValueType> items,
                                                              DynamicValueType selectedValue) {
        return items.stream()
            .filter(i -> i.getCode().equals(selectedValue.getCode())
                && i.getLabel().equals(selectedValue.getLabel()))
            .collect(Collectors.toList());
    }

    private static List<DynamicValueType> getListItemsWithOnlyOriginalCode(List<DynamicValueType> items,
                                                                           DynamicValueType selectedValue) {
        return items.stream()
            .filter(i -> i.getCode().equals(selectedValue.getCode())
                && !i.getLabel().equals(selectedValue.getLabel()))
            .collect(Collectors.toList());
    }

    /**
     * Creates an instance and sets the currently selected item to the value passed in.
     */
    public DynamicFixedListType(String value) {
        this.value = new DynamicValueType(value, value);
    }

    public DynamicFixedListType() {
    }

    /**
     * Extracts the currently selected item, if one exists, from the dynamic fixed list.
     * If not, it returns an optional empty object.
     *
     * @param dynamicFixedListType a source dynamic fixed list that may contain the currently selected item
     * @return an optional instance that contains the selected item
     */
    public static Optional<DynamicValueType> getSelectedValue(DynamicFixedListType dynamicFixedListType) {
        return dynamicFixedListType != null ? Optional.ofNullable(dynamicFixedListType.getValue()) : Optional.empty();
    }

    /**
     * Extracts the label(i.e. text that gets displayed in user interface) from the currently selected
     * item, if it is set. If not, it returns an optional empty String object.
     *
     * @param dynamicFixedListType an instance to check for selected value field
     * @return an optional String type
     */
    public static Optional<String> getSelectedLabel(DynamicFixedListType dynamicFixedListType) {
        if (dynamicFixedListType != null && dynamicFixedListType.getValue() != null) {
            return Optional.of(dynamicFixedListType.getSelectedLabel());
        } else {
            return Optional.empty();
        }
    }

    public String getSelectedLabel() {
        return value != null ? value.getLabel() : null;
    }

    public String getSelectedCode() {
        return value != null ? value.getCode() : null;
    }

    /**
     * Validates the specified code of a selected item by checking if it exists(matches the code field of an item)
     * in the list of selectable items. If no match is found, the specified code is then invalid.
     *
     * @param code a text value to search for in the list of items by matching with the code field of each item
     * @return confirmation if the code is valid or not
     */
    public boolean isValidCodeForList(String code) {
        if (CollectionUtils.isNotEmpty(listItems) && StringUtils.isNotBlank(code)) {
            for (DynamicValueType dynamicValueType : listItems) {
                if (dynamicValueType.getCode().equals(code)) {
                    return true;
                }
            }
        }

        return false;
    }
}
