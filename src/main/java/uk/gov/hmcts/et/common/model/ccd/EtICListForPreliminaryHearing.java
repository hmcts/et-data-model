package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.types.LengthOfHearing;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtICListForPreliminaryHearing {
    @JsonProperty("etICTypeOfPreliminaryHearing")
    private List<String> etICTypeOfPreliminaryHearing;
    @JsonProperty("etICPurposeOfPreliminaryHearing")
    private List<String> etICPurposeOfPreliminaryHearing;
    @JsonProperty("etICGiveDetailsOfHearingNotice")
    private String etICGiveDetailsOfHearingNotice;
    @JsonProperty("etICLengthOfPrelimHearing")
    private String etICLengthOfPrelimHearing;
    @JsonProperty("etICLengthOfPrelimHearingDetail")
    private LengthOfHearing etICLengthOfPrelimHearingDetail;
}
