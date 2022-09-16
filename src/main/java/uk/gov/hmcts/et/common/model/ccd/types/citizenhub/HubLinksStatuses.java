package uk.gov.hmcts.et.common.model.ccd.types.citizenhub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class HubLinksStatuses {
    @JsonProperty("personalDetails")
    private String personalDetails;
    @JsonProperty("et1ClaimForm")
    private String et1ClaimForm;
    @JsonProperty("respondentResponse")
    private String respondentResponse;
    @JsonProperty("hearingDetails")
    private String hearingDetails;
    @JsonProperty("requestsAndApplications")
    private String requestsAndApplications;
    @JsonProperty("respondentApplications")
    private String respondentApplications;
    @JsonProperty("contactTribunal")
    private String contactTribunal;
    @JsonProperty("tribunalOrders")
    private String tribunalOrders;
    @JsonProperty("tribunalJudgements")
    private String tribunalJudgements;
    @JsonProperty("documents")
    private String documents;
}
