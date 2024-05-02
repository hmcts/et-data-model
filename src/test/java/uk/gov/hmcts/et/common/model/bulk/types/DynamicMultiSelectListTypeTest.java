package uk.gov.hmcts.et.common.model.bulk.types;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicMultiSelectListTypeTest {



//    @Test
//    void testGetSelectedLabel() {
//        DynamicMultiSelectListType dynamicMultiSelectListType = create(null);
//        assertNull(dynamicMultiSelectListType.getSelectedLabel());
//
//        dynamicMultiSelectListType = create(List.of(new DynamicValueType("code1", "label1")));
//        assertThat("label1", is(equalTo(dynamicMultiSelectListType.getSelectedLabels().get(0))));
//    }
//
//
//    @Test
//    void testGetSelectedCode() {
//        DynamicMultiSelectListType dynamicMultiSelectListType = create(null);
//        assertNull(dynamicMultiSelectListType.getSelectedCodes().get(0));
//
//        dynamicMultiSelectListType = create(List.of(new DynamicValueType("code1", "label1")));
//        assertThat("code1", is(equalTo(dynamicMultiSelectListType.getSelectedCodes().get(0))));
//    }
//
//
//
//    @Test
//    void testIsValidCodeForList() {
//        DynamicMultiSelectListType dynamicMultiSelectListType = create(null);
//        assertTrue(dynamicMultiSelectListType.isValidCodeForList("code1"));
//        assertTrue(dynamicMultiSelectListType.isValidCodeForList("code2"));
//        assertTrue(dynamicMultiSelectListType.isValidCodeForList("code3"));
//        assertFalse(dynamicMultiSelectListType.isValidCodeForList("code4"));
//        assertFalse(dynamicMultiSelectListType.isValidCodeForList(null));
//        assertFalse(dynamicMultiSelectListType.isValidCodeForList(""));
//    }
//
//
//    private DynamicMultiSelectListType create(List<DynamicValueType> selectedValues) {
//        DynamicMultiSelectListType dynamicMultiSelectListType = new DynamicMultiSelectListType();
//        dynamicMultiSelectListType.setListItems(List.of(
//                new DynamicValueTypes("code1", "label1"),
//                new DynamicValueType("code2", "label2"),
//                new DynamicValueType("code3", "label3")));
//        dynamicMultiSelectListType.setSelectedValues(selectedValues);
//        return dynamicMultiSelectListType;
//    }
//
//    private  List<DynamicValueType> createListItems() {
//        return List.of(DynamicValueType.create("code1", "Code 1"),
//                DynamicValueType.create("code2", "Code 2"),
//                DynamicValueType.create("code3", "Code 3"));
//    }
//
//    private void verifyListItems(DynamicMultiSelectListType dynamicMultiSelectListType) {
//        assertEquals("code1", dynamicMultiSelectListType.getListItems().get(0).getCode());
//        assertEquals("Code 1", dynamicMultiSelectListType.getListItems().get(0).getLabel());
//        assertEquals("code2", dynamicMultiSelectListType.getListItems().get(1).getCode());
//        assertEquals("Code 2", dynamicMultiSelectListType.getListItems().get(1).getLabel());
//        assertEquals("code3", dynamicMultiSelectListType.getListItems().get(2).getCode());
//        assertEquals("Code 3", dynamicMultiSelectListType.getListItems().get(2).getLabel());
//    }

}
