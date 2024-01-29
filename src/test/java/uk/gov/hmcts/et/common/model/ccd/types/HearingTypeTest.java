package uk.gov.hmcts.et.common.model.ccd.types;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HearingTypeTest {

    @Test
    void testHasHearingJudge() {
        var hearingType = new HearingType();
        assertFalse(hearingType.hasHearingJudge());

        var dynamicFixedListType = new DynamicFixedListType();
        hearingType.setJudge(dynamicFixedListType);
        assertFalse(hearingType.hasHearingJudge());

        dynamicFixedListType = new DynamicFixedListType("Judge");
        hearingType.setJudge(dynamicFixedListType);
        assertTrue(hearingType.hasHearingJudge());
    }

    @Test
    void testHasHearingEmployerMember() {
        var hearingType = new HearingType();
        assertFalse(hearingType.hasHearingEmployerMember());

        var dynamicFixedListType = new DynamicFixedListType();
        hearingType.setHearingERMember(dynamicFixedListType);
        assertFalse(hearingType.hasHearingEmployerMember());

        dynamicFixedListType = new DynamicFixedListType("Employer Member");
        hearingType.setHearingERMember(dynamicFixedListType);
        assertTrue(hearingType.hasHearingEmployerMember());
    }

    @Test
    void testHasHearingEmployeeMember() {
        var hearingType = new HearingType();
        assertFalse(hearingType.hasHearingEmployeeMember());

        var dynamicFixedListType = new DynamicFixedListType();
        hearingType.setHearingEEMember(dynamicFixedListType);
        assertFalse(hearingType.hasHearingEmployeeMember());

        dynamicFixedListType = new DynamicFixedListType("Employee Member");
        hearingType.setHearingEEMember(dynamicFixedListType);
        assertTrue(hearingType.hasHearingEmployeeMember());
    }
}