package uk.gov.hmcts.et.common.model.ccd.types.citizenhub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class HubLinks {
    @JsonProperty("personalDetails")
    private HubLink personalDetails;
    @JsonProperty("et1ClaimForm")
    private HubLink et1ClaimForm;
    @JsonProperty("respondentResponse")
    private HubLink respondentResponse;
    @JsonProperty("hearingDetails")
    private HubLink hearingDetails;
    @JsonProperty("requestsAndApplications")
    private HubLink requestsAndApplications;
    @JsonProperty("respondentApplications")
    private HubLink respondentApplications;
    @JsonProperty("contactTribunal")
    private HubLink contactTribunal;
    @JsonProperty("tribunalOrders")
    private HubLink tribunalOrders;
    @JsonProperty("tribunalJudgements")
    private HubLink tribunalJudgements;
    @JsonProperty("documents")
    private HubLink documents;
}
