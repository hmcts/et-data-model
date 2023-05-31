package uk.gov.hmcts.et.common.model.hmc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PartyType {
    IND("IND"),
    ORG("ORG");

    public final String label;
}
