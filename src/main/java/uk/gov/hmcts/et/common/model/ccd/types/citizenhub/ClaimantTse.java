package uk.gov.hmcts.et.common.model.ccd.types.citizenhub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.types.UploadedDocumentType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ClaimantTse {

    @JsonProperty("numberOfSelectedLabels")
    private String contactApplicationType;
    @JsonProperty("contactApplicationText")
    private String contactApplicationText;
    @JsonProperty("contactApplicationFile")
    private UploadedDocumentType contactApplicationFile;
}
