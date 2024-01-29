package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.items.ListTypeItem;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class TseAdminRecordDecision {

    @JsonProperty("date")
    private String date;
    @JsonProperty("enterNotificationTitle")
    private String enterNotificationTitle;
    @JsonProperty("decision")
    private String decision;
    @JsonProperty("decisionDetails")
    private String decisionDetails;
    @JsonProperty("typeOfDecision")
    private String typeOfDecision;
    @JsonProperty("isResponseRequired")
    private String isResponseRequired;
    @JsonProperty("selectPartyRespond")
    private String selectPartyRespond;
    @JsonProperty("additionalInformation")
    private String additionalInformation;
    @JsonProperty("responseRequiredDoc")
    private ListTypeItem<DocumentType> responseRequiredDoc;
    @JsonProperty("decisionMadeBy")
    private String decisionMadeBy;
    @JsonProperty("decisionMadeByFullName")
    private String decisionMadeByFullName;
    @JsonProperty("selectPartyNotify")
    private String selectPartyNotify;
    @JsonProperty("decisionState")
    private String decisionState;
}
