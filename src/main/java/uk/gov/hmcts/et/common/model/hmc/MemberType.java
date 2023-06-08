package uk.gov.hmcts.et.common.model.hmc;

import lombok.Getter;

@Getter
public enum MemberType {

    JUDGE("JUDGE"),
    PANEL_MEMBER("PANEL_MEMBER");

    private final String value;

    MemberType(String value) {
        this.value = value;
    }
}
