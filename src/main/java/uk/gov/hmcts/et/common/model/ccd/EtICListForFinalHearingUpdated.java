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
    @JsonProperty("etICTypeOfVideoHearingOrder")
    private String etICTypeOfVideoHearingOrder;
    @JsonProperty("etICTypeOfF2fHearingOrder")
    private String etICTypeOfF2fHearingOrder;
    @JsonProperty("etICLengthOfFinalHearingV2")
    private String etICLengthOfFinalHearing;
    @JsonProperty("finalHearingLengthNumTypeV2")
    private String finalHearingLengthNumType;
    @JsonProperty("etICFinalHearingIsEJSitAlone")
    private String etICFinalHearingIsEJSitAlone;
    @JsonProperty("etICFinalHearingIsEJSitAloneReason")
    private String etICFinalHearingIsEJSitAloneReason;
    @JsonProperty("etICFinalHearingIsEJSitAloneFurtherDetails")
    private String etICFinalHearingIsEJSitAloneFurtherDetails;
}
