package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDetailsGet {
    @JsonProperty("versionNumber")
    @NotNull(message = ValidationError.VERSION_NUMBER_NULL_EMPTY)
    private Integer versionNumber;

    @JsonProperty("hearingRequestID")
    @Size(max = 30)
    @NotNull
    private String hearingRequestId;

    @JsonProperty("status")
    // This has changed over hmc-cft-hearing-service (original value was 100)
    @Size(max = 30)
    @NotNull
    private String status;

    @JsonProperty("timeStamp")
    @NotNull
    private LocalDateTime timeStamp;

    @JsonProperty("hearingGroupRequestId")
    @Size(max = 30)
    @NotNull
    private String hearingGroupRequestId;

    @JsonProperty("partiesNotified")
    private LocalDateTime partiesNotifiedDateTime;
}
