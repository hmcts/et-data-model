package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SuperBuilder
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
