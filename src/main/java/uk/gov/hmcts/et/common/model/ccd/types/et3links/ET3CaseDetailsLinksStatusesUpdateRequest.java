package uk.gov.hmcts.et.common.model.ccd.types.et3links;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class ET3CaseDetailsLinksStatusesUpdateRequest {

    @JsonProperty("caseId")
    private String caseId;
    @JsonProperty("caseTypeId")
    private String caseTypeId;
    @JsonProperty("et3CaseDetailsLinksStatuses")
    private ET3CaseDetailsLinksStatuses et3CaseDetailsLinksStatuses;

}
