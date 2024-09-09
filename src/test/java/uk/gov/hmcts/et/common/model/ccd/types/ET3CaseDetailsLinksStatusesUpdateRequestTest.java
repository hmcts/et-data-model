package uk.gov.hmcts.et.common.model.ccd.types;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import uk.gov.hmcts.et.common.model.ccd.types.responsehub.ET3CaseDetailsLinksStatuses;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ET3CaseDetailsLinksStatusesUpdateRequestTest {

    private static final String TEST_CASE_TYPE_ID = "ET_EnglandWales";
    private static final String TEST_CASE_REFERENCE = "12345";

    @Test
    void testET3CaseDetailsLinksStatusesUpdateRequestBuilder() {
        ET3CaseDetailsLinksStatusesUpdateRequest et3CaseDetailsLinksStatusesUpdateRequest =
                ET3CaseDetailsLinksStatusesUpdateRequest.builder().build();
        assertTrue(StringUtils.isBlank(et3CaseDetailsLinksStatusesUpdateRequest.getCaseId()));
        assertTrue(StringUtils.isBlank(et3CaseDetailsLinksStatusesUpdateRequest.getCaseTypeId()));
        assertTrue(ObjectUtils.isEmpty(et3CaseDetailsLinksStatusesUpdateRequest.getEt3CaseDetailsLinksStatuses()));

        ET3CaseDetailsLinksStatuses et3CaseDetailsLinksStatuses = new ET3CaseDetailsLinksStatuses();
        ET3CaseDetailsLinksStatusesUpdateRequest et3CaseDetailsLinksStatusesUpdateRequestWithTestData =
                ET3CaseDetailsLinksStatusesUpdateRequest
                        .builder()
                        .caseTypeId(TEST_CASE_TYPE_ID)
                        .caseId(TEST_CASE_REFERENCE)
                        .et3CaseDetailsLinksStatuses(et3CaseDetailsLinksStatuses)
                        .build();
        assertTrue(StringUtils.isNotBlank(et3CaseDetailsLinksStatusesUpdateRequestWithTestData.getCaseId()));
        assertTrue(StringUtils.isNotBlank(et3CaseDetailsLinksStatusesUpdateRequestWithTestData.getCaseTypeId()));
        assertTrue(ObjectUtils.isNotEmpty(
                et3CaseDetailsLinksStatusesUpdateRequestWithTestData.getEt3CaseDetailsLinksStatuses()));
    }

}
