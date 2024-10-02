package uk.gov.hmcts.et.common.model.ccd.types.et3links;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ET3CaseDetailsLinksStatuses {

    @JsonProperty("personalDetails")
    private String personalDetails;
    @JsonProperty("et1ClaimForm")
    private String et1ClaimForm;
    @JsonProperty("respondentResponse")
    private String respondentResponse;
    @JsonProperty("hearingDetails")
    private String hearingDetails;
    @JsonProperty("respondentRequestsAndApplications")
    private String respondentRequestsAndApplications;
    @JsonProperty("claimantApplications")
    private String claimantApplications;
    @JsonProperty("contactTribunal")
    private String contactTribunal;
    @JsonProperty("tribunalOrders")
    private String tribunalOrders;
    @JsonProperty("tribunalJudgements")
    private String tribunalJudgements;
    @JsonProperty("documents")
    private String documents;

}
