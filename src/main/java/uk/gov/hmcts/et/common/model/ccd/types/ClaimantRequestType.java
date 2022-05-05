package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ClaimantRequestType {
    @JsonProperty("claimant_compensation")
    private String claimantCompensation;
    @JsonProperty("claimant_tribunal")
    private String claimantTribunal;
    @JsonProperty("claimant_old_job")
    private String claimantOldJob;
    @JsonProperty("claimant_another_job")
    private String claimantAnotherJob;
    @JsonProperty("claimant_compensation_amount")
    private String claimantCompensationAmount;
    @JsonProperty("claimant_tribunal_recommendation")
    private String claimantTribunalRecommendation;
}
