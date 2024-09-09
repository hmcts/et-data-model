package uk.gov.hmcts.et.common.model.ccd.types.et3hub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ET3HubLinksStatuses {
    @JsonProperty("contactDetails")
    private String contactDetails;
    @JsonProperty("employeeDetails")
    private String employeeDetails;
    @JsonProperty("payPensionBenefitDetails")
    private String payPensionBenefitDetails;
    @JsonProperty("contestClaim")
    private String contestClaim;
    @JsonProperty("checkYorAnswers")
    private String checkYorAnswers;
}
