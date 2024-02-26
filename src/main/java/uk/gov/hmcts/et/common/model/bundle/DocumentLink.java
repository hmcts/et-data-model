package uk.gov.hmcts.et.common.model.bundle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value
@Builder(toBuilder = true)
@Jacksonized
public class DocumentLink {

    @JsonProperty("document_url")
    public String documentUrl;
    @JsonProperty("document_filename")
    public String documentFilename;
    @JsonProperty("document_binary_url")
    public String documentBinaryUrl;

}