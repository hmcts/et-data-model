package uk.gov.hmcts.et.common.model.hmc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrganisationDetails {

    @NotEmpty(message = ValidationError.NAME_NULL_EMPTY)
    @Size(max = 2000, message = ValidationError.NAME_MAX_LENGTH)
    private String name;

    @NotEmpty(message = ValidationError.ORGANISATION_TYPE_NULL_EMPTY)
    @Size(max = 60, message = ValidationError.ORGANISATION_TYPE_MAX_LENGTH)
    private String organisationType;

    @Size(max = 60, message = ValidationError.CFT_ORG_ID_MAX_LENGTH)
    private String cftOrganisationID;
}
