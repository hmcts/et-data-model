package uk.gov.hmcts.et.common.model.hmc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ListAssistCaseStatus {
    AWAITING_LISTING("Awaiting Listing"),
    CASE_CLOSED("Case Closed"),
    CASE_CREATED("Case Created"),
    HEARING_COMPLETED("Hearing Completed"),
    LISTED("Listed"),
    PENDING_RELISTING("Pending Relisting");

    public final String label;
}
