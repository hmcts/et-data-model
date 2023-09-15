package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.items.TypeItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class TseRespondType {

    @JsonProperty("date")
    private String date;
    @JsonProperty("from")
    private String from;

    // Respondent / Claimant Reply
    @JsonProperty("response")
    private String response;
    @JsonProperty("hasSupportingMaterial")
    private String hasSupportingMaterial;
    @JsonProperty("supportingMaterial")
    private List<TypeItem<DocumentType>> supportingMaterial;
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
    private List<TypeItem<DocumentType>> addDocument;
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
    @JsonProperty("viewedByClaimant")
    private String viewedByClaimant;
}
