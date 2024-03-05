package uk.gov.hmcts.et.common.model.listing.items;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.et.common.model.listing.types.BFDateType;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BFDateTypeItemComparatorTest {

    @Test
    void shouldSortBfDateTypeItemsInAscendingOrder() {
        BFDateType bfDateType = new BFDateType();
        bfDateType.setBroughtForwardEnteredDate("2019-12-08");
        bfDateType.setBroughtForwardDate("2019-12-08");
        bfDateType.setBroughtForwardDateReason("test one");
        BFDateTypeItem bfDateTypeItem = new BFDateTypeItem();
        bfDateTypeItem.setId("123");
        bfDateTypeItem.setValue(bfDateType);
        List<BFDateTypeItem> bfDateTypeItems = new ArrayList<>();
        bfDateTypeItems.add(bfDateTypeItem);

        BFDateType bfDateType2 = new BFDateType();
        bfDateType2.setBroughtForwardEnteredDate("2019-12-08");
        bfDateType2.setBroughtForwardDate("2019-10-25");
        bfDateType2.setBroughtForwardDateReason("test one");
        BFDateTypeItem bfDateTypeItem2 = new BFDateTypeItem();
        bfDateTypeItem2.setId("456");
        bfDateTypeItem2.setValue(bfDateType2);
        bfDateTypeItems.add(bfDateTypeItem2);

        BFDateType bfDateType3 = new BFDateType();
        bfDateType3.setBroughtForwardEnteredDate("2019-12-08");
        bfDateType3.setBroughtForwardDate("2019-12-17");
        bfDateType3.setBroughtForwardDateReason("test one");
        BFDateTypeItem bfDateTypeItem3 = new BFDateTypeItem();
        bfDateTypeItem3.setId("789");
        bfDateTypeItem3.setValue(bfDateType3);
        bfDateTypeItems.add(bfDateTypeItem3);

        bfDateTypeItems.sort(new BFDateTypeItemComparator());

        BFDateType firstBFDateTypeItem = bfDateTypeItems.get(0).getValue();
        assertEquals(bfDateType2.getBroughtForwardDate(), firstBFDateTypeItem.getBroughtForwardDate());
        BFDateType secondBFDateTypeItem = bfDateTypeItems.get(1).getValue();
        assertEquals(bfDateType.getBroughtForwardDate(), secondBFDateTypeItem.getBroughtForwardDate());
        BFDateType thirdBFDateTypeItem = bfDateTypeItems.get(2).getValue();
        assertEquals(bfDateType3.getBroughtForwardDate(), thirdBFDateTypeItem.getBroughtForwardDate());
    }
}
