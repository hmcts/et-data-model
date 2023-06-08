package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HearingWindow {
    @JsonProperty("dateRangeStart")
    private LocalDate dateRangeStart;

    @JsonProperty("dateRangeEnd")
    private LocalDate dateRangeEnd;

    @JsonProperty("firstDateTimeMustBe")
    private LocalDateTime firstDateTimeMustBe;
}
