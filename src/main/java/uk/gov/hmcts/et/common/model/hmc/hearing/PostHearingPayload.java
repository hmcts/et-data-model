package uk.gov.hmcts.et.common.model.hmc.hearing;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.hmc.CaseDetails;
import uk.gov.hmcts.et.common.model.hmc.HearingDetails;
import uk.gov.hmcts.et.common.model.hmc.PartyDetails;
import uk.gov.hmcts.et.common.model.hmc.RequestDetailsPost;
import uk.gov.hmcts.et.common.model.hmc.ValidationError;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostHearingPayload {
    @NotNull(message = ValidationError.INVALID_REQUEST_DETAILS)
    private RequestDetailsPost requestDetails;

    @Valid
    @NotNull(message = ValidationError.INVALID_HEARING_DETAILS)
    private HearingDetails hearingDetails;

    @Valid
    @NotNull(message = ValidationError.INVALID_CASE_DETAILS)
    private CaseDetails caseDetails;

    @Valid
    private List<PartyDetails> partyDetails;
}
