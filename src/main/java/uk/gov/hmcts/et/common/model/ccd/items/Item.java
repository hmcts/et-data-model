package uk.gov.hmcts.et.common.model.ccd.items;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Item<T> extends GenericTypeItem<T> {

    public static <T> Item<T> from(T value) {
        return new Item<>(GenericTypeItem.from(value));
    }

    public static <T> Item<T> from(String id, T value) {
        return new Item<>(GenericTypeItem.from(id, value));
    }

    private Item(GenericTypeItem<T> item) {
        this.setId(item.getId());
        this.setValue(item.getValue());
    }

    public Item() {
        super();
    }
}