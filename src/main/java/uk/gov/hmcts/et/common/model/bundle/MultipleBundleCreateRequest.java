package uk.gov.hmcts.et.common.model.bundle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import uk.gov.hmcts.et.common.model.multiples.MultipleDetails;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value
@Builder(toBuilder = true)
@Jacksonized
public class MultipleBundleCreateRequest {
    @JsonProperty("caseTypeId")
    public String caseTypeId;
    @JsonProperty("jurisdictionId")
    public String jurisdictionId;
    @JsonProperty("multipleDetails")
    public MultipleDetails multipleDetails;
}
