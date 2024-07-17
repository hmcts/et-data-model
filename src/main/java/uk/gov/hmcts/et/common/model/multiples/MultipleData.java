package uk.gov.hmcts.et.common.model.multiples;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.bulk.items.CaseIdTypeItem;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicMultiSelectListType;
import uk.gov.hmcts.et.common.model.ccd.items.AddressLabelTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.GenericTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.ListTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.ReferralTypeItem;
import uk.gov.hmcts.et.common.model.ccd.types.AddressLabelsAttributesType;
import uk.gov.hmcts.et.common.model.ccd.types.CaseNote;
import uk.gov.hmcts.et.common.model.ccd.types.CasePreAcceptType;
import uk.gov.hmcts.et.common.model.ccd.types.CorrespondenceScotType;
import uk.gov.hmcts.et.common.model.ccd.types.CorrespondenceType;
import uk.gov.hmcts.et.common.model.ccd.types.DynamicListType;
import uk.gov.hmcts.et.common.model.ccd.types.NotificationsExtract;
import uk.gov.hmcts.et.common.model.ccd.types.SendNotificationTypeItem;
import uk.gov.hmcts.et.common.model.ccd.types.SubCaseLegalRepDetails;
import uk.gov.hmcts.et.common.model.generic.BaseCaseData;
import uk.gov.hmcts.et.common.model.multiples.items.CaseMultipleTypeItem;
import uk.gov.hmcts.et.common.model.multiples.items.SubMultipleTypeItem;
import uk.gov.hmcts.et.common.model.multiples.types.MoveCasesType;
import uk.gov.hmcts.et.common.model.multiples.types.SubMultipleActionType;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MultipleData extends BaseCaseData {

    @JsonProperty("caseIdCollection")
    private List<CaseIdTypeItem> caseIdCollection;

    @JsonProperty("caseMultipleCollection")
    private List<CaseMultipleTypeItem> caseMultipleCollection;

    @JsonProperty("multipleName")
    private String multipleName;
    @JsonProperty("multipleReference")
    private String multipleReference;

    @JsonProperty("caseImporterFile")
    private CaseImporterFile caseImporterFile;

    @JsonProperty("state")
    private String state;
    @JsonProperty("multipleSource")
    private String multipleSource;
    @JsonProperty("leadCase")
    private String leadCase;
    @JsonProperty("leadCaseId")
    private String leadCaseId;
    @JsonProperty("leadEthosCaseRef")
    private String leadEthosCaseRef;
    @JsonProperty("newLeadCase")
    private String amendLeadCase;
    @JsonProperty("caseCounter")
    private String caseCounter;
    @JsonProperty("preAcceptDone")
    private String preAcceptDone;

    @JsonProperty("subMultiple")
    private DynamicFixedListType subMultiple;
    @JsonProperty("flag1")
    private DynamicFixedListType flag1;
    @JsonProperty("flag2")
    private DynamicFixedListType flag2;
    @JsonProperty("flag3")
    private DynamicFixedListType flag3;
    @JsonProperty("flag4")
    private DynamicFixedListType flag4;

    @JsonProperty("scheduleDocName")
    private String scheduleDocName;
    @JsonProperty("docMarkUp")
    private String docMarkUp;

    @JsonProperty("batchUpdateType")
    private String batchUpdateType;
    @JsonProperty("batchUpdateCase")
    private String batchUpdateCase;
    @JsonProperty("liveCases")
    private String liveCases;

    @JsonProperty("batchUpdateClaimantRep")
    private DynamicFixedListType batchUpdateClaimantRep;
    @JsonProperty("batchRemoveClaimantRep")
    private String batchRemoveClaimantRep;

    private ListTypeItem<DynamicListType> batchUpdateJurisdictionList;

    @JsonProperty("batchUpdateJurisdiction")
    private DynamicFixedListType batchUpdateJurisdiction;
    @JsonProperty("batchUpdateRespondent")
    private DynamicFixedListType batchUpdateRespondent;
    @JsonProperty("batchUpdateJudgment")
    private DynamicFixedListType batchUpdateJudgment;
    @JsonProperty("batchUpdateRespondentRep")
    private DynamicFixedListType batchUpdateRespondentRep;
    @JsonProperty("batchRemoveRespondentRep")
    private String batchRemoveRespondentRep;

    @JsonProperty("fileLocation")
    private DynamicFixedListType fileLocation;
    @JsonProperty("fileLocationGlasgow")
    private DynamicFixedListType fileLocationGlasgow;
    @JsonProperty("fileLocationAberdeen")
    private DynamicFixedListType fileLocationAberdeen;
    @JsonProperty("fileLocationDundee")
    private DynamicFixedListType fileLocationDundee;
    @JsonProperty("fileLocationEdinburgh")
    private DynamicFixedListType fileLocationEdinburgh;
    @JsonProperty("positionType")
    private String positionType;
    @JsonProperty("clerkResponsible")
    private DynamicFixedListType clerkResponsible;
    @JsonProperty("receiptDate")
    private String receiptDate;
    @JsonProperty("hearingStageEQP")
    private String hearingStage;

    @JsonProperty("batchMoveCases")
    private MoveCasesType moveCases;

    @JsonProperty("subMultipleCollection")
    private List<SubMultipleTypeItem> subMultipleCollection;
    @JsonProperty("subMultipleAction")
    private SubMultipleActionType subMultipleAction;

    @JsonProperty("correspondenceScotType")
    private CorrespondenceScotType correspondenceScotType;
    @JsonProperty("correspondenceType")
    private CorrespondenceType correspondenceType;
    @JsonProperty("addressLabelsSelectionTypeMSL")
    private List<String> addressLabelsSelectionTypeMSL;
    @JsonProperty("addressLabelCollection")
    private List<AddressLabelTypeItem> addressLabelCollection;
    @JsonProperty("addressLabelsAttributesType")
    private AddressLabelsAttributesType addressLabelsAttributesType;

    @JsonProperty("typeOfAmendment")
    private List<String> typeOfAmendmentMSL;
    @JsonProperty("officeMultipleCT")
    private DynamicFixedListType officeMultipleCT;
    @JsonProperty("reasonForCT")
    private String reasonForCT;
    @JsonProperty("linkedMultipleCT")
    private String linkedMultipleCT;
    @JsonProperty("positionTypeCT")
    private String positionTypeCT;

    @JsonProperty("preAcceptMultiple")
    private CasePreAcceptType preAcceptCase;
    @JsonProperty("notes")
    private String notes;

    @JsonProperty("bulkAddSingleCasesImportFile")
    private CaseImporterFile bulkAddSingleCasesImportFile;
    @JsonProperty("isFixCase")
    private String isFixCase;

    @JsonProperty("batchCaseStayed")
    private String batchCaseStayed;

    //sendNotification
    @JsonProperty("sendNotificationCollection")
    private List<SendNotificationTypeItem> sendNotificationCollection;
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
    @JsonProperty("sendNotificationNotifyLeadCase")
    private String sendNotificationNotifyLeadCase;
    @JsonProperty("sendNotificationNotifyAll")
    private String sendNotificationNotifyAll;
    @JsonProperty("sendNotificationNotifySelected")
    private String sendNotificationNotifySelected;
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
    @JsonProperty("sendNotificationDetails")
    private String sendNotificationDetails;
    @JsonProperty("sendNotificationDecision")
    private String sendNotificationDecision;
    @JsonProperty("sendNotificationRequestMadeBy")
    private String sendNotificationRequestMadeBy;
    @JsonProperty("sendNotificationEccQuestion")
    private String sendNotificationEccQuestion;
    @JsonProperty("sendNotificationWhoMadeJudgement")
    private String sendNotificationWhoMadeJudgement;

    @JsonProperty("notificationsExtract")
    private NotificationsExtract notificationsExtract;

    //Referral
    @JsonProperty("referralCollection")
    private List<ReferralTypeItem> referralCollection;
    @JsonProperty("referralHearingDetails")
    private String referralHearingDetails;
    @JsonProperty("selectReferral")
    private DynamicFixedListType selectReferral;
    //Referral Type
    @JsonProperty("referCaseTo")
    private String referCaseTo;
    @JsonProperty("referentEmail")
    private String referentEmail;
    @JsonProperty("isUrgent")
    private String isUrgent;
    @JsonProperty("referralSubject")
    private String referralSubject;
    @JsonProperty("referralSubjectSpecify")
    private String referralSubjectSpecify;
    @JsonProperty("referralDetails")
    private String referralDetails;
    @JsonProperty("referralDocument")
    private List<DocumentTypeItem> referralDocument;
    @JsonProperty("referralInstruction")
    private String referralInstruction;
    @JsonProperty("referredBy")
    private String referredBy;
    @JsonProperty("referralDate")
    private String referralDate;

    //Referral Update
    @JsonProperty("updateReferralNumber")
    private String updateReferralNumber;
    @JsonProperty("updateReferCaseTo")
    private String updateReferCaseTo;
    @JsonProperty("updateReferentEmail")
    private String updateReferentEmail;
    @JsonProperty("updateIsUrgent")
    private String updateIsUrgent;
    @JsonProperty("updateReferralSubject")
    private String updateReferralSubject;
    @JsonProperty("updateReferralSubjectSpecify")
    private String updateReferralSubjectSpecify;
    @JsonProperty("updateReferralDetails")
    private String updateReferralDetails;
    @JsonProperty("updateReferralDocument")
    private List<DocumentTypeItem> updateReferralDocument;
    @JsonProperty("updateReferralInstruction")
    private String updateReferralInstruction;

    //Referral Reply
    @JsonProperty("hearingAndReferralDetails")
    private String hearingAndReferralDetails;
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
    @JsonProperty("replyTo")
    private String replyTo;
    @JsonProperty("replyDetails")
    private String replyDetails;
    @JsonProperty("isJudge")
    private String isJudge;

    //Close Referral
    @JsonProperty("closeReferralHearingDetails")
    private String closeReferralHearingDetails;
    @JsonProperty("confirmCloseReferral")
    private List<String> confirmCloseReferral;
    @JsonProperty("closeReferralGeneralNotes")
    private String closeReferralGeneralNotes;

    //Document collections
    private List<DocumentTypeItem> documentCollection;
    private List<DocumentTypeItem> claimantDocumentCollection;
    private List<DocumentTypeItem> legalrepDocumentCollection;

    //Collection of Legal Reps with access to the case
    @JsonProperty("legalRepCollection")
    private ListTypeItem<SubCaseLegalRepDetails> legalRepCollection;

    private List<GenericTypeItem<CaseNote>> multipleCaseNotesCollection;
    private CaseNote caseNote;

    //multiplesDocumentsTabTitles
    private List<DocumentTypeItem> multiplesDocumentsTabTitle;
    private List<DocumentTypeItem> multiplesClaimantDocumentsTabTitle;
    private List<DocumentTypeItem> multiplesRespondentsDocumentsTabTitle;

    //documentSelect
    private DynamicMultiSelectListType documentSelect;

    //documentAccess
    private String documentAccess;

    @JsonProperty("multipleNote")
    private String multipleNote;

    @JsonProperty("altCaseIdCollection")
    private List<CaseIdTypeItem> altCaseIdCollection;
}
