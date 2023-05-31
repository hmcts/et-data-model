package uk.gov.hmcts.et.common.model.hmc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum RequirementType {
    MUSTINC("MUSTINC"),
    OPTINC("OPTINC"),
    EXCLUDE("EXCLUDE");

    public final String label;
}
