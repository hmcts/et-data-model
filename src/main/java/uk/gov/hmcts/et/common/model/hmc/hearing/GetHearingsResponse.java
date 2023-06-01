package uk.gov.hmcts.et.common.model.hmc.hearing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.hmc.CaseHearing;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetHearingsResponse {
    @JsonProperty("hmctsServiceCode")
    private String hmctsServiceCode;

    private String caseRef;

    @Valid
    @NotNull
    private List<CaseHearing> caseHearings;
}
