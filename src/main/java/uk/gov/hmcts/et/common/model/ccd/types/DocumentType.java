package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class DocumentType {

    @JsonProperty("typeOfDocument")
    private String typeOfDocument;
    @JsonProperty("uploadedDocument")
    private UploadedDocumentType uploadedDocument;
    @JsonProperty("ownerDocument")
    private String ownerDocument;
    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("shortDescription")
    private String shortDescription;
}
