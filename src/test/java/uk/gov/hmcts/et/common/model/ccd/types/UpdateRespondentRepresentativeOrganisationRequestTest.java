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

public class UpdateRespondentRepresentativeOrganisationRequestTest {

    private static final String UPDATE_RESPONDENT_REPRESENTATIVE_ORGANISATION_REQUEST_FILE_PATH =
            "update-respondent-representative-organisation-request.json";

    @Test
    @SneakyThrows
    void testUpdateRespondentRepresentativeOrganisationRequestModel() {
        UpdateRespondentRepresentativeOrganisationRequest updateRespondentRepresentativeOrganisationRequest =
                generateUpdateRespondentRepresentativeOrganisationRequest();
        assertTrue(ObjectUtils.isNotEmpty(updateRespondentRepresentativeOrganisationRequest));
        assertEquals(UpdateRespondentRepresentativeOrganisationRequestTestConstants.ORGANISATION_TO_ADD_ORGANISATION_ID,
                updateRespondentRepresentativeOrganisationRequest.getChangeOrganisationRequest()
                        .getOrganisationToAdd().getOrganisationID());
        assertEquals(
                UpdateRespondentRepresentativeOrganisationRequestTestConstants.ORGANISATION_TO_ADD_ORGANISATION_NAME,
                updateRespondentRepresentativeOrganisationRequest.getChangeOrganisationRequest()
                        .getOrganisationToAdd().getOrganisationName());
        assertEquals(
                UpdateRespondentRepresentativeOrganisationRequestTestConstants.ORGANISATION_TO_REMOVE_ORGANISATION_ID,
                updateRespondentRepresentativeOrganisationRequest.getChangeOrganisationRequest()
                        .getOrganisationToRemove().getOrganisationID());
        assertEquals(
                UpdateRespondentRepresentativeOrganisationRequestTestConstants.ORGANISATION_TO_REMOVE_ORGANISATION_NAME,
                updateRespondentRepresentativeOrganisationRequest.getChangeOrganisationRequest()
                        .getOrganisationToRemove().getOrganisationName());
        assertEquals(UpdateRespondentRepresentativeOrganisationRequestTestConstants.CASE_ROLE_ID,
                updateRespondentRepresentativeOrganisationRequest.getChangeOrganisationRequest()
                        .getCaseRoleId().getSelectedCode());
        assertEquals(UpdateRespondentRepresentativeOrganisationRequestTestConstants.APPROVAL_STATUS,
                updateRespondentRepresentativeOrganisationRequest.getChangeOrganisationRequest()
                        .getApprovalStatus().toString());
        assertEquals(UpdateRespondentRepresentativeOrganisationRequestTestConstants.RESPONDENT_NAME,
                updateRespondentRepresentativeOrganisationRequest.getRespondentName());
    }

    private static UpdateRespondentRepresentativeOrganisationRequest
        generateUpdateRespondentRepresentativeOrganisationRequest() throws IOException, URISyntaxException {
        String json = new String(Files.readAllBytes(Paths.get(Objects.requireNonNull(Thread.currentThread()
                .getContextClassLoader().getResource(
                        UPDATE_RESPONDENT_REPRESENTATIVE_ORGANISATION_REQUEST_FILE_PATH)).toURI())));
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, UpdateRespondentRepresentativeOrganisationRequest.class);
    }
}
