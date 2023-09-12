package uk.gov.hmcts.et.common.model.ccd.types;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class CaseLocation {

    private String baseLocation;

    private String region;
}
