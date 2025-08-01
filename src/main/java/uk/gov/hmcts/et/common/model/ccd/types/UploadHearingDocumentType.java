package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class UploadHearingDocumentType {
    @JsonProperty("document")
    private UploadedDocumentType document;
    @JsonProperty("type")
    private String type;
    @JsonProperty("typeOther")
    private String typeOther;
}
