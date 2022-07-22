package uk.gov.hmcts.et.common.model.listing.items;

import org.junit.Test;
import uk.gov.hmcts.et.common.model.listing.types.BFDateType;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class BFDateTypeItemComparatorTest {
    @Test
    public void shouldSortBfDateTypeItemsInAscendingOrder() {
        var bfDateType = new BFDateType();
        bfDateType.setBroughtForwardEnteredDate("2019-12-08");
        bfDateType.setBroughtForwardDate("2019-12-08");
        bfDateType.setBroughtForwardDateReason("test one");
        var bfDateTypeItem = new BFDateTypeItem();
        bfDateTypeItem.setId("123");
        bfDateTypeItem.setValue(bfDateType);
        List<BFDateTypeItem> bfDateTypeItems = new ArrayList<>();
        bfDateTypeItems.add(bfDateTypeItem);

        var bfDateType2 = new BFDateType();
        bfDateType2.setBroughtForwardEnteredDate("2019-12-08");
        bfDateType2.setBroughtForwardDate("2019-10-25");
        bfDateType2.setBroughtForwardDateReason("test one");
        var bfDateTypeItem2 = new BFDateTypeItem();
        bfDateTypeItem2.setId("456");
        bfDateTypeItem2.setValue(bfDateType2);
        bfDateTypeItems.add(bfDateTypeItem2);

        var bfDateType3 = new BFDateType();
        bfDateType3.setBroughtForwardEnteredDate("2019-12-08");
        bfDateType3.setBroughtForwardDate("2019-12-17");
        bfDateType3.setBroughtForwardDateReason("test one");
        var bfDateTypeItem3 = new BFDateTypeItem();
        bfDateTypeItem3.setId("789");
        bfDateTypeItem3.setValue(bfDateType3);
        bfDateTypeItems.add(bfDateTypeItem3);

        bfDateTypeItems.sort(new BFDateTypeItemComparator());

        var firstBFDateTypeItem = bfDateTypeItems.get(0).getValue();
        assertEquals(bfDateType2.getBroughtForwardDate(), firstBFDateTypeItem.getBroughtForwardDate());
        var secondBFDateTypeItem = bfDateTypeItems.get(1).getValue();
        assertEquals(bfDateType.getBroughtForwardDate(), secondBFDateTypeItem.getBroughtForwardDate());
        var thirdBFDateTypeItem = bfDateTypeItems.get(2).getValue();
        assertEquals(bfDateType3.getBroughtForwardDate(), thirdBFDateTypeItem.getBroughtForwardDate());
    }
}
