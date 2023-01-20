package uk.gov.hmcts.et.common.model.ccd.bundle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import uk.gov.hmcts.et.common.model.ccd.CaseDetails;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value
@Builder(toBuilder = true)
public class BundleCreateRequest {
    @JsonProperty("caseTypeId")
    public String caseTypeId;
    @JsonProperty("jurisdictionId")
    public String jurisdictionId;
    @JsonProperty("case_details")
    public CaseDetails caseDetails;
}
