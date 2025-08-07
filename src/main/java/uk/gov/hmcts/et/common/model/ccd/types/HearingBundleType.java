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
    @JsonProperty("whatDocumentsOther")
    private String whatDocumentsOther;
    @JsonProperty("whoseDocuments")
    private String whoseDocuments;
    @JsonProperty("uploadFile")
    private UploadedDocumentType uploadFile;
    @JsonProperty("formattedSelectedHearing")
    private String formattedSelectedHearing;
    @JsonProperty("uploadDateTime")
    private String uploadDateTime;
    // Submitted date is the date when the bundle was submitted to the tribunal and is different from the upload date.
    @JsonProperty("submittedDate")
    private String submittedDate;
    @JsonProperty("uploadedBy")
    private String uploadedBy;
}
