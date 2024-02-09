package uk.gov.hmcts.et.common.model.multiples;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.bulk.items.CaseIdTypeItem;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;
import uk.gov.hmcts.et.common.model.ccd.items.AddressLabelTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;
import uk.gov.hmcts.et.common.model.ccd.types.AddressLabelsAttributesType;
import uk.gov.hmcts.et.common.model.ccd.types.CasePreAcceptType;
import uk.gov.hmcts.et.common.model.ccd.types.CorrespondenceScotType;
import uk.gov.hmcts.et.common.model.ccd.types.CorrespondenceType;
import uk.gov.hmcts.et.common.model.ccd.types.SendNotificationTypeItem;
import uk.gov.hmcts.et.common.model.multiples.items.CaseMultipleTypeItem;
import uk.gov.hmcts.et.common.model.multiples.items.SubMultipleTypeItem;
import uk.gov.hmcts.et.common.model.multiples.types.MoveCasesType;
import uk.gov.hmcts.et.common.model.multiples.types.SubMultipleActionType;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class MultipleData {

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

    @JsonProperty("batchUpdateClaimantRep")
    private DynamicFixedListType batchUpdateClaimantRep;
    @JsonProperty("batchRemoveClaimantRep")
    private String batchRemoveClaimantRep;

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

    @JsonProperty("managingOffice")
    private String managingOffice;
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
}
