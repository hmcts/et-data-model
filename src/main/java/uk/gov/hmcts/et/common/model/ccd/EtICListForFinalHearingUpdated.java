package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtICListForFinalHearingUpdated {
    @JsonProperty("etICTypeOfFinalHearingV2")
    private List<String> etICTypeOfFinalHearing;
    @JsonProperty("etICLengthOfFinalHearingV2")
    private String etICLengthOfFinalHearing;
    @JsonProperty("finalHearingLengthNumTypeV2")
    private String finalHearingLengthNumType;
    @JsonProperty("etICFinalHearingIsEJSitAlone")
    private String etICFinalHearingIsEJSitAlone;
    @JsonProperty("etICFinalHearingIsEJSitAloneReason")
    private String etICFinalHearingIsEJSitAloneReason;
    @JsonProperty("etICFinalHearingIsEJSitAloneReasonEW")
    private List<String> etICFinalHearingIsEJSitAloneReasonEW;
    @JsonProperty("etICFinalHearingIsEJSitAloneFurtherDetails")
    private String etICFinalHearingIsEJSitAloneFurtherDetails;
}
