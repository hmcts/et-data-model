package uk.gov.hmcts.et.common.model.generic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.ccd.GenericTypeCaseDetails;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericCCDRequest<T> {

    private String token;
    @JsonProperty("event_id")
    private String eventId;
    @JsonProperty("case_details")
    private GenericTypeCaseDetails<T> caseDetails;
}
