package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ReferralReplyType {
    //For Judge
    @JsonProperty("directionTo")
    private String directionTo;
    @JsonProperty("replyToEmailAddress")
    private String replyToEmailAddress;
    @JsonProperty("isUrgentReply")
    private String isUrgentReply;
    @JsonProperty("directionDetails")
    private String directionDetails;
    @JsonProperty("replyDocument")
    private List<DocumentTypeItem> replyDocument;
    @JsonProperty("replyGeneralNotes")
    private String replyGeneralNotes;
    @JsonProperty("replyBy")
    private String replyBy;
    @JsonProperty("replyDate")
    private String replyDate;
}
