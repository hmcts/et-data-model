package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtICSeekComments {
    @JsonProperty("etICTypeOfCvpHearing")
    private String etICTypeOfCvpHearing;
    @JsonProperty("etICFinalHearingDetails")
    private String etICFinalHearingDetails;
    @JsonProperty("etICPrelimHearingDetails")
    private String etICPrelimHearingDetails;
}
