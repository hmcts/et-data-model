package uk.gov.hmcts.et.common.model.hmc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PartyType {

    IND("IND"),
    ORG("ORG");

    public final String label;

}
