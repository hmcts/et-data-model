package uk.gov.hmcts.et.common.model.hmc;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.hmc.validator.EnumPattern;

import javax.validation.constraints.NotEmpty;

@SuperBuilder
@Data
@NoArgsConstructor
public class HearingLocation {

    @EnumPattern(enumClass = LocationType.class, fieldName = "locationType")
    private String locationType;

    @NotEmpty(message = ValidationError.LOCATION_ID_EMPTY)
    private String locationId;

}
