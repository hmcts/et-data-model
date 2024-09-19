package uk.gov.hmcts.et.common.model.ccd.types.et3links;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ET3CaseDetailsLinksStatusesUpdateRequestTest {

    public static final String TEST_CASE_ID = "test case id";
    public static final String TEST_CASE_TYPE_ID = "test case type id";

    @Test
    void testET3CaseDetailsLinksStatusesUpdateRequestType() {

        ET3CaseDetailsLinksStatusesUpdateRequest et3CaseDetailsLinksStatusesUpdateRequestEmpty =
                ET3CaseDetailsLinksStatusesUpdateRequest.builder().build();

        assertTrue(StringUtils.isBlank(et3CaseDetailsLinksStatusesUpdateRequestEmpty.getCaseId()));
        assertTrue(StringUtils.isBlank(et3CaseDetailsLinksStatusesUpdateRequestEmpty.getCaseTypeId()));
        assertTrue(ObjectUtils.isEmpty(et3CaseDetailsLinksStatusesUpdateRequestEmpty.getEt3CaseDetailsLinksStatuses()));

        ET3CaseDetailsLinksStatusesUpdateRequest et3CaseDetailsLinksStatusesUpdateRequestNotEmpty =
                ET3CaseDetailsLinksStatusesUpdateRequest
                        .builder()
                        .caseId(TEST_CASE_ID)
                        .caseTypeId(TEST_CASE_TYPE_ID)
                        .et3CaseDetailsLinksStatuses(new ET3CaseDetailsLinksStatuses())
                        .build();

        assertTrue(StringUtils.isNotBlank(et3CaseDetailsLinksStatusesUpdateRequestNotEmpty.getCaseId()));
        assertTrue(StringUtils.isNotBlank(et3CaseDetailsLinksStatusesUpdateRequestNotEmpty.getCaseTypeId()));
        assertTrue(ObjectUtils.isNotEmpty(
                et3CaseDetailsLinksStatusesUpdateRequestNotEmpty.getEt3CaseDetailsLinksStatuses()));

    }

}
