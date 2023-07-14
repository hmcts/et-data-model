package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PartyRelationshipType {

    SOLICITOR("11"),
    INTERPRETER("12");

    @JsonValue
    private final String relationshipTypeCode;

}