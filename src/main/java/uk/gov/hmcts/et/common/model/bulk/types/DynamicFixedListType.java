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

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class DynamicFixedListType {

    private DynamicValueType value;
    @JsonProperty("list_items")
    private List<DynamicValueType> listItems;

    public static DynamicFixedListType of(DynamicValueType value) {
        Objects.requireNonNull(value);
        DynamicFixedListType dynamicFixedListType = new DynamicFixedListType();
        dynamicFixedListType.value = value;
        return dynamicFixedListType;
    }

    public static DynamicFixedListType from(List<DynamicValueType> listItems) {
        DynamicFixedListType dynamicFixedListType = new DynamicFixedListType();
        dynamicFixedListType.listItems = listItems;
        return dynamicFixedListType;
    }

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
        return items.stream().filter(i -> i.getCode().equals(selectedValue.getCode())
            && i.getLabel().equals(selectedValue.getLabel())).collect(Collectors.toList());
    }

    private static List<DynamicValueType> getListItemsWithOnlyOriginalCode(List<DynamicValueType> items,
                                                                           DynamicValueType selectedValue) {
        return items.stream().filter(i -> i.getCode().equals(selectedValue.getCode())
            && !i.getLabel().equals(selectedValue.getLabel())).collect(Collectors.toList());
    }

    public DynamicFixedListType(String value) {
        this.value = new DynamicValueType(value, value);
    }

    public DynamicFixedListType() {
    }

    public static Optional<DynamicValueType> getSelectedValue(DynamicFixedListType dynamicFixedListType) {
        return dynamicFixedListType != null ? Optional.ofNullable(dynamicFixedListType.getValue()) : Optional.empty();
    }

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
