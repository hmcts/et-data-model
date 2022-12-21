package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CallbackRequest {

    @JsonProperty("case_details")
    private CaseDetails caseDetails;

    @JsonProperty("case_details_before")
    private CaseDetails caseDetailsBefore;

    @JsonProperty("event_id")
    private String eventId;
}
