package uk.gov.hmcts.et.common.model.hmc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Locale;

@Getter
@RequiredArgsConstructor
public enum PartyType {

    IND("IND"),
    ORG("ORG");

    public final String label;

    public static PartyType getByLabel(String label) {
        return Arrays.stream(PartyType.values())
                .filter(eachPartyType -> eachPartyType.toString().toLowerCase(Locale.ROOT)
                        .equals(label.toLowerCase(Locale.ROOT))).findAny().orElse(null);
    }
}
