package uk.gov.hmcts.et.common.model.hmc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Locale;

@Getter
@RequiredArgsConstructor
public enum DayOfWeekUnavailableType {
    AM("AM"),
    PM("PM"),
    ALL("All Day");

    public final String label;

    public static DayOfWeekUnavailableType getByLabel(String label) {
        if (label == null) {
            throw new IllegalArgumentException("unsupported type for unavailability type");
        }

        return Arrays.stream(DayOfWeekUnavailableType.values())
                .filter(eachDowUnavailable -> eachDowUnavailable.getLabel().toLowerCase(Locale.ROOT)
                        .equals(label.toLowerCase(Locale.ROOT))).findAny()
                .orElseThrow(() -> new IllegalArgumentException("unsupported type for unavailability type"));
    }
}
