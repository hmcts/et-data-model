package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import uk.gov.hmcts.et.common.model.ccd.Address;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Jacksonized
@Builder
public class OrganisationsResponse {
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "organisationIdentifier")
    private String organisationIdentifier;
    @JsonProperty(value = "contactInformation")
    private List<OrganisationAddress> contactInformation;
}