package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtInitialConsiderationRule28 {
    @JsonProperty("etICRule28ClaimToBe")
    private String etICRule28ClaimToBe;
    @JsonProperty("etICRule28WhichPart")
    private String etICRule28WhichPart;
    @JsonProperty("etICRule28DirectionReason")
    private String etICRule28DirectionReason;
    @JsonProperty("etICRule28NumberOfDays")
    private String etICRule28NumberOfDays;
}
