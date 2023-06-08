package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.hmc.validator.EnumPattern;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyDetails {
    @NotEmpty(message = ValidationError.PARTY_DETAILS_NULL_EMPTY)
    @Size(max = 40, message = ValidationError.PARTY_DETAILS_MAX_LENGTH)
    private String partyID;

    @NotEmpty(message = ValidationError.PARTY_TYPE_EMPTY)
    @EnumPattern(enumClass = PartyType.class, fieldName = "partyType")
    private String partyType;

    @NotEmpty(message = ValidationError.PARTY_ROLE_EMPTY)
    // Max has changed over the hmc-cft-hearing-service repo - but confluence states 6
    @Size(max = 6, message = ValidationError.PARTY_ROLE_MAX_LENGTH)
    private String partyRole;

    @Valid
    private IndividualDetails individualDetails;

    @Valid
    private OrganisationDetails organisationDetails;

    @JsonProperty("unavailabilityDOW")
    @Valid
    private List<UnavailabilityDow> unavailabilityDow;

    @Valid
    private List<UnavailabilityRanges> unavailabilityRanges;

    @NotEmpty(message = ValidationError.PARTY_NAME_NULL_EMPTY)
    @Size(max = 40)
    private String partyName;

    private String hearingsSubChannel;
}
