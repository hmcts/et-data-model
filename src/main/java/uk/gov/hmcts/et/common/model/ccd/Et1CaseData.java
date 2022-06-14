package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;
import uk.gov.hmcts.et.common.model.ccd.types.*;
import uk.gov.hmcts.et.common.model.ccd.items.JurCodesTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.RespondentSumTypeItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Et1CaseData {
    @JsonProperty("caseType")
    private String ecmCaseType;
    @JsonProperty("caseSource")
    private String caseSource;
    @JsonProperty("claimantRepresentedQuestion")
    private String claimantRepresentedQuestion;
    @JsonProperty("jurCodesCollection")
    private List<JurCodesTypeItem> jurCodesCollection;
    @JsonProperty("claimantIndType")
    private ClaimantIndType claimantIndType;
    @JsonProperty("claimantType")
    private ClaimantType claimantType;
    @JsonProperty("representativeClaimantType")
    private RepresentedTypeC representativeClaimantType;
    @JsonProperty("claimantOtherType")
    private ClaimantOtherType claimantOtherType;
    @JsonProperty("respondentCollection")
    private List<RespondentSumTypeItem> respondentCollection;
    @JsonProperty("claimantWorkAddress")
    private ClaimantWorkAddressType claimantWorkAddress;
    @JsonProperty("caseNotes")
    private String caseNotes;
    @JsonProperty("additionalCaseInfo")
    private AdditionalCaseInfoType additionalCaseInfoType;
    @JsonProperty("managingOffice")
    private String managingOffice;
    @JsonProperty("newEmploymentType")
    private NewEmploymentType newEmploymentType;
    @JsonProperty("claimantRequests")
    private ClaimantRequestType claimantRequests;
    @JsonProperty("claimantHearingPreference")
    private ClaimantHearingPreference claimantHearingPreference;
    @JsonProperty("servingDocumentCollection")
    private List<DocumentTypeItem> servingDocumentCollection;
    @JsonProperty("otherTypeDocumentName")
    private String otherTypeDocumentName;
    @JsonProperty("servingDocumentRecipient")
    private List<String> servingDocumentRecipient;
    @JsonProperty("claimantAndRespondentAddresses")
    private String claimantAndRespondentAddresses;
}
