package uk.gov.hmcts.et.common.model.hmc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Locale;

@Getter
@RequiredArgsConstructor
public enum RequirementType {
    MUSTINC("MUSTINC"),
    OPTINC("OPTINC"),
    EXCLUDE("EXCLUDE");

    public final String label;

    public static RequirementType getByLabel(String label) {
        return Arrays.stream(RequirementType.values())
                .filter(eachRequirement -> eachRequirement.toString().toLowerCase(Locale.ROOT)
                        .equals(label.toLowerCase(Locale.ROOT))).findAny().orElse(null);
    }
}
