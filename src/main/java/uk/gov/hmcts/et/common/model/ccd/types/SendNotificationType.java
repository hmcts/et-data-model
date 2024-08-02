package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.GenericTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.PseResponseTypeItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class SendNotificationType {

    @JsonProperty("number")
    private String number; // Unique, incremented value for each application
    @JsonProperty("date")
    private String date;

    @JsonProperty("sendNotificationTitle")
    private String sendNotificationTitle;
    @JsonProperty("sendNotificationLetter")
    private String sendNotificationLetter;
    @JsonProperty("sendNotificationUploadDocument")
    private List<DocumentTypeItem> sendNotificationUploadDocument;
    @JsonProperty("sendNotificationSubject")
    private List<String> sendNotificationSubject;
    @JsonProperty("sendNotificationAdditionalInfo")
    private String sendNotificationAdditionalInfo;
    @JsonProperty("sendNotificationNotify")
    private String sendNotificationNotify;
    @JsonProperty("sendNotificationSelectHearing")
    private DynamicFixedListType sendNotificationSelectHearing;
    @JsonProperty("sendNotificationCaseManagement")
    private String sendNotificationCaseManagement;
    @JsonProperty("sendNotificationResponseTribunal")
    private String sendNotificationResponseTribunal;
    @JsonProperty("sendNotificationWhoCaseOrder")
    private String sendNotificationWhoCaseOrder;
    @JsonProperty("sendNotificationSelectParties")
    private String sendNotificationSelectParties;
    @JsonProperty("sendNotificationFullName")
    private String sendNotificationFullName;
    @JsonProperty("sendNotificationFullName2")
    private String sendNotificationFullName2;
    @JsonProperty("sendNotificationDecision")
    private String sendNotificationDecision;
    @JsonProperty("sendNotificationDetails")
    private String sendNotificationDetails;
    @JsonProperty("sendNotificationRequestMadeBy")
    private String sendNotificationRequestMadeBy;
    @JsonProperty("sendNotificationEccQuestion")
    private String sendNotificationEccQuestion;
    @JsonProperty("sendNotificationWhoMadeJudgement")
    private String sendNotificationWhoMadeJudgement;
    @JsonProperty("respondCollection")
    private List<PseResponseTypeItem> respondCollection;
    @JsonProperty("respondStoredCollection")
    private List<PseResponseTypeItem> respondStoredCollection;
    @JsonProperty("respondNotificationTypeCollection")
    private List<GenericTypeItem<RespondNotificationType>> respondNotificationTypeCollection;
    @JsonProperty("notificationState")
    private String notificationState;
    @JsonProperty("notificationHearingState")
    private String notificationHearingState;
    @JsonProperty("sendNotificationSubjectString")
    private String sendNotificationSubjectString;
    @JsonProperty("sendNotificationResponseTribunalTable")
    private String sendNotificationResponseTribunalTable;
    @JsonProperty("sendNotificationResponsesCount")
    private String sendNotificationResponsesCount;
    @JsonProperty("sendNotificationSentBy")
    private String sendNotificationSentBy;
    @JsonProperty("notificationSentFrom")
    private String notificationSentFrom;
}
