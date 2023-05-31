package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.hmc.validator.EnumPattern;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HearingResponse {
    @JsonProperty("listAssistTransactionID")
    @Size(max = 40, message = ValidationError.LIST_ASSIST_TRANSACTION_ID_MAX_LENGTH)
    private String listAssistTransactionID;

    @JsonProperty("receivedDateTime")
    private LocalDateTime receivedDateTime;

    @JsonProperty("responseVersion")
    private Integer responseVersion;

    @JsonProperty("laCaseStatus")
    @EnumPattern(enumClass = ListAssistCaseStatus.class, fieldName = "laCaseStatus")
    private String laCaseStatus;

    @JsonProperty("listingStatus")
    @EnumPattern(enumClass = ListingStatus.class, fieldName = "listingStatus")
    private String listingStatus;

    @JsonProperty("hearingCancellationReason")
    @Size(max = 40, message = ValidationError.HEARING_CANCELLATION_REASON_MAX_LENGTH)
    private String hearingCancellationReason;

    private List<HearingDaySchedule> hearingDaySchedule;
}
