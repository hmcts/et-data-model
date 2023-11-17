package uk.gov.hmcts.et.common.model.ccd.types;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.et.common.model.ccd.items.GenericTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.ListTypeItem;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ListTypeItemTest {
    @Test
    void from_singularWithId() {
        Object obj = new Object();
        ListTypeItem<Object> listTypeItem = ListTypeItem.from(obj, "1234");

        assertEquals(1, listTypeItem.size());
        assertEquals(obj, listTypeItem.get(0).getValue());
        assertEquals("1234", listTypeItem.get(0).getId());
    }

    @Test
    void from_singularWithoutId() {
        Object obj = new Object();
        ListTypeItem<Object> listTypeItem = ListTypeItem.from(obj);

        assertEquals(1, listTypeItem.size());
        assertEquals(obj, listTypeItem.get(0).getValue());
        assertNotNull(listTypeItem.get(0).getId());
    }

    @Test
    void from_varargs() {
        Object obj = new Object();
        Object obj2 = new Object();
        ListTypeItem<Object> listTypeItem = ListTypeItem.from(obj, obj2);

        assertEquals(2, listTypeItem.size());
        assertEquals(obj, listTypeItem.get(0).getValue());
        assertEquals(obj2, listTypeItem.get(1).getValue());
        assertNotEquals(listTypeItem.get(0).getValue(), listTypeItem.get(1).getValue());
        assertNotNull(listTypeItem.get(0).getId());
        assertNotNull(listTypeItem.get(1).getId());
    }

    @Test
    void from_singularGenericTypeItem() {
        ListTypeItem<String> listTypeItem = ListTypeItem.from(GenericTypeItem.from("1234", "str"));

        assertEquals(1, listTypeItem.size());
        assertEquals("str", listTypeItem.get(0).getValue());
        assertEquals("1234", listTypeItem.get(0).getId());
    }

    @Test
    void from_varargsGenericTypeItem() {
        ListTypeItem<String> listTypeItem = ListTypeItem.from(GenericTypeItem.from("1"), GenericTypeItem.from("2"));

        assertEquals(2, listTypeItem.size());
        assertEquals("1", listTypeItem.get(0).getValue());
        assertEquals("2", listTypeItem.get(1).getValue());
        assertNotNull(listTypeItem.get(0).getId());
        assertNotNull(listTypeItem.get(1).getId());
    }

    @Test
    void from_stream() {
        ListTypeItem<String> string = ListTypeItem.from(Stream.of(GenericTypeItem.from("first"),
                GenericTypeItem.from("second")));

        assertEquals(2, string.size());
        assertEquals("first", string.get(0).getValue());
        assertEquals("second", string.get(1).getValue());
    }

    @Test
    void concat_varargsListTypeItem() {
        ListTypeItem<String> listOne = ListTypeItem.from(GenericTypeItem.from("1"), GenericTypeItem.from("2"));
        ListTypeItem<String> listTwo = ListTypeItem.from(GenericTypeItem.from("3"), GenericTypeItem.from("4"));

        ListTypeItem<String> actual = ListTypeItem.concat(listOne, listTwo);

        assertEquals(4, actual.size());
        assertEquals("1", actual.get(0).getValue());
        assertEquals("2", actual.get(1).getValue());
        assertEquals("3", actual.get(2).getValue());
        assertEquals("4", actual.get(3).getValue());
    }
}
