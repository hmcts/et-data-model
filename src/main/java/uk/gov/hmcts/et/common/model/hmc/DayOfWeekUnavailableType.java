package uk.gov.hmcts.et.common.model.hmc;

import lombok.Getter;

import java.util.Arrays;
import java.util.Locale;

@Getter
public enum DayOfWeekUnavailableType {
    AM("AM"),
    PM("PM"),
    ALL("All Day");

    public final String label;

    DayOfWeekUnavailableType(String label) {
        this.label = label;
    }

    public static DayOfWeekUnavailableType getByLabel(String label) {
        if (label == null) {
            throw new IllegalArgumentException("unsupported type for unavailability type");
        }
        DayOfWeekUnavailableType dowUnavailable = Arrays.stream(DayOfWeekUnavailableType.values())
                .filter(eachDowUnavailable -> eachDowUnavailable.getLabel().toLowerCase(Locale.ROOT)
                        .equals(label.toLowerCase(Locale.ROOT))).findAny()
                .orElseThrow(() -> new IllegalArgumentException("unsupported type for unavailability type"));
        return dowUnavailable;
    }

}
