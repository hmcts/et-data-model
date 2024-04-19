package uk.gov.hmcts.et.common.model.bulk.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class DynamicMultiSelectListType {

    private List<DynamicValueType> value;
    @JsonProperty("list_items")
    private List<DynamicValueType> listItems;

    public static DynamicMultiSelectListType of(List<DynamicValueType> values) {
        Objects.requireNonNull(values);
        DynamicMultiSelectListType dynamicMultiSelectListType = new DynamicMultiSelectListType();
        dynamicMultiSelectListType.value = values;
        dynamicMultiSelectListType.listItems = values;
        return dynamicMultiSelectListType;
    }

    /**
     * Create a new DynamicMultiSelectListType with multiple items and optionally select it.
     * @param code Code to be used to identify the selected option
     * @param label Label to show for the selected option
     * @param selected Optionally set the first item as selected
     * @return newly created DynamicMultiSelectListType
     */
    public DynamicMultiSelectListType from(String code, String label, boolean selected) {
        DynamicMultiSelectListType listType = DynamicMultiSelectListType.from(List.of(DynamicMultiSelectListType.create(code, label)));
        if (selected) {
            listType.setValue(listType.getListItems().get(0));
        }
        return listType;
    }


    private void setValue(DynamicValueType dynamicValueType) {
    }

    private static DynamicValueType create(String code, String label) {
        return null;
    }

    public static DynamicMultiSelectListType from(List<DynamicValueType> listItems) {
        DynamicMultiSelectListType dynamicMultiSelectListType = new DynamicMultiSelectListType();
        dynamicMultiSelectListType.listItems = listItems;
        return dynamicMultiSelectListType;
    }

    public static DynamicMultiSelectListType from(List<DynamicValueType> selectListItems, DynamicMultiSelectListType original) {
        DynamicMultiSelectListType dynamicMultiSelectListType = DynamicMultiSelectListType.from(selectListItems);

        if (original == null) {
            return dynamicMultiSelectListType;
        }

        Optional<DynamicValueType> selectedValue = DynamicMultiSelectListType.getSelectedValue(original);
        if (selectedValue.isPresent()) {
            //when selectListItems contains the original value - full match, i.e. code & label
            List<DynamicValueType> originalCodeAndLabelItems = getListItemsWithOriginalCodeAndLabel(selectListItems,
                    selectedValue.get());
            if (!originalCodeAndLabelItems.isEmpty()) {
                dynamicMultiSelectListType.setValue(original.getValue());
                return dynamicMultiSelectListType;
            }

            //when selectListItems contains the original value - partial match, i.e. code only
            List<DynamicValueType> listWithOnlyOriginalCode = getListItemsWithOnlyOriginalCode(selectListItems,
                    selectedValue.get());
            if (!listWithOnlyOriginalCode.isEmpty()) {
                selectedValue.get().setLabel(listWithOnlyOriginalCode.get(0).getLabel());
                dynamicMultiSelectListType.setValue(original.getValue());
                return dynamicMultiSelectListType;
            }

            //when selectListItems does not contain the original value
            boolean itemsListHasNoOriginalValue = dynamicMultiSelectListType.listItems.stream()
                    .noneMatch(i -> i.getCode().equals(selectedValue.get().getCode()));
            if (itemsListHasNoOriginalValue) {
                return recreateDynamicMultiSelectListType(dynamicMultiSelectListType.listItems,
                        selectedValue.get(), original.getValue());
            }
        }
        return dynamicMultiSelectListType;
    }

    private DynamicValueType getValue() {
        return null;
    }

    private static DynamicMultiSelectListType recreateDynamicMultiSelectListType(List<DynamicValueType> currentListItems,
                                                                                 DynamicValueType selectedValue,
                                                                                 DynamicValueType originalValue) {
        DynamicValueType existingDynamicValueType = new DynamicValueType();
        existingDynamicValueType.setCode(selectedValue.getCode());
        existingDynamicValueType.setLabel(selectedValue.getLabel());
        List<DynamicValueType> transferListItems = new ArrayList<>(currentListItems);
        transferListItems.add(existingDynamicValueType);
        DynamicMultiSelectListType newDynamicMultiSelectListType = DynamicMultiSelectListType.from(transferListItems);
        newDynamicMultiSelectListType.setValue(originalValue);
        return newDynamicMultiSelectListType;
    }

    private static List<DynamicValueType> getListItemsWithOriginalCodeAndLabel(List<DynamicValueType> items,
                                                                               DynamicValueType selectedValue) {
        return items.stream().filter(i -> i.getCode().equals(selectedValue.getCode())
                && i.getLabel().equals(selectedValue.getLabel())).collect(Collectors.toList());
    }

    private static List<DynamicValueType> getListItemsWithOnlyOriginalCode(List<DynamicValueType> items,
                                                                           DynamicValueType selectedValue) {
        return items.stream().filter(i -> i.getCode().equals(selectedValue.getCode())
                && !i.getLabel().equals(selectedValue.getLabel())).collect(Collectors.toList());
    }

    public DynamicMultiSelectListType(List<DynamicValueType> values) {
        this.value = values;
    }

    public DynamicMultiSelectListType() {
    }

    public static Optional<DynamicValueType> getSelectedValue(DynamicMultiSelectListType dynamicMultiSelectListType) {
        return dynamicMultiSelectListType != null ? Optional.ofNullable(dynamicMultiSelectListType.getValue()) : Optional.empty();
    }

//    public static Optional<String> getSelectedLabel(DynamicMultiSelectListType dynamicMultiSelectListType) {
//        if (dynamicMultiSelectListType != null && dynamicMultiSelectListType.getValue() != null) {
//            return Optional.of(dynamicMultiSelectListType.getSelectedLabel());
//        } else {
//            return Optional.empty();
//        }
//    }

//    public String getSelectedLabel() {
//        return values != null ? values.getLabel() : null;
//    }
//
//    public String getSelectedCode() {
//        return values != null ? values.getCode() : null;
//    }

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
