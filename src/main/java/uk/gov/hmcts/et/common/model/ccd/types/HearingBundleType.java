package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class HearingBundleType {
    @JsonProperty("agreedDocWith")
    private String agreedDocWith;
    @JsonProperty("agreedDocWithBut")
    private String agreedDocWithBut;
    @JsonProperty("agreedDocWithNo")
    private String agreedDocWithNo;
    @JsonProperty("hearing")
    private String hearing;
    @JsonProperty("whatDocuments")
    private String whatDocuments;
    @JsonProperty("whoseDocuments")
    private String whoseDocuments;
    @JsonProperty("uploadFile")
    private UploadedDocumentType uploadFile;
}
