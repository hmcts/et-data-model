package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ClaimantHearingPreference {

    @JsonProperty("hearing_video")
    private String hearingVideo;
    @JsonProperty("hearing_phone")
    private String hearingPhone;
    @JsonProperty("hearing_assistance")
    private String hearingAssistance;
}
