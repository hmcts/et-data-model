package uk.gov.hmcts.et.common.model.ccd.types.et3links;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ET3HubLinksStatuses {

    @JsonProperty("contactDetails")
    private String contactDetails;
    @JsonProperty("employerDetails")
    private String employerDetails;
    @JsonProperty("conciliationAndEmployeeDetails")
    private String conciliationAndEmployeeDetails;
    @JsonProperty("payPensionBenefitDetails")
    private String payPensionBenefitDetails;
    @JsonProperty("contestClaim")
    private String contestClaim;
    @JsonProperty("employersContractClaim")
    private String employersContractClaim;
    @JsonProperty("checkYorAnswers")
    private String checkYorAnswers;

}
