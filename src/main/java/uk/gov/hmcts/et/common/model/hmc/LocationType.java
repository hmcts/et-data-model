package uk.gov.hmcts.et.common.model.hmc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Locale;

@Getter
@RequiredArgsConstructor
public enum LocationType {
    COURT("court"),
    CLUSTER("cluster"),
    REGION("region");

    public final String label;

    public static LocationType getByLabel(String label) {
        return Arrays.stream(LocationType.values())
                .filter(eachLocation -> eachLocation.toString().toLowerCase(Locale.ROOT)
                        .equals(label.toLowerCase(Locale.ROOT))).findAny().orElse(null);
    }
}
