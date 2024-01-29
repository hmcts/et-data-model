package uk.gov.hmcts.et.common.model.listing;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListingDataTest {

    @Test
    void testHasListingVenueReturnsTrue() {
        var listingData = new ListingData();
        listingData.setListingVenue(new DynamicFixedListType("value"));

        assertTrue(listingData.hasListingVenue());
    }

    @Test
    void testHasListingVenueReturnsFalseWhenSelectedValueIsNull() {
        var listingData = new ListingData();
        listingData.setListingVenue(new DynamicFixedListType());

        assertFalse(listingData.hasListingVenue());
    }

    @Test
    void testHasListingVenueReturnsFalseWhenPropertyIsNull() {
        var listingData = new ListingData();
        listingData.setListingVenue(null);

        assertFalse(listingData.hasListingVenue());
    }
}
