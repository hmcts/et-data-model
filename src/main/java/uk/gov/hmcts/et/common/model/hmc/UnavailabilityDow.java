package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.hmc.validator.EnumPattern;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UnavailabilityDow {
    @JsonProperty("DOW")
    @EnumPattern(enumClass = DayOfWeekUnavailable.class, fieldName = "dow")
    private String dow;

    @JsonProperty("DOWUnavailabilityType")
    @EnumPattern(enumClass = DayOfWeekUnavailableType.class, fieldName = "dowUnavailabilityType")
    private String dowUnavailabilityType;
}
