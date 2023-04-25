package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import uk.gov.hmcts.et.common.model.ccd.Address;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Jacksonized
@Builder
public class Organisation {
    @JsonProperty("OrganisationID")
    private String organisationID;
    @JsonProperty("OrganisationName")
    private String organisationName;
    @JsonProperty("OrganisationAddress")
    private Address organisationAddress;
}