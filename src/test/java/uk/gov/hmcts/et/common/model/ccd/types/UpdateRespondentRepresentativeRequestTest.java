package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UpdateRespondentRepresentativeRequestTest {

    private static final String UPDATE_RESPONDENT_REPRESENTATIVE_REQUEST_FILE_PATH =
            "update-respondent-representative-request.json";

    @Test
    @SneakyThrows
    void testUpdateRespondentRepresentativeOrganisationRequestModel() {
        UpdateRespondentRepresentativeRequest updateRespondentRepresentativeRequest =
                generateUpdateRespondentRepresentativeRequest();
        assertTrue(ObjectUtils.isNotEmpty(updateRespondentRepresentativeRequest));
        assertEquals(UpdateRespondentRepresentativeRequestTestConstants.TEST_ORGANISATION_TO_ADD_ID,
                updateRespondentRepresentativeRequest.getChangeOrganisationRequest()
                        .getOrganisationToAdd().getOrganisationID());
        assertEquals(
                UpdateRespondentRepresentativeRequestTestConstants.TEST_ORGANISATION_TO_ADD_NAME,
                updateRespondentRepresentativeRequest.getChangeOrganisationRequest()
                        .getOrganisationToAdd().getOrganisationName());
        assertEquals(
                UpdateRespondentRepresentativeRequestTestConstants.TEST_ORGANISATION_TO_REMOVE_ID,
                updateRespondentRepresentativeRequest.getChangeOrganisationRequest()
                        .getOrganisationToRemove().getOrganisationID());
        assertEquals(
                UpdateRespondentRepresentativeRequestTestConstants.TEST_ORGANISATION_TO_REMOVE_NAME,
                updateRespondentRepresentativeRequest.getChangeOrganisationRequest()
                        .getOrganisationToRemove().getOrganisationName());
        assertEquals(UpdateRespondentRepresentativeRequestTestConstants.TEST_CASE_ROLE_ID,
                updateRespondentRepresentativeRequest.getChangeOrganisationRequest()
                        .getCaseRoleId().getSelectedCode());
        assertEquals(UpdateRespondentRepresentativeRequestTestConstants.TEST_APPROVAL_STATUS,
                updateRespondentRepresentativeRequest.getChangeOrganisationRequest()
                        .getApprovalStatus().toString());
        assertEquals(UpdateRespondentRepresentativeRequestTestConstants.TEST_RESPONDENT_NAME,
                updateRespondentRepresentativeRequest.getRespondentName());
    }

    private static UpdateRespondentRepresentativeRequest generateUpdateRespondentRepresentativeRequest()
            throws IOException, URISyntaxException {
        String json = new String(Files.readAllBytes(Paths.get(Objects.requireNonNull(Thread.currentThread()
                .getContextClassLoader().getResource(
                        UPDATE_RESPONDENT_REPRESENTATIVE_REQUEST_FILE_PATH)).toURI())));
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, UpdateRespondentRepresentativeRequest.class);
    }
}
