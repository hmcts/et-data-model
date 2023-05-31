package uk.gov.hmcts.et.common.model.hmc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ListingStatus {
    DRAFT("Draft"),
    PROVISIONAL("Provisional"),
    FIXED("Fixed");

    public final String label;
}
