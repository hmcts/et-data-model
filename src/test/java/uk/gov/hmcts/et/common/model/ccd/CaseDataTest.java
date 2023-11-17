package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import uk.gov.hmcts.et.common.model.ccd.items.GenericTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.ListTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.RepresentedTypeRItem;
import uk.gov.hmcts.et.common.model.ccd.types.ClaimantIndType;
import uk.gov.hmcts.et.common.model.ccd.types.RepresentedTypeR;

import static org.junit.Assert.assertEquals;

public class CaseDataTest {

    private CaseData caseData;

    @Before
    public void setUp() throws Exception {
        String json = "{"
                + " \"caseNotes\" : \"1111\", "
                + " \"positionType\" : \"Single\", "
                + " \"receiptDate\" : \"20 Jan 2019\", "
                + " \"userLocation\" : \"Bath\", "
                + " \"caseType\" : \"Single\", "
                + " \"feeGroupReference\" : \"1212\" "
                + "} ";
        ObjectMapper mapper = new ObjectMapper();
        caseData = mapper.readValue(json, CaseData.class);
    }

    @Test
    public void shouldCreateCaseDataFromJson() {
        assertEquals(caseData.getCaseNotes(), "1111");
        assertEquals(caseData.getPositionType(), "Single");
        assertEquals(caseData.getReceiptDate(), "20 Jan 2019");
        assertEquals(caseData.getUserLocation(), "Bath");
        assertEquals(caseData.getEcmCaseType(), "Single");
        assertEquals(caseData.getFeeGroupReference(), "1212");
    }

    @Test
    public void claimantFullNamesOthersTest() {
        ClaimantIndType claimantIndType = new ClaimantIndType();
        claimantIndType.setClaimantTitle("Other");
        claimantIndType.setClaimantTitleOther("Mx");
        claimantIndType.setClaimantFirstNames("Andy");
        claimantIndType.setClaimantLastName("Brown");
        caseData.setClaimantIndType(claimantIndType);
        assertEquals("Mx A Brown", caseData.getClaimantIndType().claimantFullName());
    }

    @Test
    public void claimantFullNamesTest() {
        ClaimantIndType claimantIndType = new ClaimantIndType();
        claimantIndType.setClaimantTitle("Mr");
        claimantIndType.setClaimantTitleOther("Mx");
        claimantIndType.setClaimantFirstNames("Andy");
        claimantIndType.setClaimantLastName("Brown");
        caseData.setClaimantIndType(claimantIndType);
        assertEquals("Mr A Brown", caseData.getClaimantIndType().claimantFullName());
    }

    @Test
    public void claimantFullNamesPreferredTitleOtherTest() {
        ClaimantIndType claimantIndType = new ClaimantIndType();
        claimantIndType.setClaimantTitle("");
        claimantIndType.setClaimantTitleOther("Mx");
        claimantIndType.setClaimantPreferredTitle("Other");
        claimantIndType.setClaimantFirstNames("Andy");
        claimantIndType.setClaimantLastName("Brown");
        caseData.setClaimantIndType(claimantIndType);
        assertEquals("Mx A Brown", caseData.getClaimantIndType().claimantFullName());
    }

    @Test
    public void claimantFullNamePreferredTitleTest() {
        ClaimantIndType claimantIndType = new ClaimantIndType();
        claimantIndType.setClaimantTitle(" ");
        claimantIndType.setClaimantTitleOther("Mx");
        claimantIndType.setClaimantPreferredTitle("Miss");
        claimantIndType.setClaimantFirstNames("Anna");
        claimantIndType.setClaimantLastName("Hans");
        caseData.setClaimantIndType(claimantIndType);
        assertEquals("Miss A Hans", caseData.getClaimantIndType().claimantFullName());
    }

    @Test
    public void claimantFullNamePreferNotToSayTitleTest() {
        ClaimantIndType claimantIndType = new ClaimantIndType();
        claimantIndType.setClaimantTitle("Prefer not to say");
        claimantIndType.setClaimantFirstNames("Anna");
        claimantIndType.setClaimantLastName("Hans");
        caseData.setClaimantIndType(claimantIndType);
        assertEquals("A Hans", caseData.getClaimantIndType().claimantFullName());
    }

    @Test
    public void claimantFullNamesPreferNotToSayTitleTest() {
        ClaimantIndType claimantIndType = new ClaimantIndType();
        claimantIndType.setClaimantTitle("Prefer not to say");
        claimantIndType.setClaimantFirstNames("Harvey");
        claimantIndType.setClaimantLastName("Karry");
        caseData.setClaimantIndType(claimantIndType);
        assertEquals("Harvey Karry", caseData.getClaimantIndType().claimantFullNames());
    }

    @Test
    public void claimantFullNamesPreferredTitleTest() {
        ClaimantIndType claimantIndType = new ClaimantIndType();
        claimantIndType.setClaimantTitle(" ");
        claimantIndType.setClaimantTitleOther("Mx");
        claimantIndType.setClaimantPreferredTitle("Miss");
        claimantIndType.setClaimantFirstNames("Danna");
        claimantIndType.setClaimantLastName("Summer");
        caseData.setClaimantIndType(claimantIndType);
        assertEquals("Miss Danna Summer", caseData.getClaimantIndType().claimantFullNames());
    }

    @Test
    public void claimantFullNamesPreferNotToSayClaimantPreferredTitleTest() {
        ClaimantIndType claimantIndType = new ClaimantIndType();
        claimantIndType.setClaimantPreferredTitle("Prefer not to say");
        claimantIndType.setClaimantFirstNames("Marcelo");
        claimantIndType.setClaimantLastName("Peter");
        caseData.setClaimantIndType(claimantIndType);
        assertEquals("Marcelo Peter", caseData.getClaimantIndType().claimantFullNames());
    }

    @Test
    public void setRepCollectionAsListTypeItem() {
        RepresentedTypeR representedTypeR = RepresentedTypeR.builder().id("1").build();
        ListTypeItem<RepresentedTypeR> list = ListTypeItem.from(GenericTypeItem.from("id", representedTypeR));

        caseData.setRepCollection(list);
        RepresentedTypeRItem representedTypeRItem = caseData.getRepCollection().get(0);

        assertEquals("id", representedTypeRItem.getId());
        assertEquals(representedTypeR, representedTypeRItem.getValue());
    }
}