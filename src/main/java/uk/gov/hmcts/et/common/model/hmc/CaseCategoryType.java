package uk.gov.hmcts.et.common.model.hmc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Locale;

@RequiredArgsConstructor
@Getter
public enum CaseCategoryType {
    CASETYPE("caseType"),
    CASESUBTYPE("caseSubType");

    public final String label;

    public static CaseCategoryType getByLabel(String label) {
        return Arrays.stream(CaseCategoryType.values())
                .filter(eachCategory -> eachCategory.toString().toLowerCase(Locale.ROOT)
                        .equals(label.toLowerCase(Locale.ROOT))).findAny().orElse(null);
    }
}
