package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class HearingDetailType {
    @JsonProperty("hearingDetailsDate")
    private String hearingDetailsDate;
    @JsonProperty("hearingDetailsStatus")
    private String hearingDetailsStatus;
    @JsonProperty("hearingDetailsPostponedBy")
    private String hearingDetailsPostponedBy;
    @JsonProperty("hearingDetailsCaseDisposed")
    private String hearingDetailsCaseDisposed;
    @JsonProperty("hearingDetailsPartHeard")
    private String hearingDetailsPartHeard;
    @JsonProperty("hearingDetailsReservedJudgment")
    private String hearingDetailsReservedJudgment;
    @JsonProperty("hearingDetailsAttendeeClaimant")
    private String hearingDetailsAttendeeClaimant;
    @JsonProperty("hearingDetailsAttendeeNonAttendees")
    private String hearingDetailsAttendeeNonAttendees;
    @JsonProperty("hearingDetailsAttendeeRespNoRep")
    private String hearingDetailsAttendeeRespNoRep;
    @JsonProperty("hearingDetailsAttendeeRespAndRep")
    private String hearingDetailsAttendeeRespAndRep;
    @JsonProperty("hearingDetailsAttendeeRepOnly")
    private String hearingDetailsAttendeeRepOnly;
    @JsonProperty("hearingDetailsTimingStart")
    private String hearingDetailsTimingStart;
    @JsonProperty("hearingDetailsTimingBreak")
    private String hearingDetailsTimingBreak;
    @JsonProperty("hearingDetailsTimingResume")
    private String hearingDetailsTimingResume;
    @JsonProperty("hearingDetailsTimingFinish")
    private String hearingDetailsTimingFinish;
    @JsonProperty("hearingDetailsTimingDuration")
    private String hearingDetailsTimingDuration;
    @JsonProperty("hearingDetailsHearingNotes2")
    private String hearingDetailsHearingNotes2;
}
