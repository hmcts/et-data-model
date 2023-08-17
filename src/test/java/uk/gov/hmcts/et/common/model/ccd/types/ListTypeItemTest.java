package uk.gov.hmcts.et.common.model.ccd.types;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.et.common.model.ccd.items.TypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.ListTypeItem;

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
        ListTypeItem<String> listTypeItem = ListTypeItem.from(TypeItem.from("1234", "str"));

        assertEquals(1, listTypeItem.size());
        assertEquals("str", listTypeItem.get(0).getValue());
        assertEquals("1234", listTypeItem.get(0).getId());
    }

    @Test
    void from_varargsGenericTypeItem() {
        ListTypeItem<String> listTypeItem = ListTypeItem.from(TypeItem.from("1"), TypeItem.from("2"));

        assertEquals(2, listTypeItem.size());
        assertEquals("1", listTypeItem.get(0).getValue());
        assertEquals("2", listTypeItem.get(1).getValue());
        assertNotNull(listTypeItem.get(0).getId());
        assertNotNull(listTypeItem.get(1).getId());
    }

    @Test
    void concat_varargsListTypeItem() {
        ListTypeItem<String> listOne = ListTypeItem.from(TypeItem.from("1"), TypeItem.from("2"));
        ListTypeItem<String> listTwo = ListTypeItem.from(TypeItem.from("3"), TypeItem.from("4"));

        ListTypeItem<String> actual = ListTypeItem.concat(listOne, listTwo);

        assertEquals(4, actual.size());
        assertEquals("1", actual.get(0).getValue());
        assertEquals("2", actual.get(1).getValue());
        assertEquals("3", actual.get(2).getValue());
        assertEquals("4", actual.get(3).getValue());
    }
}
