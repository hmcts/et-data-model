package uk.gov.hmcts.et.common.model.hmc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.hmc.validator.EnumPattern;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanelPreference {
    @NotEmpty(message = ValidationError.MEMBER_ID_EMPTY)
    @Size(max = 70, message = ValidationError.MEMBER_ID_MAX_LENGTH)
    private String memberID;

    @Size(max = 70, message = ValidationError.MEMBER_TYPE_MAX_LENGTH)
    private String memberType;

    @EnumPattern(enumClass = RequirementType.class, fieldName = "requirementType")
    private String requirementType;
}
