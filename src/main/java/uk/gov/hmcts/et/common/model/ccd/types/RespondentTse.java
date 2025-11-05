package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class RespondentTse {
    @JsonProperty("respondentIdamId")
    private String respondentIdamId;
    @JsonProperty("contactApplicationType")
    private String contactApplicationType;
    @JsonProperty("contactApplicationClaimantType")
    private String contactApplicationClaimantType;
    @JsonProperty("contactApplicationText")
    private String contactApplicationText;
    @JsonProperty("contactApplicationFile")
    private UploadedDocumentType contactApplicationFile;
    @JsonProperty("copyToOtherPartyYesOrNo")
    private String copyToOtherPartyYesOrNo;
    @JsonProperty("copyToOtherPartyText")
    private String copyToOtherPartyText;
    @JsonProperty("storedApplicationId")
    private String storedApplicationId;
}
