package uk.gov.hmcts.et.common.model.hmc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ListingReasonCode {
    NO_MAPPING_AVAILABLE("no-mapping-available"),
    USER_ADDED_COMMENTS("user-added-comments");

    private final String label;

    @Override
    public String toString() {
        return label;
    }
}
