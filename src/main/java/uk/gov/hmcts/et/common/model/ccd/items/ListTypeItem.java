package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class ListTypeItem<T> extends ArrayList<TypeItem<T>> {
    public static <T> ListTypeItem<T> from(TypeItem<T> value) {
        ListTypeItem<T> typeItem = new ListTypeItem<>();
        typeItem.add(value);
        return typeItem;
    }
    
    public static <T> ListTypeItem<T> from(T value) {
        ListTypeItem<T> typeItem = new ListTypeItem<>();
        typeItem.add(TypeItem.from(value));
        return typeItem;
    }

    public static <T> ListTypeItem<T> from(T value, String id) {
        ListTypeItem<T> typeItem = new ListTypeItem<>();
        typeItem.add(TypeItem.from(id, value));
        return typeItem;
    }

    @SafeVarargs
    public static <T> ListTypeItem<T> from(T...values) {
        return Arrays.stream(values)
                .map(TypeItem::from)
                .collect(Collectors.toCollection(ListTypeItem::new));
    }

    @SafeVarargs
    public static <T> ListTypeItem<T> from(TypeItem<T>...values) {
        return Arrays.stream(values).collect(Collectors.toCollection(ListTypeItem::new));
    }

    @SafeVarargs
    public static <T> ListTypeItem<T> concat(ListTypeItem<T>...values) {
        return Stream.of(values)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(ListTypeItem::new));
    }
}
