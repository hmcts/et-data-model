package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class RespondNotificationType {
    @JsonProperty("respondNotificationDate")
    private String respondNotificationDate;
    @JsonProperty("respondNotificationTitle")
    private String respondNotificationTitle;
    @JsonProperty("respondNotificationAdditionalInfo")
    private String respondNotificationAdditionalInfo;
    @JsonProperty("respondNotificationUploadDocument")
    private List<DocumentTypeItem> respondNotificationUploadDocument;
    @JsonProperty("respondNotificationCmoOrRequest")
    private String respondNotificationCmoOrRequest;
    @JsonProperty("respondNotificationResponseRequired")
    private String respondNotificationResponseRequired;
    @JsonProperty("respondNotificationWhoRespond")
    private String respondNotificationWhoRespond;
    @JsonProperty("respondNotificationCaseManagementMadeBy")
    private String respondNotificationCaseManagementMadeBy;
    @JsonProperty("respondNotificationRequestMadeBy")
    private String respondNotificationRequestMadeBy;
    @JsonProperty("respondNotificationFullName")
    private String respondNotificationFullName;
    @JsonProperty("respondNotificationPartyToNotify")
    private String respondNotificationPartyToNotify;
    @JsonProperty("dateTime")
    private String dateTime;
    private String state;
    private String isClaimantResponseDue;
}
