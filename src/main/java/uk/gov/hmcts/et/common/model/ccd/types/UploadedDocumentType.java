package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
@SuperBuilder
@Data
@NoArgsConstructor
public class UploadedDocumentType {

    @JsonProperty("document_binary_url")
    private String documentBinaryUrl;
    @JsonProperty("document_filename")
    private String documentFilename;
    @JsonProperty("document_url")
    private String documentUrl;
    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("upload_timestamp")
    private String uploadTimestamp;
    @JsonProperty("tornadoEmbeddedPdfUrl")
    private String tornadoEmbeddedPdfUrl;
}
