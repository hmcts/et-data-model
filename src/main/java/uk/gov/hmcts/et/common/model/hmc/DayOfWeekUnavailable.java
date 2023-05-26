package uk.gov.hmcts.et.common.model.hmc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Locale;

@Getter
@RequiredArgsConstructor
public enum DayOfWeekUnavailable {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    public final String label;

    public static DayOfWeekUnavailable getByLabel(String label) {
        return Arrays.stream(DayOfWeekUnavailable.values())
                .filter(eachDow -> eachDow.toString().toLowerCase(Locale.ROOT)
                        .equals(label.toLowerCase(Locale.ROOT))).findAny().orElse(null);
    }
}
