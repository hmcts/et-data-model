package uk.gov.hmcts.et.common.model.hmc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum LocationType {
    COURT("court"),
    CLUSTER("cluster"),
    REGION("region");

    public final String label;
}
