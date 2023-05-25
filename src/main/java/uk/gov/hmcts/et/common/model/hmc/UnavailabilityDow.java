package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.hmc.validator.CapitalizedEnum;

@Data
@NoArgsConstructor
public class UnavailabilityDow {

    @JsonProperty("DOW")
    @CapitalizedEnum(enumClass = DayOfWeekUnavailable.class, fieldName = "dow")
    private String dow;

    @JsonProperty("DOWUnavailabilityType")
    private String dowUnavailabilityType;

}
