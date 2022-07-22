package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtIcudlHearing {
    @JsonProperty("etICEJSitAlone")
    private String etIcejSitAlone;
    @JsonProperty("etICUDLGiveReasons")
    private List<String> etIcudlGiveReasons;
    @JsonProperty("etICUDLDisputeOnFacts")
    private String etIcudlDisputeOnFacts;
    @JsonProperty("etICUDLLittleOrNoAgreement")
    private String etIcudlLittleOrNoAgreement;
    @JsonProperty("etICUDLIssueOfLawArising")
    private String etIcudlIssueOfLawArising;
    @JsonProperty("etICUDLViewsOfParties")
    private String etIcudlViewsOfParties;
    @JsonProperty("etICUDLNoViewsExpressedByParties")
    private String etIcudlNoViewsExpressedByParties;
    @JsonProperty("etICUDLConcurrentProceedings")
    private String etIcudlConcurrentProceedings;
    @JsonProperty("etICUDLOther")
    private String etIcudlOther;
    @JsonProperty("etICUDLHearFormat")
    private String etIcudlHearFormat;
    @JsonProperty("etICUDLCVPIssue")
    private List<String> etIcudlCvpIssue;
    @JsonProperty("etICUDLFinalF2FIssue")
    private List<String> etIcudlFinalF2FIssue;
    @JsonProperty("etICBUCheckComplianceOrders")
    private String etIcbuCheckComplianceOrders;
}
