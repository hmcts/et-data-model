package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganisationUsersResponse {
    private String organisationIdentifier;
    private List<OrganisationUsersIdamUser> users;
}
