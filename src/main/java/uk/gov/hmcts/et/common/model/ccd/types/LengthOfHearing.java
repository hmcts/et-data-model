package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class LengthOfHearing {
    @JsonProperty("lengthOfHearingDays")
    private  String lengthOfHearingDays;
    @JsonProperty("lengthOfHearingHours")
    private  String lengthOfHearingHours;
    @JsonProperty("lengthOfHearingDays")
    private  String lengthOfHearingMinutes;
}
