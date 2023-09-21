package uk.gov.hmcts.et.common.model.ccd.items;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class GenericTypeItem<T> extends Item<T> {

    public static <T> GenericTypeItem<T> from(T value) {
        return new GenericTypeItem<>(Item.from(value));
    }

    public static <T> GenericTypeItem<T> from(String id, T value) {
        return new GenericTypeItem<>(Item.from(id, value));
    }

    private GenericTypeItem(Item<T> item) {
        this.setId(item.getId());
        this.setValue(item.getValue());
    }

    public GenericTypeItem() {
        super();
    }
}