package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.types.UploadedDocumentType;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GenericTseApplicationType {

    @JsonProperty("number")
    private String number;
    @JsonProperty("type")
    private String type; // Amend details
    @JsonProperty("applicant")
    private String applicant; // Either Respondent or Claimant
    @JsonProperty("date")
    private String date;
    @JsonProperty("documentUpload")
    private UploadedDocumentType documentUpload;
    @JsonProperty("details")
    private String details;
    @JsonProperty("copyToOtherPartyYesOrNo")
    private String copyToOtherPartyYesOrNo;
    @JsonProperty("copyToOtherPartyText")
    private String copyToOtherPartyText;
    @JsonProperty("due")
    private String due;
    @JsonProperty("responsesCount")
    private String responsesCount;
    @JsonProperty("status")
    private String status;

//    @JsonProperty("adminReply")
//    private TseApplicationAdminReplyType adminReply;
//
//    // Only applicable to applications created by Respondent
//    @JsonProperty("claimantReply")
//    private ClaimantApplicationResponseType claimantReply;

    @JsonProperty("respondentReply")
    private List<TseRespondentReplyTypeItem> respondentReply;

}
