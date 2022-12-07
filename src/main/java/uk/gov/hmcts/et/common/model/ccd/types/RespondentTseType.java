package uk.gov.hmcts.et.common.model.ccd.types;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class RespondentTseType {
    @JsonProperty("resTseSelectApplication")
    private String resTseSelectApplication;
    @JsonProperty("resTseDocument")
    private UploadedDocumentType resTseDocument;
    @JsonProperty("resTseTextBox")
    private String resTseTextBox;
    @JsonProperty("resTseCopyToOtherPartyYesOrNo")
    private String resTseCopyToOtherPartyYesOrNo;
    @JsonProperty("resTseCopyToOtherPartyTextArea")
    private String resTseCopyToOtherPartyTextArea;

//    @JsonProperty("claimantReplyItem")
//    private ClaimantReplyTseTypeItem claimantReplyItem;
}
