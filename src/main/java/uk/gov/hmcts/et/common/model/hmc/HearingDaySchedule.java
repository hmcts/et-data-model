package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HearingDaySchedule {
    @NotNull
    private LocalDateTime hearingStartDateTime;

    @NotNull
    private LocalDateTime hearingEndDateTime;

    @JsonProperty("listAssistSessionID")
    @Size(max = 60)
    @NotNull
    private String listAssistSessionId;

    @Size(max = 60)
    @NotNull
    private String hearingVenueId;

    @Size(max = 60)
    @NotNull
    private String hearingRoomId;

    @Size(max = 60)
    private String hearingJudgeId;

    private List<@Size(max = 60)String> panelMemberIds;

    @Valid
    @NotNull
    private List<Attendee> attendees;
}
