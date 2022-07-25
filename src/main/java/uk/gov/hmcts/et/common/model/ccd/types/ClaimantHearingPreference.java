package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ClaimantHearingPreference {
    @JsonProperty("hearing_preferences")
    private List<String> hearingPreferences;
    @JsonProperty("hearing_assistance")
    private String hearingAssistance;
    @JsonProperty("reasonable_adjustments")
    private String reasonableAdjustments;
    @JsonProperty("reasonable_adjustments_detail")
    private String reasonableAdjustmentsDetail;
}