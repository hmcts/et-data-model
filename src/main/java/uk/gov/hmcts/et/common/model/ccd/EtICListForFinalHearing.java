package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtICListForFinalHearing {
    @JsonProperty("etICTypeOfFinalHearing")
    private String etICTypeOfFinalHearing;
    @JsonProperty("etICLengthOfFinalHearing")
    private String etICLengthOfFinalHearing;
}
