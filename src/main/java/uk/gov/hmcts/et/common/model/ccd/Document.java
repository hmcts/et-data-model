package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Document {
    @JsonProperty("document_url")
    private String url;
    @JsonProperty("document_binary_url")
    private String binaryUrl;
    @JsonProperty("document_filename")
    private String fileName;
    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("upload_timestamp")
    private String uploadTimestamp;

}
