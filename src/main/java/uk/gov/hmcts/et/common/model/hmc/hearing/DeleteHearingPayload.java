package uk.gov.hmcts.et.common.model.hmc.hearing;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteHearingPayload {
    private List<@Size(max = 100) String> cancellationReasonCodes;
}
