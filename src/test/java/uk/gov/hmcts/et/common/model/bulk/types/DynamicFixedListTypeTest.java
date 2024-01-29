package uk.gov.hmcts.et.common.model.bulk.types;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class DynamicFixedListTypeTest {

    @Test
    public void testGetSelectedLabel() {
        DynamicFixedListType dynamicFixedListType = create(null);
        assertNull(dynamicFixedListType.getSelectedLabel());
        dynamicFixedListType = create(new DynamicValueType("code1", "label1"));
        assertThat("label1", is(equalTo(dynamicFixedListType.getSelectedLabel())));
    }

    @Test
    public void testGetSelectedCode() {
        DynamicFixedListType dynamicFixedListType = create(null);
        assertNull(dynamicFixedListType.getSelectedCode());
        dynamicFixedListType = create(new DynamicValueType("code1", "label1"));
        assertThat("code1", is(equalTo(dynamicFixedListType.getSelectedCode())));
    }

    @Test
    public void testIsValidCodeForList() {
        DynamicFixedListType dynamicFixedListType = create(null);
        assertTrue(dynamicFixedListType.isValidCodeForList("code1"));
        assertTrue(dynamicFixedListType.isValidCodeForList("code2"));
        assertTrue(dynamicFixedListType.isValidCodeForList("code3"));
        assertFalse(dynamicFixedListType.isValidCodeForList("code4"));
        assertFalse(dynamicFixedListType.isValidCodeForList(null));
        assertFalse(dynamicFixedListType.isValidCodeForList(""));
    }

    @Test
    public void testFromWithNoOriginal() {
        List<DynamicValueType> listItems = createListItems();
        DynamicFixedListType dynamicFixedListType = DynamicFixedListType.from(listItems, null);
        verifyListItems(dynamicFixedListType);
        assertThat(dynamicFixedListType.getListItems(), hasSize(3));
        assertNull(dynamicFixedListType.getValue());
    }

    @Test
    public void testFromWithOriginalNoSelectedValue() {
        List<DynamicValueType> listItems = createListItems();
        DynamicFixedListType original = new DynamicFixedListType();
        DynamicFixedListType dynamicFixedListType = DynamicFixedListType.from(listItems, original);
        verifyListItems(dynamicFixedListType);
        assertThat(dynamicFixedListType.getListItems(), hasSize(3));
        assertNull(dynamicFixedListType.getValue());
    }

    @Test
    public void testFromWithOriginalWithDifferentSelectedValue() {
        List<DynamicValueType> listItems = createListItems();
        DynamicFixedListType original = DynamicFixedListType.of(new DynamicValueType("code4", "Code 4"));
        DynamicFixedListType dynamicFixedListType = DynamicFixedListType.from(listItems, original);
        verifyListItems(dynamicFixedListType);
        assertThat(dynamicFixedListType.getListItems(), hasSize(4));
        assertEquals(original.getValue(), dynamicFixedListType.getValue());
    }

    @Test
    public void testFromWithOriginalWithSelectedValue() {
        List<DynamicValueType> listItems = createListItems();
        DynamicFixedListType original = DynamicFixedListType.of(new DynamicValueType("code2", "Code 2"));
        DynamicFixedListType dynamicFixedListType = DynamicFixedListType.from(listItems, original);
        verifyListItems(dynamicFixedListType);
        assertThat(dynamicFixedListType.getListItems(), hasSize(3));
        assertThat("code2", is(equalTo(dynamicFixedListType.getValue().getCode())));
        assertThat("Code 2", is(equalTo(dynamicFixedListType.getValue().getLabel())));
    }

    @Test
    public void testFromWithOriginalWithSelectedValueWrongLabel() {
        List<DynamicValueType> listItems = createListItems();
        DynamicFixedListType original = DynamicFixedListType.of(new DynamicValueType("code2", "Code X"));
        DynamicFixedListType dynamicFixedListType = DynamicFixedListType.from(listItems, original);
        verifyListItems(dynamicFixedListType);
        assertEquals("code2", dynamicFixedListType.getValue().getCode());
        assertEquals("Code 2", dynamicFixedListType.getValue().getLabel());
    }

    @Test
    public void testFromWithLabelAndCodeAndSelected() {
        DynamicFixedListType listType = DynamicFixedListType.from("label", "code", true);
        assertEquals(1, listType.getListItems().size());
        assertEquals("code", listType.getListItems().get(0).getCode());
        assertEquals("label", listType.getListItems().get(0).getLabel());

        assertEquals("code", listType.getSelectedCode());
        assertEquals("label", listType.getSelectedLabel());
        assertEquals("code", listType.getValue().getCode());
        assertEquals("label", listType.getValue().getLabel());
    }

    @Test
    public void testFromWithLabelAndCodeButNotSelected() {
        DynamicFixedListType listType = DynamicFixedListType.from("label", "code", false);
        assertEquals(1, listType.getListItems().size());
        assertEquals("code", listType.getListItems().get(0).getCode());
        assertEquals("label", listType.getListItems().get(0).getLabel());

        assertNull(listType.getSelectedCode());
        assertNull(listType.getSelectedLabel());
        assertNull(listType.getValue());
    }

    private DynamicFixedListType create(DynamicValueType selectedValue) {
        DynamicFixedListType dynamicFixedListType = new DynamicFixedListType();
        dynamicFixedListType.setListItems(List.of(
                new DynamicValueType("code1", "label1"),
                new DynamicValueType("code2", "label2"),
                new DynamicValueType("code3", "label3")));
        dynamicFixedListType.setValue(selectedValue);
        return dynamicFixedListType;
    }

    private  List<DynamicValueType> createListItems() {
        return List.of(DynamicValueType.create("code1", "Code 1"),
            DynamicValueType.create("code2", "Code 2"),
            DynamicValueType.create("code3", "Code 3"));
    }

    private void verifyListItems(DynamicFixedListType dynamicFixedListType) {
        assertEquals("code1", dynamicFixedListType.getListItems().get(0).getCode());
        assertEquals("Code 1", dynamicFixedListType.getListItems().get(0).getLabel());
        assertEquals("code2", dynamicFixedListType.getListItems().get(1).getCode());
        assertEquals("Code 2", dynamicFixedListType.getListItems().get(1).getLabel());
        assertEquals("code3", dynamicFixedListType.getListItems().get(2).getCode());
        assertEquals("Code 3", dynamicFixedListType.getListItems().get(2).getLabel());
    }
}
