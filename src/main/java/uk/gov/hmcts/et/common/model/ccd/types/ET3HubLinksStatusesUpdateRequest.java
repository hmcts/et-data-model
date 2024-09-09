package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import uk.gov.hmcts.et.common.model.ccd.types.responsehub.ET3HubLinksStatuses;

@Data
@Builder
@Jacksonized
public class ET3HubLinksStatusesUpdateRequest {

    @JsonProperty("case_id")
    private String caseId;
    @JsonProperty("case_type_id")
    private String caseTypeId;
    @JsonProperty("et3_hub_links_statuses")
    private ET3HubLinksStatuses et3HubLinksStatuses;
}
