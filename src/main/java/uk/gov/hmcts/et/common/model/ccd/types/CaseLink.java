package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CaseLink {
    @JsonProperty("CaseReference")
    private String caseReference;
    @JsonProperty("CaseType")
    private String caseType;
    @JsonProperty("CreatedDateTime")
    private LocalDateTime createdDateTime;
    @JsonProperty("ReasonForLink")
    private List<LinkReason> reasonForLink;
}
