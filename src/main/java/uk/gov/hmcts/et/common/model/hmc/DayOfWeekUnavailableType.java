package uk.gov.hmcts.et.common.model.hmc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum DayOfWeekUnavailableType {
    AM("AM"),
    PM("PM"),
    ALL("All Day");

    public final String label;
}
