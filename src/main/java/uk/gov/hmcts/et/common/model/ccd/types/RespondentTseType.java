package uk.gov.hmcts.et.common.model.ccd.types;


import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.items.ClaimantReplyTseTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class RespondentTseType {
    @JsonProperty("resTseSelectApplication")
    private String resTseSelectApplication;
    @JsonProperty("resTseDocuments")
    private DocumentTypeItem resTseDocuments;
    @JsonProperty("resTseTextBox")
    private String resTseTextBox;
    @JsonProperty("resTseCopyToOtherPartyYesOrNo")
    private String resTseCopyToOtherPartyYesOrNo;
    @JsonProperty("resTseCopyToOtherPartyTextArea")
    private String resTseCopyToOtherPartyTextArea;

    @JsonProperty("claimantReplyItem")
    private List<ClaimantReplyTseTypeItem> claimantReplyItem;
}
