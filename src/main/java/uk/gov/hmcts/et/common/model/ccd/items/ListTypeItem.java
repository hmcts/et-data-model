package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class ListTypeItem<T> extends ArrayList<GenericTypeItem<T>> {
    public static <T> ListTypeItem<T> from(GenericTypeItem<T> value) {
        ListTypeItem<T> typeItem = new ListTypeItem<>();
        typeItem.add(value);
        return typeItem;
    }
    
    public static <T> ListTypeItem<T> from(T value) {
        ListTypeItem<T> typeItem = new ListTypeItem<>();
        typeItem.add(GenericTypeItem.from(value));
        return typeItem;
    }

    public static <T> ListTypeItem<T> from(T value, String id) {
        ListTypeItem<T> typeItem = new ListTypeItem<>();
        typeItem.add(GenericTypeItem.from(id, value));
        return typeItem;
    }

    @SafeVarargs
    public static <T> ListTypeItem<T> from(T...values) {
        return Arrays.stream(values)
                .map(GenericTypeItem::from)
                .collect(Collectors.toCollection(ListTypeItem::new));
    }

    @SafeVarargs
    public static <T> ListTypeItem<T> from(GenericTypeItem<T>...values) {
        return Arrays.stream(values).collect(Collectors.toCollection(ListTypeItem::new));
    }

    @SafeVarargs
    public static <T> ListTypeItem<T> concat(ListTypeItem<T>...values) {
        return Stream.of(values)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(ListTypeItem::new));
    }

    public static <T> List<GenericTypeItem<T>> toGenericTypeItemList(ListTypeItem<T> listTypeItem) {
        if (CollectionUtils.isEmpty(listTypeItem)) {
            return null;
        }
        List<GenericTypeItem<T>> list = new ArrayList<>();
        for (var item : listTypeItem) {
            list.add(GenericTypeItem.from(item.getId(), item.getValue()));
        }
        return list;
    }

    public static<T,E extends Item<T>>List<E> toValueList(ListTypeItem<T> listTypeItem, Class<E> clazz)
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if (CollectionUtils.isEmpty(listTypeItem)) {
            return null;
        }
        List<E> list = new ArrayList<>();
        for (var item : listTypeItem) {
            E obj = clazz.getDeclaredConstructor().newInstance();
            obj.setId(item.getId());
            obj.setValue(item.getValue());
            list.add(obj);
        }
        return list;
    }
}
