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
 * Builds DynamicFixedListType instance. It offers complementary static factory methods for setting
 * the selected element(i.e. value) and list items fields of the instance.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class DynamicFixedListType {

    private DynamicValueType value;
    @JsonProperty("list_items")
    private List<DynamicValueType> listItems;

    /**
     * Creates DynamicFixedListType instance and set only the value field.
     *
     * @param value contains the selected value DynamicValueType instance
     * @return DynamicFixedListType instance with only value field set
     */
    public static DynamicFixedListType of(DynamicValueType value) {
        Objects.requireNonNull(value);
        DynamicFixedListType dynamicFixedListType = new DynamicFixedListType();
        dynamicFixedListType.value = value;
        return dynamicFixedListType;
    }

    /**
     * Creates DynamicFixedListType instance and set only the listItems field.
     *
     * @param listItems contains the source list of DynamicValueType instances
     * @return a DynamicFixedListType instance with only the listItems field set
     */
    public static DynamicFixedListType from(List<DynamicValueType> listItems) {
        DynamicFixedListType dynamicFixedListType = new DynamicFixedListType();
        dynamicFixedListType.listItems = listItems;
        return dynamicFixedListType;
    }

    /**
     * Creates DynamicFixedListType instance and sets both the value and listItems fields.
     *
     * @param selectListItems list items that may or may not contain the selected value
     * @param original a DynamicFixedListType instance that contains existing selected value
     * @return DynamicFixedListType instance with selected value and list items set
     */
    public static DynamicFixedListType from(List<DynamicValueType> selectListItems, DynamicFixedListType original) {
        DynamicFixedListType dynamicFixedListType = DynamicFixedListType.from(selectListItems);

        if (original == null) {
            return dynamicFixedListType;
        }

        Optional<DynamicValueType> selectedValue = DynamicFixedListType.getSelectedValue(original);
        if (selectedValue.isPresent()) {
            //when selectListItems contains the original value - full match, i.e. code & label
            List<DynamicValueType> originalCodeAndLabelItems = getListItemsWithOriginalCodeAndLabel(selectListItems,
                selectedValue.get());
            if (!originalCodeAndLabelItems.isEmpty()) {
                dynamicFixedListType.setValue(original.getValue());
                return dynamicFixedListType;
            }

            //when selectListItems contains the original value - partial match, i.e. code only
            List<DynamicValueType> listWithOnlyOriginalCode = getListItemsWithOnlyOriginalCode(selectListItems,
                selectedValue.get());
            if (!listWithOnlyOriginalCode.isEmpty()) {
                selectedValue.get().setLabel(listWithOnlyOriginalCode.get(0).getLabel());
                dynamicFixedListType.setValue(original.getValue());
                return dynamicFixedListType;
            }

            //when selectListItems does not contain the original value
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
     * A one argument constructor used to set value field of DynamicFixedListType instance by
     * creating a DynamicValueType instance.
     */
    public DynamicFixedListType(String value) {
        this.value = new DynamicValueType(value, value);
    }

    /**
     * No argument constructor used by the static factory methods('of' and 'from', for example) to create
     * an instance of this type/class.
     */
    public DynamicFixedListType() {
    }

    /**
     * Extracts the selected value of a DynamicFixedListType instance, if one exists.
     * If not, returns an optional empty object.
     *
     * @param dynamicFixedListType an instance to check for selected value field
     * @return an optional DynamicValueType type
     */
    public static Optional<DynamicValueType> getSelectedValue(DynamicFixedListType dynamicFixedListType) {
        return dynamicFixedListType != null ? Optional.ofNullable(dynamicFixedListType.getValue()) : Optional.empty();
    }

    /**
     * Extracts the selected Label of the child DynamicValueType selected value field of the
     * DynamicFixedListType instance, if it is set. If not, returns an optional empty String object.
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
     * Validates the specified code by checking if it matches the codes of list items.
     * @param code contains code to check in code list
     * @return result indicating if a match is found or not
     */
    public boolean isValidCodeForList(String code) {
        if (CollectionUtils.isNotEmpty(listItems) && StringUtils.isNotBlank(code)) {
            for (var dynamicValueType : listItems) {
                if (dynamicValueType.getCode().equals(code)) {
                    return true;
                }
            }
        }

        return false;
    }
}
