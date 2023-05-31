package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CaseHearing {
    @JsonProperty("hearingID")
    @Size(max = 60)
    @NotNull
    private String hearingId;

    @NotNull
    private LocalDateTime hearingRequestDateTime;

    @Size(max = 60)
    @NotNull
    private String hearingType;

    @Size(max = 60)
    @NotNull
    private String hmcStatus;

    @NotNull
    private LocalDateTime lastResponseReceivedDateTime;

    @NotNull
    private Integer responseVersion;

    @Size(max = 60)
    @NotNull
    private String hearingListingStatus;

    @Size(max = 60)
    @NotNull
    private String listAssistCaseStatus;

    private Boolean hearingIsLinkedFlag;

    @Size(max = 30)
    private String hearingGroupRequestId;

    @NotNull
    private List<HearingDaySchedule> hearingDaySchedule;
}
