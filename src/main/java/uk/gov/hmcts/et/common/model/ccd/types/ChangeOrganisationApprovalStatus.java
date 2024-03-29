package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ChangeOrganisationApprovalStatus {

    PENDING("0"),
    APPROVED("1"),
    REJECTED("2");

    final String value;

    ChangeOrganisationApprovalStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
