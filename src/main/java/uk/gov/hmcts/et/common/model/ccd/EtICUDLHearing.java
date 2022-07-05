package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtICUDLHearing {
    @JsonProperty("etICEJSitAlone")
    private String etICEJSitAlone;
    @JsonProperty("etICUDLGiveReasons")
    private List<String> etICUDLGiveReasons;
    @JsonProperty("etICUDLDisputeOnFacts")
    private String etICUDLDisputeOnFacts;
    @JsonProperty("etICUDLLittleOrNoAgreement")
    private String etICUDLLittleOrNoAgreement;
    @JsonProperty("etICUDLIssueOfLawArising")
    private String etICUDLIssueOfLawArising;
    @JsonProperty("etICUDLViewsOfParties")
    private String etICUDLViewsOfParties;
    @JsonProperty("etICUDLNoViewsExpressedByParties")
    private String etICUDLNoViewsExpressedByParties;
    @JsonProperty("etICUDLConcurrentProceedings")
    private String etICUDLConcurrentProceedings;
    @JsonProperty("etICUDLOther")
    private String etICUDLOther;
    @JsonProperty("etICUDLHearFormat")
    private String etICUDLHearFormat;
    @JsonProperty("etICUDLCVPIssue")
    private List<String> etICUDLCVPIssue;
    @JsonProperty("etICUDLFinalF2FIssue")
    private List<String> etICUDLFinalF2FIssue;
    @JsonProperty("etICBUCheckComplianceOrders")
    private String etICBUCheckComplianceOrders;
}
