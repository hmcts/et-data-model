package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtInitialConsiderationRule27 {
    @JsonProperty("etICRule27ClaimToBe")
    private String etICRule27ClaimToBe;
    @JsonProperty("etICRule27WhichPart")
    private String etICRule27WhichPart;
    @JsonProperty("etICRule27Direction")
    private List<String> etICRule27Direction;
    @JsonProperty("etICRule27DirectionReason")
    private String etICRule27DirectionReason;
    @JsonProperty("etICRule27NoJurisdictionReason")
    private String etICRule27NoJurisdictionReason;
    @JsonProperty("etICRule27NumberOfDays")
    private String etICRule27NumberOfDays;
}
