package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TriageQuestions {
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("claimantRepresentedQuestion")
    private String claimantRepresentedQuestion;
    @JsonProperty("caseType")
    private String caseType;
    @JsonProperty("acasMultiple")
    private String acasMultiple;
    @JsonProperty("validNoAcasReason")
    private String validNoAcasReason;
    @JsonProperty("typeOfClaims")
    private List<String> typeOfClaims;
}
