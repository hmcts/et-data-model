package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.types.UploadedDocumentType;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@SuperBuilder
@Data
@NoArgsConstructor
public class GenericTseApplicationType {

    @JsonProperty("number")
    private String number; // Unique, incremented value for each application
    @JsonProperty("type")
    private String type; // Amend details
    @JsonProperty("applicant")
    private String applicant; // Either Respondent or Claimant
    @JsonProperty("applicantIdamId")
    private String applicantIdamId;
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
    @JsonProperty("dueDate")
    private String dueDate;
    @JsonProperty("responsesCount")
    private String responsesCount;
    @JsonProperty("status")
    private String status;
    @JsonProperty("closeApplicationNotes")
    private String closeApplicationNotes;
    @JsonProperty("applicationState")
    private String applicationState;
    @JsonProperty("respondentState")
    private List<TseStatusTypeItem> respondentState;
    // If there are tribunal requests/orders that required a response from Respondent
    @JsonProperty("respondentResponseRequired")
    private String respondentResponseRequired;
    // If there are tribunal requests/orders that required a response from Claimant
    @JsonProperty("claimantResponseRequired")
    private String claimantResponseRequired;

    @JsonProperty("respondCollection")
    private List<TseRespondTypeItem> respondCollection;
    @JsonProperty("respondStoredCollection")
    private List<TseRespondTypeItem> respondStoredCollection;

    @JsonProperty("adminDecision")
    private List<TseAdminRecordDecisionTypeItem> adminDecision;

}
