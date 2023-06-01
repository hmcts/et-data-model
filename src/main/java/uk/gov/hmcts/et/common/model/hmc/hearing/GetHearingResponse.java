package uk.gov.hmcts.et.common.model.hmc.hearing;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.hmc.CaseDetails;
import uk.gov.hmcts.et.common.model.hmc.HearingDetails;
import uk.gov.hmcts.et.common.model.hmc.HearingResponse;
import uk.gov.hmcts.et.common.model.hmc.PartyDetails;
import uk.gov.hmcts.et.common.model.hmc.RequestDetailsGet;
import uk.gov.hmcts.et.common.model.hmc.ValidationError;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetHearingResponse {
    @NotNull(message = ValidationError.INVALID_REQUEST_DETAILS)
    private RequestDetailsGet requestDetails;

    @Valid
    @NotNull(message = ValidationError.INVALID_HEARING_DETAILS)
    private HearingDetails hearingDetails;

    @Valid
    @NotNull(message = ValidationError.INVALID_CASE_DETAILS)
    private CaseDetails caseDetails;

    @Valid
    private List<PartyDetails> partyDetails;

    @Valid
    private HearingResponse hearingResponse;
}
