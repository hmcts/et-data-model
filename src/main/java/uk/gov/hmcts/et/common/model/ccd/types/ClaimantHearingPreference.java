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
    @JsonProperty("contact_language")
    private String contactLanguage;
    @JsonProperty("hearing_language")
    private String hearingLanguage;
    @JsonProperty("claimant_hearing_panel_preference")
    private String claimantHearingPanelPreference;
    @JsonProperty("claimant_hearing_panel_preference_why")
    private String claimantHearingPanelPreferenceWhy;
}