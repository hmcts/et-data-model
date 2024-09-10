package uk.gov.hmcts.et.common.model.ccd.types.et3links;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ET3HubLinksStatusesUpdateRequestTest {

    public static final String TEST_CASE_ID = "test case id";
    public static final String TEST_CASE_TYPE_ID = "test case type id";

    @Test
    void testET3HubLinksStatusesUpdateRequestType() {

        ET3HubLinksStatusesUpdateRequest eT3HubLinksStatusesUpdateRequest =
                ET3HubLinksStatusesUpdateRequest.builder().build();

        assertTrue(StringUtils.isBlank(eT3HubLinksStatusesUpdateRequest.getCaseId()));
        assertTrue(StringUtils.isBlank(eT3HubLinksStatusesUpdateRequest.getCaseTypeId()));
        assertTrue(ObjectUtils.isEmpty(eT3HubLinksStatusesUpdateRequest.getEt3HubLinksStatuses()));

        ET3HubLinksStatusesUpdateRequest et3ET3HubLinksStatusesUpdateRequestNotEmpty =
                ET3HubLinksStatusesUpdateRequest
                        .builder()
                        .caseId(TEST_CASE_ID)
                        .caseTypeId(TEST_CASE_TYPE_ID)
                        .et3HubLinksStatuses(new ET3HubLinksStatuses())
                        .build();

        assertTrue(StringUtils.isNotBlank(et3ET3HubLinksStatusesUpdateRequestNotEmpty.getCaseId()));
        assertTrue(StringUtils.isNotBlank(et3ET3HubLinksStatusesUpdateRequestNotEmpty.getCaseTypeId()));
        assertTrue(ObjectUtils.isNotEmpty(
                et3ET3HubLinksStatusesUpdateRequestNotEmpty.getEt3HubLinksStatuses()));

    }

}
