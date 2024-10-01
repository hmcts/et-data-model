package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtICDoNotListHearing {
    @JsonProperty("etICDoNotListHearingDirections")
    private String etICDoNotListHearingDirections;
}
