package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Jacksonized
public class OrganisationUsersIdamUser {
    private String userIdentifier;
    private String firstName;
    private String lastName;
    private String email;
    private String idamStatus;
}
