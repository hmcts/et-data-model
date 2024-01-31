package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtICListForFinalHearing {
    @JsonProperty("etICTypeOfFinalHearing")
    private List<String> etICTypeOfFinalHearing;
    @JsonProperty("etICLengthOfFinalHearing")
    private String etICLengthOfFinalHearing;
    @JsonProperty("finalHearingLengthNumType")
    private String finalHearingLengthNumType;
}
