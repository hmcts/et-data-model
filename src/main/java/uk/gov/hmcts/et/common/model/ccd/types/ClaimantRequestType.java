package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ClaimantRequestType {
    @JsonProperty("claim_outcome")
    private List<String> claimOutcome;
    @JsonProperty("claimant_compensation_text")
    private String claimantCompensationText;
    @JsonProperty("claimant_compensation_amount")
    private String claimantCompensationAmount;
    @JsonProperty("claimant_tribunal_recommendation")
    private String claimantTribunalRecommendation;
    @JsonProperty("whistleblowing")
    private String whistleblowing;
    @JsonProperty("whistleblowing_authority")
    private String whistleblowingAuthority;
    @JsonProperty("claim_description")
    private String claimDescription;
    @JsonProperty("claim_description_document")
    private UploadedDocumentType claimDescriptionDocument;
    @JsonProperty("discrimination_claims")
    private List<String> discriminationClaims;
    @JsonProperty("pay_claims")
    private List<String> payClaims;
}
