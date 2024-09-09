package uk.gov.hmcts.et.common.model.ccd.types.et3hub;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ET3RespondentHubLinksStatusesUpdateRequestTest {

    private static final String TEST_CASE_TYPE_ID = "ET_EnglandWales";
    private static final String TEST_CASE_REFERENCE = "12345";

    @Test
    void testET3HubLinksStatusesUpdateRequestBuilder() {
        ET3HubLinksStatusesUpdateRequest et3HubLinksStatusesUpdateRequest =
                ET3HubLinksStatusesUpdateRequest.builder().build();
        assertTrue(StringUtils.isBlank(et3HubLinksStatusesUpdateRequest.getCaseId()));
        assertTrue(StringUtils.isBlank(et3HubLinksStatusesUpdateRequest.getCaseTypeId()));
        assertTrue(ObjectUtils.isEmpty(et3HubLinksStatusesUpdateRequest.getEt3HubLinksStatuses()));

        ET3HubLinksStatuses et3HubLinksStatuses = new ET3HubLinksStatuses();
        ET3HubLinksStatusesUpdateRequest et3HubLinksStatusesUpdateRequestWithTestData =
                ET3HubLinksStatusesUpdateRequest
                        .builder()
                        .caseTypeId(TEST_CASE_TYPE_ID)
                        .caseId(TEST_CASE_REFERENCE)
                        .et3HubLinksStatuses(et3HubLinksStatuses)
                        .build();
        assertTrue(StringUtils.isNotBlank(et3HubLinksStatusesUpdateRequestWithTestData.getCaseId()));
        assertTrue(StringUtils.isNotBlank(et3HubLinksStatusesUpdateRequestWithTestData.getCaseTypeId()));
        assertTrue(ObjectUtils.isNotEmpty(
                et3HubLinksStatusesUpdateRequestWithTestData.getEt3HubLinksStatuses()));
    }

}
