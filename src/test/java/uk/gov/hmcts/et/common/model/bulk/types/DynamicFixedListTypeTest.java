package uk.gov.hmcts.et.common.model.bulk.types;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;

public class DynamicFixedListTypeTest {

    @Test
    public void testGetSelectedLabel() {
        DynamicFixedListType dynamicFixedListType = create(null);
        assertNull(dynamicFixedListType.getSelectedLabel());
        dynamicFixedListType = create(new DynamicValueType("code1", "label1"));
        assertThat(dynamicFixedListType.getSelectedLabel(), is(equalTo("label1")));
    }

    @Test
    public void testGetSelectedCode() {
        DynamicFixedListType dynamicFixedListType = create(null);
        assertNull(dynamicFixedListType.getSelectedCode());
        dynamicFixedListType = create(new DynamicValueType("code1", "label1"));
        assertThat(dynamicFixedListType.getSelectedCode(), is(equalTo("code1")));
    }

    @Test
    public void testIsValidCodeForList() {
        DynamicFixedListType dynamicFixedListType = create(null);
        assertThat(dynamicFixedListType.isValidCodeForList("code1"), is(true));
        assertThat(dynamicFixedListType.isValidCodeForList("code2"), is(true));
        assertThat(dynamicFixedListType.isValidCodeForList("code3"), is(true));
        assertThat(dynamicFixedListType.isValidCodeForList("code4"), is(true));
        assertThat(dynamicFixedListType.isValidCodeForList(null), is(false));
        assertThat(dynamicFixedListType.isValidCodeForList(""), is(false));
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
        assertThat(dynamicFixedListType.getValue(), is(equalTo(original.getValue())));
    }

    @Test
    public void testFromWithOriginalWithSelectedValue() {
        List<DynamicValueType> listItems = createListItems();
        DynamicFixedListType original = DynamicFixedListType.of(new DynamicValueType("code2", "Code 2"));
        DynamicFixedListType dynamicFixedListType = DynamicFixedListType.from(listItems, original);
        verifyListItems(dynamicFixedListType);
        assertThat(dynamicFixedListType.getListItems(), hasSize(3));
        assertThat(dynamicFixedListType.getValue().getCode(), is(equalTo("code2")));
        assertThat(dynamicFixedListType.getValue().getLabel(), is(equalTo("Code 2")));
    }

    @Test
    public void testFromWithOriginalWithSelectedValueWrongLabel() {
        List<DynamicValueType> listItems = createListItems();
        DynamicFixedListType original = DynamicFixedListType.of(new DynamicValueType("code2", "Code X"));
        DynamicFixedListType dynamicFixedListType = DynamicFixedListType.from(listItems, original);
        verifyListItems(dynamicFixedListType);
        assertThat(dynamicFixedListType.getValue().getCode(), is(equalTo("code2")));
        assertThat(dynamicFixedListType.getValue().getLabel(), is(equalTo("Code 2")));
    }

    private DynamicFixedListType create(DynamicValueType selectedValue) {
        DynamicFixedListType dynamicFixedListType = new DynamicFixedListType();
        dynamicFixedListType.setListItems(List.of(
            new DynamicValueType("code1", "label1"),
            new DynamicValueType("code2", "label2"),
            new DynamicValueType("code3", "label3"),
            new DynamicValueType("code4", "label4")));
        dynamicFixedListType.setValue(selectedValue);
        return dynamicFixedListType;
    }

    private  List<DynamicValueType> createListItems() {
        return List.of(DynamicValueType.create("code1", "Code 1"),
            DynamicValueType.create("code2", "Code 2"),
            DynamicValueType.create("code3", "Code 3"));
    }

    private void verifyListItems(DynamicFixedListType dynamicFixedListType) {
        assertThat(dynamicFixedListType.getListItems().get(0).getCode(), is(equalTo("code1")));
        assertThat(dynamicFixedListType.getListItems().get(0).getLabel(), is(equalTo("Code 1")));
        assertThat(dynamicFixedListType.getListItems().get(1).getCode(), is(equalTo("code2")));
        assertThat(dynamicFixedListType.getListItems().get(1).getLabel(), is(equalTo("Code 2")));
        assertThat(dynamicFixedListType.getListItems().get(2).getCode(), is(equalTo("code3")));
        assertThat(dynamicFixedListType.getListItems().get(2).getLabel(), is(equalTo("Code 3")));
    }
}
