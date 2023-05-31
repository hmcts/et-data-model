package uk.gov.hmcts.et.common.model.hmc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CaseCategoryType {
    CASETYPE("caseType"),
    CASESUBTYPE("caseSubType");

    public final String label;
}
