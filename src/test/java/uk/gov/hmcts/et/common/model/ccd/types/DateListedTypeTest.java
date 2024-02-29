package uk.gov.hmcts.et.common.model.ccd.types;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateListedTypeTest {

    @Test
    void testHasHearingVenue() {
        var dateListedType = new DateListedType();
        assertFalse(dateListedType.hasHearingVenue());

        var dynamicFixedListType = new DynamicFixedListType();
        dateListedType.setHearingVenueDay(dynamicFixedListType);
        assertFalse(dateListedType.hasHearingVenue());

        dynamicFixedListType = new DynamicFixedListType("Venue");
        dateListedType.setHearingVenueDay(dynamicFixedListType);
        assertTrue(dateListedType.hasHearingVenue());
    }

    @Test
    void testHasHearingRoom() {
        var dateListedType = new DateListedType();
        assertFalse(dateListedType.hasHearingRoom());

        var dynamicFixedListType = new DynamicFixedListType();
        dateListedType.setHearingRoom(dynamicFixedListType);
        assertFalse(dateListedType.hasHearingRoom());

        dynamicFixedListType = new DynamicFixedListType("Room");
        dateListedType.setHearingRoom(dynamicFixedListType);
        assertTrue(dateListedType.hasHearingRoom());
    }

    @Test
    void testHasHearingClerk() {
        var dateListedType = new DateListedType();
        assertFalse(dateListedType.hasHearingClerk());

        var dynamicFixedListType = new DynamicFixedListType();
        dateListedType.setHearingClerk(dynamicFixedListType);
        assertFalse(dateListedType.hasHearingClerk());

        dynamicFixedListType = new DynamicFixedListType("Clerk");
        dateListedType.setHearingClerk(dynamicFixedListType);
        assertTrue(dateListedType.hasHearingClerk());
    }
}
