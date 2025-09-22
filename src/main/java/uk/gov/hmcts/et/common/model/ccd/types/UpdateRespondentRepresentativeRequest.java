package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRespondentRepresentativeRequest {
    @JsonProperty("ChangeOrganisationRequest")
    private ChangeOrganisationRequest changeOrganisationRequest;
    @JsonProperty("RespondentName")
    private String respondentName;
}
