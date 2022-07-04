package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtICListForPreliminaryHearing {
    @JsonProperty("etICTypeOfPreliminaryHearing")
    private String etICTypeOfPreliminaryHearing;
    @JsonProperty("etICPurposeOfPreliminaryHearing")
    private String etICPurposeOfPreliminaryHearing;
    @JsonProperty("etICGiveDetailsOfHearingNotice")
    private String etICGiveDetailsOfHearingNotice;
    @JsonProperty("etICLengthOfPrelimHearing")
    private String etICLengthOfPrelimHearing;
}
