package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;

import java.util.List;

public class TseRespondType {

    @JsonProperty("dateTime")
    private String dateTime;
    @JsonProperty("from")
    private String from;

    // Respondent / Claimant Reply
    @JsonProperty("response")
    private String response;
    @JsonProperty("hasSupportingMaterial")
    private String hasSupportingMaterial;
    @JsonProperty("supportingMaterial")
    private List<DocumentTypeItem> supportingMaterial;
    @JsonProperty("copyToOtherParty")
    private String copyToOtherParty;
    @JsonProperty("copyNoGiveDetails")
    private String copyNoGiveDetails;
    @JsonProperty("summaryPdf")
    private UploadedDocumentType summaryPdf;

    // Admin Reply
    @JsonProperty("enterResponseTitle")
    private String enterResponseTitle;
    @JsonProperty("additionalInformation")
    private String additionalInformation;
    @JsonProperty("addDocument")
    private UploadedDocumentType addDocument;
    @JsonProperty("isCmoOrRequest")
    private String isCmoOrRequest;
    @JsonProperty("cmoMadeBy")
    private String cmoMadeBy;
    @JsonProperty("requestMadeBy")
    private String requestMadeBy;
    @JsonProperty("madeByFullName")
    private String madeByFullName;
    @JsonProperty("isResponseRequired")
    private String isResponseRequired;
    @JsonProperty("selectPartyRespond")
    private String selectPartyRespond;
    @JsonProperty("selectPartyNotify")
    private String selectPartyNotify;

}
