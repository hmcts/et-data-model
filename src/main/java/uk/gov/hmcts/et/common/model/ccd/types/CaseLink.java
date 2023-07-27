package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CaseLink {
    @JsonProperty("CaseReference")
    private String caseReference;
    @JsonProperty("CaseType")
    private String caseType;
    @JsonProperty("CreatedDateTime")
    private String createdDateTime;
    @JsonProperty("ReasonForLink")
    private List<LinkReason> reasonForLink;
}
