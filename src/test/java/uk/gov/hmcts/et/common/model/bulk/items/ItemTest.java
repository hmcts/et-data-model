package uk.gov.hmcts.et.common.model.bulk.items;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uk.gov.hmcts.et.common.model.ccd.items.GenericTypeItem;

public class ItemTest {
    @Test
    public void shouldForwardToGenericTypeItemFrom() {
        GenericTypeItem<String> from = GenericTypeItem.from("foo");
        Assertions.assertTrue(from.getId().matches("[0-9a-f]{8}-([0-9a-f]{4}-){3}[0-9a-f]{12}"));
        Assertions.assertEquals("foo", from.getValue());
    }

    @Test
    public void shouldForwardToGenericTypeItemFromWithId() {
        GenericTypeItem<String> from = GenericTypeItem.from("1", "foo");
        Assertions.assertEquals("1", from.getId());
        Assertions.assertEquals("foo", from.getValue());
    }
}
