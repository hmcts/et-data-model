package uk.gov.hmcts.et.common.model.hmc.hearing;

import java.util.List;
import javax.validation.constraints.Size;

public class HearingDeletePayload {
    private List<@Size(max = 100) String> cancellationReasonCodes;
}
