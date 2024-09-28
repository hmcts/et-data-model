package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import uk.gov.hmcts.et.common.model.ccd.types.RespondentSumType;


/**
 * Model to update or submit ET3 form
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@EqualsAndHashCode(callSuper = false)
public class Et3Request {

    @JsonProperty("caseId")
    private String caseId;
    @JsonProperty("requestType")
    private String requestType;
    @JsonProperty("caseType")
    private String caseType;
    @JsonProperty("respondent")
    private RespondentSumType respondentSumType;
}
