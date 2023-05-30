package uk.gov.hmcts.et.common.model.hmc;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@SuperBuilder
@Data
@NoArgsConstructor
public class RelatedParty {
    @NotEmpty(message = ValidationError.RELATED_PARTY_EMPTY)
    @Size(max = 15, message = ValidationError.RELATED_PARTY_MAX_LENGTH)
    private String relatedPartyID;

    @NotEmpty(message = ValidationError.RELATIONSHIP_TYPE_EMPTY)
    @Size(max = 10, message = ValidationError.RELATIONSHIP_TYPE_MAX_LENGTH)
    private String relationshipType;
}
