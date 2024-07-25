package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;
import uk.gov.hmcts.et.common.model.ccd.items.AddressLabelTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.BFActionTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.DepositTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.DynamicListTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.EccCounterClaimTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.GenericTseApplicationTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.GenericTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.HearingDetailTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.HearingTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.JudgementTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.ListTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.ReferralTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.RemovedHearingBundleItem;
import uk.gov.hmcts.et.common.model.ccd.items.RepresentedTypeRItem;
import uk.gov.hmcts.et.common.model.ccd.items.VettingJurCodesTypeItem;
import uk.gov.hmcts.et.common.model.ccd.types.AddressLabelsAttributesType;
import uk.gov.hmcts.et.common.model.ccd.types.AddressLabelsSelectionType;
import uk.gov.hmcts.et.common.model.ccd.types.CaseFlagsType;
import uk.gov.hmcts.et.common.model.ccd.types.CaseLink;
import uk.gov.hmcts.et.common.model.ccd.types.CasePreAcceptType;
import uk.gov.hmcts.et.common.model.ccd.types.ChangeOrganisationRequest;
import uk.gov.hmcts.et.common.model.ccd.types.CompanyPremisesType;
import uk.gov.hmcts.et.common.model.ccd.types.CorrespondenceScotType;
import uk.gov.hmcts.et.common.model.ccd.types.CorrespondenceType;
import uk.gov.hmcts.et.common.model.ccd.types.CreateRespondentType;
import uk.gov.hmcts.et.common.model.ccd.types.DocumentType;
import uk.gov.hmcts.et.common.model.ccd.types.HearingBundleType;
import uk.gov.hmcts.et.common.model.ccd.types.NoticeOfChangeAnswers;
import uk.gov.hmcts.et.common.model.ccd.types.OrganisationPolicy;
import uk.gov.hmcts.et.common.model.ccd.types.RepresentedTypeR;
import uk.gov.hmcts.et.common.model.ccd.types.RestrictedReportingType;
import uk.gov.hmcts.et.common.model.ccd.types.SendNotificationTypeItem;
import uk.gov.hmcts.et.common.model.ccd.types.UploadedDocumentType;
import uk.gov.hmcts.et.common.model.ccd.types.citizenhub.ClaimantTse;
import uk.gov.hmcts.et.common.model.hmc.CaseCategory;
import uk.gov.hmcts.et.common.model.hmc.HearingLocation;
import uk.gov.hmcts.et.common.model.hmc.HearingWindow;
import uk.gov.hmcts.et.common.model.hmc.Judiciary;
import uk.gov.hmcts.et.common.model.hmc.PanelRequirements;
import uk.gov.hmcts.et.common.model.hmc.PartyDetails;
import uk.gov.hmcts.et.common.model.hmc.ScreenNavigation;
import uk.gov.hmcts.et.common.model.hmc.UnavailabilityRanges;
import uk.gov.hmcts.et.common.model.hmc.Vocabulary;
import uk.gov.hmcts.et.common.model.listing.ListingData;

import java.util.List;

/**
 * Employment Tribunal claim data. This class contains all the data for a citizen's claim.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class CaseData extends Et1CaseData {
    @JsonProperty("tribunalCorrespondenceAddress")
    private Address tribunalCorrespondenceAddress;
    @JsonProperty("tribunalCorrespondenceTelephone")
    private String tribunalCorrespondenceTelephone;
    @JsonProperty("tribunalCorrespondenceFax")
    private String tribunalCorrespondenceFax;
    @JsonProperty("tribunalCorrespondenceDX")
    private String tribunalCorrespondenceDX;
    @JsonProperty("tribunalCorrespondenceEmail")
    private String tribunalCorrespondenceEmail;
    @JsonProperty("ethosCaseReference")
    private String ethosCaseReference;
    @JsonProperty("multipleName")
    private String multipleName;
    @JsonProperty("multipleReference")
    private String multipleReference;
    @JsonProperty("multipleReferenceLinkMarkUp")
    private String multipleReferenceLinkMarkUp;
    @JsonProperty("parentMultipleCaseId")
    private String parentMultipleCaseId;
    @JsonProperty("subMultipleName")
    private String subMultipleName;
    @JsonProperty("leadClaimant")
    private String leadClaimant;
    @JsonProperty("multipleFlag")
    private String multipleFlag;

    @JsonProperty("claimant_TypeOfClaimant")
    private String claimantTypeOfClaimant;
    @JsonProperty("claimant_Company")
    private String claimantCompany;
    @JsonProperty("preAcceptCase")
    private CasePreAcceptType preAcceptCase;

    @JsonProperty("claimServedDate")
    private String claimServedDate;
    @JsonProperty("et3DueDate")
    private String et3DueDate;

    @JsonProperty("feeGroupReference")
    private String feeGroupReference;
    @JsonProperty("claimantWorkAddressQRespondent")
    private DynamicFixedListType claimantWorkAddressQRespondent;
    @JsonProperty("repCollection")
    private List<RepresentedTypeRItem> repCollection;
    @JsonProperty("positionType")
    private String positionType;
    @JsonProperty("dateToPosition")
    private String dateToPosition;
    @JsonProperty("currentPosition")
    private String currentPosition;
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
    @JsonProperty("hearingCollection")
    private List<HearingTypeItem> hearingCollection;
    @JsonProperty("hearingDetailsCollection")
    private List<HearingDetailTypeItem> hearingDetailsCollection;
    @JsonProperty("depositType")
    private List<DepositTypeItem> depositCollection;
    @JsonProperty("judgementCollection")
    private List<JudgementTypeItem> judgementCollection;
    @JsonProperty("bfActions")
    private List<BFActionTypeItem> bfActions;
    @JsonProperty("clerkResponsible")
    private DynamicFixedListType clerkResponsible;
    @JsonProperty("userLocation")
    private String userLocation;
    @JsonProperty("addDocumentCollection")
    private List<DocumentTypeItem> addDocumentCollection;
    @JsonProperty("correspondenceScotType")
    private CorrespondenceScotType correspondenceScotType;
    @JsonProperty("correspondenceType")
    private CorrespondenceType correspondenceType;
    @JsonProperty("addressLabelsSelectionType")
    private AddressLabelsSelectionType addressLabelsSelectionType;
    @JsonProperty("addressLabelCollection")
    private List<AddressLabelTypeItem> addressLabelCollection;
    @JsonProperty("addressLabelsAttributesType")
    private AddressLabelsAttributesType addressLabelsAttributesType;
    @JsonProperty("allocatedOffice")
    private String allocatedOffice;
    @JsonProperty("conciliationTrack")
    private String conciliationTrack;
    @JsonProperty("counterClaim")
    private String counterClaim;
    @JsonProperty("eccCases")
    private List<EccCounterClaimTypeItem> eccCases;
    @JsonProperty("restrictedReporting")
    private RestrictedReportingType restrictedReporting;
    @JsonProperty("printHearingDetails")
    private ListingData printHearingDetails;
    @JsonProperty("printHearingCollection")
    private ListingData printHearingCollection;
    @JsonProperty("targetHearingDate")
    private String targetHearingDate;
    @JsonProperty("claimant")
    private String claimant;
    @JsonProperty("claimantId")
    private String claimantId;
    @JsonProperty("respondent")
    private String respondent;

    @JsonProperty("EQP")
    private String eqp;
    @JsonProperty("flag1")
    private String flag1;
    @JsonProperty("flag2")
    private String flag2;

    @JsonProperty("docMarkUp")
    private String docMarkUp;
    @JsonProperty("caseRefNumberCount")
    private String caseRefNumberCount;
    @JsonProperty("startCaseRefNumber")
    private String startCaseRefNumber;
    @JsonProperty("multipleRefNumber")
    private String multipleRefNumber;

    @JsonProperty("caseRefECC")
    private String caseRefECC;
    @JsonProperty("respondentECC")
    private DynamicFixedListType respondentECC;
    @JsonProperty("ccdID")
    private String ccdID;

    @JsonProperty("flagsImageFileName")
    private String flagsImageFileName;
    @JsonProperty("flagsImageAltText")
    private String flagsImageAltText;

    // add hearing - page1
    @JsonProperty("hearingNumbers")
    private String hearingNumbers;
    @JsonProperty("hearingTypes")
    private String hearingTypes;
    @JsonProperty("hearingPublicPrivate")
    private String hearingPublicPrivate;
    @JsonProperty("hearingVenue")
    private DynamicFixedListType hearingVenue;
    @JsonProperty("hearingEstLengthNum")
    private String hearingEstLengthNum;
    @JsonProperty("hearingEstLengthNumType")
    private String hearingEstLengthNumType;
    @JsonProperty("hearingSitAlone")
    private String hearingSitAlone;
    @JsonProperty("Hearing_stage")
    private String hearingStage;
    @JsonProperty("listedDate")
    private String listedDate;
    @JsonProperty("Hearing_notes")
    private String hearingNotes;
    // amend hearing - page1
    @JsonProperty("hearingSelection")
    private DynamicFixedListType hearingSelection;
    // amend hearing - page2
    @JsonProperty("hearingActions")
    private String hearingActions;
    // amend hearing - page3
    @JsonProperty("hearingERMember")
    private String hearingERMember;
    @JsonProperty("hearingEEMember")
    private String hearingEEMember;
    @JsonProperty("hearingDatesRequireAmending")
    private String hearingDatesRequireAmending;
    @JsonProperty("hearingDateSelection")
    private DynamicFixedListType hearingDateSelection;
    // amend hearing - page4
    @JsonProperty("hearingDateActions")
    private String hearingDateActions;
    // amend hearing - page5
    @JsonProperty("hearingStatus")
    private String hearingStatus;
    @JsonProperty("Postponed_by")
    private String postponedBy;
    @JsonProperty("hearingRoom")
    private DynamicFixedListType hearingRoom;
    @JsonProperty("hearingClerk")
    private DynamicFixedListType hearingClerk;
    @JsonProperty("hearingJudge")
    private DynamicFixedListType hearingJudge;
    // amend hearing - page6
    @JsonProperty("hearingCaseDisposed")
    private String hearingCaseDisposed;
    @JsonProperty("Hearing_part_heard")
    private String hearingPartHeard;
    @JsonProperty("Hearing_reserved_judgement")
    private String hearingReservedJudgement;
    @JsonProperty("attendee_claimant")
    private String attendeeClaimant;
    @JsonProperty("attendee_non_attendees")
    private String attendeeNonAttendees;
    @JsonProperty("attendee_resp_no_rep")
    private String attendeeRespNoRep;
    @JsonProperty("attendee_resp_&_rep")
    private String attendeeRespAndRep;
    @JsonProperty("attendee_rep_only")
    private String attendeeRepOnly;
    @JsonProperty("companyPremises")
    private CompanyPremisesType companyPremises;

    @JsonProperty("officeCT")
    private DynamicFixedListType officeCT;
    @JsonProperty("reasonForCT")
    private String reasonForCT;
    @JsonProperty("relatedCaseCT")
    private String relatedCaseCT;
    @JsonProperty("positionTypeCT")
    private String positionTypeCT;
    @JsonProperty("linkedCaseCT")
    private String linkedCaseCT;
    @JsonProperty("transferredCaseLink")
    private String transferredCaseLink;
    @JsonProperty("ecmOfficeCT")
    private String ecmOfficeCT;
    @JsonProperty("assignOffice")
    private DynamicFixedListType assignOffice;

    @JsonProperty("stateAPI")
    private String stateAPI;

    // Allocate Hearing fields
    @JsonProperty("allocateHearingHearing")
    private DynamicFixedListType allocateHearingHearing;
    @JsonProperty("allocateHearingManagingOffice")
    private String allocateHearingManagingOffice;
    @JsonProperty("allocateHearingVenue")
    private DynamicFixedListType allocateHearingVenue;
    @JsonProperty("allocateHearingRoom")
    private DynamicFixedListType allocateHearingRoom;
    @JsonProperty("allocateHearingClerk")
    private DynamicFixedListType allocateHearingClerk;
    @JsonProperty("allocateHearingSitAlone")
    private String allocateHearingSitAlone;
    @JsonProperty("allocateHearingJudge")
    private DynamicFixedListType allocateHearingJudge;
    @JsonProperty("allocateHearingEmployerMember")
    private DynamicFixedListType allocateHearingEmployerMember;
    @JsonProperty("allocateHearingEmployeeMember")
    private DynamicFixedListType allocateHearingEmployeeMember;
    @JsonProperty("allocateHearingPostponedBy")
    private String allocateHearingPostponedBy;
    @JsonProperty("allocateHearingStatus")
    private String allocateHearingStatus;
    @JsonProperty("allocateHearingReadingDeliberation")
    private String allocateHearingReadingDeliberation;

    // Hearing Details fields
    @JsonProperty("hearingDetailsHearing")
    private DynamicFixedListType hearingDetailsHearing;
    @JsonProperty("hearingDetailsStatus")
    private String hearingDetailsStatus;
    @JsonProperty("hearingDetailsPostponedBy")
    private String hearingDetailsPostponedBy;
    @JsonProperty("hearingDetailsCaseDisposed")
    private String hearingDetailsCaseDisposed;
    @JsonProperty("hearingDetailsPartHeard")
    private String hearingDetailsPartHeard;
    @JsonProperty("hearingDetailsReservedJudgment")
    private String hearingDetailsReservedJudgment;
    @JsonProperty("hearingDetailsAttendeeClaimant")
    private String hearingDetailsAttendeeClaimant;
    @JsonProperty("hearingDetailsAttendeeNonAttendees")
    private String hearingDetailsAttendeeNonAttendees;
    @JsonProperty("hearingDetailsAttendeeRespNoRep")
    private String hearingDetailsAttendeeRespNoRep;
    @JsonProperty("hearingDetailsAttendeeRespAndRep")
    private String hearingDetailsAttendeeRespAndRep;
    @JsonProperty("hearingDetailsAttendeeRepOnly")
    private String hearingDetailsAttendeeRepOnly;
    @JsonProperty("hearingDetailsTimingStart")
    private String hearingDetailsTimingStart;
    @JsonProperty("hearingDetailsTimingBreak")
    private String hearingDetailsTimingBreak;
    @JsonProperty("hearingDetailsTimingResume")
    private String hearingDetailsTimingResume;
    @JsonProperty("hearingDetailsTimingFinish")
    private String hearingDetailsTimingFinish;
    @JsonProperty("hearingDetailsTimingDuration")
    private String hearingDetailsTimingDuration;
    @JsonProperty("hearingDetailsHearingNotes2")
    private String hearingDetailsHearingNotes2;

    // ET1 Vetting
    @JsonProperty("trackType")
    private String trackType;
    @JsonProperty("et1VettingDocument")
    private UploadedDocumentType et1VettingDocument;
    @JsonProperty("et1VettingBeforeYouStart")
    private String et1VettingBeforeYouStart;
    // ET1 Vetting - Can we serve the claim?
    @JsonProperty("et1VettingClaimantDetailsMarkUp")
    private String et1VettingClaimantDetailsMarkUp;
    @JsonProperty("et1VettingRespondentDetailsMarkUp")
    private String et1VettingRespondentDetailsMarkUp;
    @JsonProperty("et1VettingCanServeClaimYesOrNo")
    private String et1VettingCanServeClaimYesOrNo;
    @JsonProperty("et1VettingCanServeClaimNoReason")
    private String et1VettingCanServeClaimNoReason;
    @JsonProperty("et1VettingCanServeClaimGeneralNote")
    private String et1VettingCanServeClaimGeneralNote;
    // ET1 Vetting - Acas certificate?
    @JsonProperty("et1VettingRespondentAcasDetails1")
    private String et1VettingRespondentAcasDetails1;
    @JsonProperty("et1VettingRespondentAcasDetails2")
    private String et1VettingRespondentAcasDetails2;
    @JsonProperty("et1VettingRespondentAcasDetails3")
    private String et1VettingRespondentAcasDetails3;
    @JsonProperty("et1VettingRespondentAcasDetails4")
    private String et1VettingRespondentAcasDetails4;
    @JsonProperty("et1VettingRespondentAcasDetails5")
    private String et1VettingRespondentAcasDetails5;
    @JsonProperty("et1VettingRespondentAcasDetails6")
    private String et1VettingRespondentAcasDetails6;
    @JsonProperty("et1VettingAcasCertIsYesOrNo1")
    private String et1VettingAcasCertIsYesOrNo1;
    @JsonProperty("et1VettingAcasCertExemptYesOrNo1")
    private String et1VettingAcasCertExemptYesOrNo1;
    @JsonProperty("et1VettingAcasCertIsYesOrNo2")
    private String et1VettingAcasCertIsYesOrNo2;
    @JsonProperty("et1VettingAcasCertExemptYesOrNo2")
    private String et1VettingAcasCertExemptYesOrNo2;
    @JsonProperty("et1VettingAcasCertIsYesOrNo3")
    private String et1VettingAcasCertIsYesOrNo3;
    @JsonProperty("et1VettingAcasCertExemptYesOrNo3")
    private String et1VettingAcasCertExemptYesOrNo3;
    @JsonProperty("et1VettingRespondentAcasDetailsLabel4")
    private String et1VettingRespondentAcasDetailsLabel4;
    @JsonProperty("et1VettingAcasCertIsYesOrNo4")
    private String et1VettingAcasCertIsYesOrNo4;
    @JsonProperty("et1VettingAcasCertExemptYesOrNo4")
    private String et1VettingAcasCertExemptYesOrNo4;
    @JsonProperty("et1VettingAcasCertIsYesOrNo5")
    private String et1VettingAcasCertIsYesOrNo5;
    @JsonProperty("et1VettingAcasCertExemptYesOrNo5")
    private String et1VettingAcasCertExemptYesOrNo5;
    @JsonProperty("et1VettingAcasCertIsYesOrNo6")
    private String et1VettingAcasCertIsYesOrNo6;
    @JsonProperty("et1VettingAcasCertExemptYesOrNo6")
    private String et1VettingAcasCertExemptYesOrNo6;
    @JsonProperty("et1VettingAcasCertGeneralNote")
    private String et1VettingAcasCertGeneralNote;
    @JsonProperty("et1VettingCompletedBy")
    private String et1VettingCompletedBy;
    @JsonProperty("et1DateCompleted")
    private String et1DateCompleted;
    @JsonProperty("icCompletedBy")
    private String icCompletedBy;
    @JsonProperty("icDateCompleted")
    private String icDateCompleted;

    //ET1 Vetting -  Substantive Defects
    @JsonProperty("substantiveDefectsList")
    private List<String> substantiveDefectsList;
    @JsonProperty("rule121aTextArea")
    private String rule121aTextArea;
    @JsonProperty("rule121bTextArea")
    private String rule121bTextArea;
    @JsonProperty("rule121cTextArea")
    private String rule121cTextArea;
    @JsonProperty("rule121dTextArea")
    private String rule121dTextArea;
    @JsonProperty("rule121daTextArea")
    private String rule121daTextArea;
    @JsonProperty("rule121eTextArea")
    private String rule121eTextArea;
    @JsonProperty("rule121fTextArea")
    private String rule121fTextArea;
    @JsonProperty("et1SubstantiveDefectsGeneralNotes")
    private String et1SubstantiveDefectsGeneralNotes;

    // ET1 Vetting - Jurisdiction codes
    @JsonProperty("areTheseCodesCorrect")
    private String areTheseCodesCorrect;
    @JsonProperty("codesCorrectGiveDetails")
    private String codesCorrectGiveDetails;
    @JsonProperty("et1JurisdictionCodeGeneralNotes")
    private String et1JurisdictionCodeGeneralNotes;
    @JsonProperty("existingJurisdictionCodes")
    private String existingJurisdictionCodes;
    @JsonProperty("vettingJurisdictionCodeCollection")
    private List<VettingJurCodesTypeItem> vettingJurisdictionCodeCollection;

    // ET1 Vetting - Track allocation
    @JsonProperty("isTrackAllocationCorrect")
    private String isTrackAllocationCorrect;
    @JsonProperty("suggestAnotherTrack")
    private String suggestAnotherTrack;
    @JsonProperty("whyChangeTrackAllocation")
    private String whyChangeTrackAllocation;
    @JsonProperty("trackAllocationGeneralNotes")
    private String trackAllocationGeneralNotes;
    @JsonProperty("isLocationCorrect")
    private String isLocationCorrect;
    @JsonProperty("whyChangeOffice")
    private String whyChangeOffice;
    @JsonProperty("et1LocationGeneralNotes")
    private String et1LocationGeneralNotes;
    @JsonProperty("trackAllocation")
    private String trackAllocation;
    @JsonProperty("tribunalAndOfficeLocation")
    private String tribunalAndOfficeLocation;
    @JsonProperty("regionalOffice")
    private String regionalOffice;
    @JsonProperty("regionalOfficeList")
    private DynamicFixedListType regionalOfficeList;
    // ET1 Vetting - Hearing venues
    @JsonProperty("et1AddressDetails")
    private String et1AddressDetails;
    @JsonProperty("et1TribunalRegion")
    private String et1TribunalRegion;
    @JsonProperty("et1HearingVenues")
    private DynamicFixedListType et1HearingVenues;
    @JsonProperty("et1SuggestHearingVenue")
    private String et1SuggestHearingVenue;
    @JsonProperty("et1HearingVenueGeneralNotes")
    private String et1HearingVenueGeneralNotes;
    @JsonProperty("et1GovOrMajorQuestion")
    private String et1GovOrMajorQuestion;

    // ET1 Vetting - Further questions
    @JsonProperty("et1ReasonableAdjustmentsQuestion")
    private String et1ReasonableAdjustmentsQuestion;
    @JsonProperty("et1ReasonableAdjustmentsTextArea")
    private String et1ReasonableAdjustmentsTextArea;
    @JsonProperty("et1VideoHearingQuestion")
    private String et1VideoHearingQuestion;
    @JsonProperty("et1VideoHearingTextArea")
    private String et1VideoHearingTextArea;
    @JsonProperty("et1FurtherQuestionsGeneralNotes")
    private String et1FurtherQuestionsGeneralNotes;

    // ET1 Vetting - Referral to judge
    @JsonProperty("referralToJudgeOrLOList")
    private List<String> referralToJudgeOrLOList;
    @JsonProperty("aClaimOfInterimReliefTextArea")
    private String aclaimOfInterimReliefTextArea;
    @JsonProperty("aStatutoryAppealTextArea")
    private String astatutoryAppealTextArea;
    @JsonProperty("anAllegationOfCommissionOfSexualOffenceTextArea")
    private String anAllegationOfCommissionOfSexualOffenceTextArea;
    @JsonProperty("insolvencyTextArea")
    private String insolvencyTextArea;
    @JsonProperty("jurisdictionsUnclearTextArea")
    private String jurisdictionsUnclearTextArea;
    @JsonProperty("lengthOfServiceTextArea")
    private String lengthOfServiceTextArea;
    @JsonProperty("potentiallyLinkedCasesInTheEcmTextArea")
    private String potentiallyLinkedCasesInTheEcmTextArea;
    @JsonProperty("rule50IssuesTextArea")
    private String rule50IssuesTextArea;
    @JsonProperty("anotherReasonForJudicialReferralTextArea")
    private String anotherReasonForJudicialReferralTextArea;
    @JsonProperty("et1JudgeReferralGeneralNotes")
    private String et1JudgeReferralGeneralNotes;
    @JsonProperty("referralToREJOrVPList")
    private List<String> referralToREJOrVPList;

    // ET1 Vetting - Referral to Regional Employment judge
    @JsonProperty("vexatiousLitigantOrderTextArea")
    private String vexatiousLitigantOrderTextArea;
    @JsonProperty("aNationalSecurityIssueTextArea")
    private String anationalSecurityIssueTextArea;
    @JsonProperty("nationalMultipleOrPresidentialOrderTextArea")
    private String nationalMultipleOrPresidentialOrderTextArea;
    @JsonProperty("transferToOtherRegionTextArea")
    private String transferToOtherRegionTextArea;
    @JsonProperty("serviceAbroadTextArea")
    private String serviceAbroadTextArea;
    @JsonProperty("aSensitiveIssueTextArea")
    private String asensitiveIssueTextArea;
    @JsonProperty("anyPotentialConflictTextArea")
    private String anyPotentialConflictTextArea;
    @JsonProperty("anotherReasonREJOrVPTextArea")
    private String anotherReasonREJOrVPTextArea;
    @JsonProperty("et1REJOrVPReferralGeneralNotes")
    private String et1REJOrVPReferralGeneralNotes;
    @JsonProperty("otherReferralList")
    private List<String> otherReferralList;

    // ET1 Vetting - Other Factors
    @JsonProperty("claimOutOfTimeTextArea")
    private String claimOutOfTimeTextArea;
    @JsonProperty("multipleClaimTextArea")
    private String multipleClaimTextArea;
    @JsonProperty("employmentStatusIssuesTextArea")
    private String employmentStatusIssuesTextArea;
    @JsonProperty("pidJurisdictionRegulatorTextArea")
    private String pidJurisdictionRegulatorTextArea;
    @JsonProperty("videoHearingPreferenceTextArea")
    private String videoHearingPreferenceTextArea;
    @JsonProperty("rule50IssuesForOtherReferralTextArea")
    private String rule50IssuesForOtherReferralTextArea;
    @JsonProperty("anotherReasonForOtherReferralTextArea")
    private String anotherReasonForOtherReferralTextArea;
    @JsonProperty("et1OtherReferralGeneralNotes")
    private String et1OtherReferralGeneralNotes;
    @JsonProperty("et1VettingAdditionalInformationTextArea")
    private String et1VettingAdditionalInformationTextArea;


    // ET1 Serving
    @JsonProperty("servingDocumentCollection")
    private List<DocumentTypeItem> servingDocumentCollection;
    @JsonProperty("otherTypeDocumentName")
    private String otherTypeDocumentName;
    @JsonProperty("servingDocumentRecipient")
    private List<String> servingDocumentRecipient;
    @JsonProperty("claimantAndRespondentAddresses")
    private String claimantAndRespondentAddresses;
    @JsonProperty("emailLinkToAcas")
    private String emailLinkToAcas;

    //    et3vetting
    @JsonProperty("et3ChooseRespondent")
    private DynamicFixedListType et3ChooseRespondent;
    @JsonProperty("et3Date")
    private String et3Date;
    // ET3 Response Page
    @JsonProperty("et3IsThereAnEt3Response")
    private String et3IsThereAnEt3Response;
    @JsonProperty("et3NoEt3Response")
    private String et3NoEt3Response;
    @JsonProperty("et3GeneralNotes")
    private String et3GeneralNotes;
    // ET3 Company House search document page
    @JsonProperty("et3IsThereACompaniesHouseSearchDocument")
    private String et3IsThereACompaniesHouseSearchDocument;
    @JsonProperty("et3CompanyHouseDocument")
    private UploadedDocumentType et3CompanyHouseDocument;
    @JsonProperty("et3GeneralNotesCompanyHouse")
    private String et3GeneralNotesCompanyHouse;
    // ET3 Individual insolvency search document page
    @JsonProperty("et3IsThereAnIndividualSearchDocument")
    private String et3IsThereAnIndividualSearchDocument;
    @JsonProperty("et3IndividualInsolvencyDocument")
    private UploadedDocumentType et3IndividualInsolvencyDocument;
    @JsonProperty("et3GeneralNotesIndividualInsolvency")
    private String et3GeneralNotesIndividualInsolvency;
    // ET3 Legal issue page
    @JsonProperty("et3LegalIssue")
    private String et3LegalIssue;
    @JsonProperty("et3LegalIssueGiveDetails")
    private String et3LegalIssueGiveDetails;
    @JsonProperty("et3GeneralNotesLegalEntity")
    private String et3GeneralNotesLegalEntity;
    // ET3 Response in time page
    @JsonProperty("et3ResponseInTime")
    private String et3ResponseInTime;
    @JsonProperty("et3ResponseInTimeDetails")
    private String et3ResponseInTimeDetails;
    // ET3 Respondents Name page
    @JsonProperty("et3NameAddressRespondent")
    private String et3NameAddressRespondent;
    @JsonProperty("et3DoWeHaveRespondentsName")
    private String et3DoWeHaveRespondentsName;
    @JsonProperty("et3GeneralNotesRespondentName")
    private String et3GeneralNotesRespondentName;
    @JsonProperty("et3DoesRespondentsNameMatch")
    private String et3DoesRespondentsNameMatch;
    @JsonProperty("et3RespondentNameMismatchDetails")
    private String et3RespondentNameMismatchDetails;
    @JsonProperty("et3GeneralNotesRespondentNameMatch")
    private String et3GeneralNotesRespondentNameMatch;
    // ET3 Respondents Address page
    @JsonProperty("et3DoWeHaveRespondentsAddress")
    private String et3DoWeHaveRespondentsAddress;
    @JsonProperty("et3DoesRespondentsAddressMatch")
    private String et3DoesRespondentsAddressMatch;
    @JsonProperty("et3RespondentAddressMismatchDetails")
    private String et3RespondentAddressMismatchDetails;
    @JsonProperty("et3GeneralNotesRespondentAddress")
    private String et3GeneralNotesRespondentAddress;
    @JsonProperty("et3GeneralNotesAddressMatch")
    private String et3GeneralNotesAddressMatch;
    // ET3 Case Listed Page
    @JsonProperty("et3HearingDetails")
    private String et3HearingDetails;
    @JsonProperty("et3IsCaseListedForHearing")
    private String et3IsCaseListedForHearing;
    @JsonProperty("et3IsCaseListedForHearingDetails")
    private String et3IsCaseListedForHearingDetails;
    @JsonProperty("et3GeneralNotesCaseListed")
    private String et3GeneralNotesCaseListed;
    // ET3 Transfer Application
    @JsonProperty("et3TribunalLocation")
    private String et3TribunalLocation;
    @JsonProperty("et3IsThisLocationCorrect")
    private String et3IsThisLocationCorrect;
    @JsonProperty("et3GeneralNotesTransferApplication")
    private String et3GeneralNotesTransferApplication;
    @JsonProperty("et3RegionalOffice")
    private String et3RegionalOffice;
    @JsonProperty("et3WhyWeShouldChangeTheOffice")
    private String et3WhyWeShouldChangeTheOffice;
    // ET3 Resist the claim
    @JsonProperty("et3ContestClaim")
    private String et3ContestClaim;
    @JsonProperty("et3ContestClaimGiveDetails")
    private String et3ContestClaimGiveDetails;
    @JsonProperty("et3GeneralNotesContestClaim")
    private String et3GeneralNotesContestClaim;
    // ET3 Contract claim section 7
    @JsonProperty("et3ContractClaimSection7")
    private String et3ContractClaimSection7;
    @JsonProperty("et3ContractClaimSection7Details")
    private String et3ContractClaimSection7Details;
    @JsonProperty("et3GeneralNotesContractClaimSection7")
    private String et3GeneralNotesContractClaimSection7;
    // ET3 suggested issues
    @JsonProperty("et3Rule26")
    private String et3Rule26;
    @JsonProperty("et3Rule26Details")
    private String et3Rule26Details;
    @JsonProperty("et3SuggestedIssues")
    private List<String> et3SuggestedIssues;
    @JsonProperty("et3SuggestedIssuesStrikeOut")
    private String et3SuggestedIssuesStrikeOut;
    @JsonProperty("et3SuggestedIssueInterpreters")
    private String et3SuggestedIssueInterpreters;
    @JsonProperty("et3SuggestedIssueJurisdictional")
    private String et3SuggestedIssueJurisdictional;
    @JsonProperty("et3SuggestedIssueAdjustments")
    private String et3SuggestedIssueAdjustments;
    @JsonProperty("et3SuggestedIssueRule50")
    private String et3SuggestedIssueRule50;
    @JsonProperty("et3SuggestedIssueTimePoints")
    private String et3SuggestedIssueTimePoints;
    @JsonProperty("et3GeneralNotesRule26")
    private String et3GeneralNotesRule26;
    // ET3 Final notes
    @JsonProperty("et3AdditionalInformation")
    private String et3AdditionalInformation;

    // ET Initial Consideration

    @JsonProperty("etInitialConsiderationDocument")
    private UploadedDocumentType etInitialConsiderationDocument;
    @JsonProperty("etInitialConsiderationRespondent")
    private String etInitialConsiderationRespondent;
    @JsonProperty("etInitialConsiderationHearing")
    private String etInitialConsiderationHearing;
    @JsonProperty("etInitialConsiderationJurisdictionCodes")
    private String etInitialConsiderationJurisdictionCodes;
    @JsonProperty("icReceiptET3FormIssues")
    private String icReceiptET3FormIssues;
    @JsonProperty("icRespondentsNameIdentityIssues")
    private String icRespondentsNameIdentityIssues;
    @JsonProperty("icJurisdictionCodeIssues")
    private String icJurisdictionCodeIssues;
    @JsonProperty("icApplicationIssues")
    private String icApplicationIssues;
    @JsonProperty("icEmployersContractClaimIssues")
    private String icEmployersContractClaimIssues;
    @JsonProperty("icClaimProspectIssues")
    private String icClaimProspectIssues;
    @JsonProperty("icListingIssues")
    private String icListingIssues;
    @JsonProperty("icListingPreliminaryHearing")
    private String icListingPreliminaryHearing;
    @JsonProperty("icDdaDisabilityIssues")
    private String icDdaDisabilityIssues;
    @JsonProperty("icOrderForFurtherInformation")
    private String icOrderForFurtherInformation;
    @JsonProperty("icOtherIssuesOrFinalOrders")
    private String icOtherIssuesOrFinalOrders;
    @JsonProperty("etICJuridictionCodesInvalid")
    private String etICJuridictionCodesInvalid;
    @JsonProperty("etICInvalidDetails")
    private String etICInvalidDetails;
    @JsonProperty("etICCanProceed")
    private String etICCanProceed;
    @JsonProperty("etICHearingAlreadyListed")
    private String etICHearingAlreadyListed;
    // ET Initial Consideration - Hearing Not Listed
    @JsonProperty("etICHearingNotListedList")
    private List<String> etICHearingNotListedList;
    @JsonProperty("etICHearingNotListedSeekComments")
    private EtICSeekComments etICHearingNotListedSeekComments;
    @JsonProperty("etICHearingNotListedListForPrelimHearing")
    private EtICListForPreliminaryHearing etICHearingNotListedListForPrelimHearing;
    @JsonProperty("etICHearingNotListedListForFinalHearing")
    private EtICListForFinalHearing etICHearingNotListedListForFinalHearing;
    @JsonProperty("etICHearingNotListedUDLHearing")
    private EtIcudlHearing etICHearingNotListedUDLHearing;
    @JsonProperty("etICHearingNotListedAnyOtherDirections")
    private String etICHearingNotListedAnyOtherDirections;
    // ET Initial Consideration - Hearing already listed

    @JsonProperty("etICHearingListedAnswers")
    private EtICHearingListedAnswers etICHearingListedAnswers;
    @JsonProperty("etICHearingListed")
    private List<String> etICHearingListed;
    @JsonProperty("etICExtendDurationGiveDetails")
    private String etICExtendDurationGiveDetails;
    @JsonProperty("etICOtherGiveDetails")
    private String etICOtherGiveDetails;
    @JsonProperty("etICHearingAnyOtherDirections")
    private String etICHearingAnyOtherDirections;
    @JsonProperty("etICPostponeGiveDetails")
    private String etICPostponeGiveDetails;
    @JsonProperty("etICConvertPreliminaryGiveDetails")
    private String etICConvertPreliminaryGiveDetails;
    @JsonProperty("etICConvertF2fGiveDetails")
    private String etICConvertF2fGiveDetails;
    // ET Initial Consideration – Further Info
    @JsonProperty("etICFurtherInformation")
    private List<String> etICFurtherInformation;
    @JsonProperty("etICFurtherInfoAnswers")
    private EtICFurtherInfoAnswers etICFurtherInfoAnswers;
    @JsonProperty("etICFurtherInformationHearingAnyOtherDirections")
    private String etICFurtherInformationHearingAnyOtherDirections;
    @JsonProperty("etICFurtherInformationGiveDetails")
    private String etICFurtherInformationGiveDetails;
    @JsonProperty("etICFurtherInformationTimeToComply")
    private String etICFurtherInformationTimeToComply;
    @JsonProperty("etInitialConsiderationRule27")
    private EtInitialConsiderationRule27 etInitialConsiderationRule27;
    @JsonProperty("etInitialConsiderationRule28")
    private EtInitialConsiderationRule28 etInitialConsiderationRule28;

    // ET3 Response
    @JsonProperty("et3ResponseShowInset")
    private String et3ResponseShowInset;
    // ET3 Response - Claimant name page (3)
    @JsonProperty("et3ResponseClaimantName")
    private String et3ResponseClaimantName;
    @JsonProperty("et3ResponseIsClaimantNameCorrect")
    private String et3ResponseIsClaimantNameCorrect;
    @JsonProperty("et3ResponseClaimantNameCorrection")
    private String et3ResponseClaimantNameCorrection;
    // ET3 Response - What is the respondent's name (4)
    @JsonProperty("et3ResponseNameShowInset")
    private String et3ResponseNameShowInset;
    @JsonProperty("et3ResponseRespondentLegalName")
    private String et3ResponseRespondentLegalName;
    @JsonProperty("et3ResponseRespondentCompanyNumber")
    private String et3ResponseRespondentCompanyNumber;
    @JsonProperty("et3ResponseRespondentEmployerType")
    private String et3ResponseRespondentEmployerType;
    @JsonProperty("et3ResponseRespondentPreferredTitle")
    private String et3ResponseRespondentPreferredTitle;
    @JsonProperty("et3ResponseRespondentContactName")
    private String et3ResponseRespondentContactName;
    // ET3 Response - Respondent address (5)
    @JsonProperty("et3RespondentAddress")
    private Address et3RespondentAddress;
    @JsonProperty("et3ResponseDXAddress")
    private String et3ResponseDXAddress;
    // ET3 Response - Phone number page (6)
    @JsonProperty("et3ResponsePhone")
    private String et3ResponsePhone;
    // ET3 Response - What is your reference number (7)
    @JsonProperty("et3ResponseReference")
    private String et3ResponseReference;
    // ET3 Response - Contact method page (8)
    @JsonProperty("et3ResponseContactPreference")
    private String et3ResponseContactPreference;
    @JsonProperty("et3ResponseContactReason")
    private String et3ResponseContactReason;
    // ET3 Response - Hearing format page (9)
    @JsonProperty("et3ResponseHearingRepresentative")
    private List<String> et3ResponseHearingRepresentative;
    @JsonProperty("et3ResponseHearingRespondent")
    private List<String> et3ResponseHearingRespondent;
    // ET3 Response - Respondent's workforce page (10)
    @JsonProperty("et3ResponseEmploymentCount")
    private String et3ResponseEmploymentCount;
    @JsonProperty("et3ResponseMultipleSites")
    private String et3ResponseMultipleSites;
    @JsonProperty("et3ResponseSiteEmploymentCount")
    private String et3ResponseSiteEmploymentCount;
    // ET3 Response - Acas page (11)
    @JsonProperty("et3ResponseAcasAgree")
    private String et3ResponseAcasAgree;
    @JsonProperty("et3ResponseAcasAgreeReason")
    private String et3ResponseAcasAgreeReason;
    // ET3 Response - Are the employment dates correct page (12)
    @JsonProperty("et3ResponseAreDatesCorrect")
    private String et3ResponseAreDatesCorrect;
    // ET3 Response - Employment dates page (13)
    @JsonProperty("et3ResponseEmploymentStartDate")
    private String et3ResponseEmploymentStartDate;
    @JsonProperty("et3ResponseEmploymentEndDate")
    private String et3ResponseEmploymentEndDate;
    @JsonProperty("et3ResponseEmploymentInformation")
    private String et3ResponseEmploymentInformation;
    // ET3 Response - Is employment continuing page (14)
    @JsonProperty("et3ResponseContinuingEmployment")
    private String et3ResponseContinuingEmployment;
    // ET3 Response - Is claimant job title/description correct? (15)
    @JsonProperty("et3ResponseIsJobTitleCorrect")
    private String et3ResponseIsJobTitleCorrect;
    @JsonProperty("et3ResponseCorrectJobTitle")
    private String et3ResponseCorrectJobTitle;
    // ET3 Response - Claimant total weekly work hours (16)
    @JsonProperty("et3ResponseClaimantWeeklyHours")
    private String et3ResponseClaimantWeeklyHours;
    @JsonProperty("et3ResponseClaimantCorrectHours")
    private String et3ResponseClaimantCorrectHours;
    // ET3 Response - Earning details (17)
    @JsonProperty("et3ResponseEarningDetailsCorrect")
    private String et3ResponseEarningDetailsCorrect;
    // ET3 Response - Correct pay details (18)
    @JsonProperty("et3ResponsePayFrequency")
    private String et3ResponsePayFrequency;
    @JsonProperty("et3ResponsePayBeforeTax")
    private String et3ResponsePayBeforeTax;
    @JsonProperty("et3ResponsePayTakehome")
    private String et3ResponsePayTakehome;
    // ET3 Response - Notice given (19)
    @JsonProperty("et3ResponseIsNoticeCorrect")
    private String et3ResponseIsNoticeCorrect;
    @JsonProperty("et3ResponseCorrectNoticeDetails")
    private String et3ResponseCorrectNoticeDetails;
    // ET3 Response - pension details (20)
    @JsonProperty("et3ResponseIsPensionCorrect")
    private String et3ResponseIsPensionCorrect;
    @JsonProperty("et3ResponsePensionCorrectDetails")
    private String et3ResponsePensionCorrectDetails;
    // ET3 Response - contest claim (21)
    @JsonProperty("et3ResponseRespondentContestClaim")
    private String et3ResponseRespondentContestClaim;
    // ET3 Response - explain contest claim (22)
    @JsonProperty("et3ResponseContestClaimDocument")
    private List<DocumentTypeItem> et3ResponseContestClaimDocument;
    @JsonProperty("et3ResponseContestClaimDetails")
    private String et3ResponseContestClaimDetails;
    // ET3 Response - employer claim (23)
    @JsonProperty("et3ResponseEmployerClaim")
    private String et3ResponseEmployerClaim;
    // ET3 Response - explain employer claim (24)
    @JsonProperty("et3ResponseEmployerClaimDetails")
    private String et3ResponseEmployerClaimDetails;
    @JsonProperty("et3ResponseEmployerClaimDocument")
    private UploadedDocumentType et3ResponseEmployerClaimDocument;
    // ET3 Response - health conditions (25)
    @JsonProperty("et3ResponseRespondentSupportNeeded")
    private String et3ResponseRespondentSupportNeeded;
    // ET3 Response - Details on health conditions (26)
    @JsonProperty("et3ResponseRespondentSupportDetails")
    private String et3ResponseRespondentSupportDetails;
    @JsonProperty("et3ResponseRespondentSupportDocument")
    private UploadedDocumentType et3ResponseRespondentSupportDocument;

    // ET3 Notification
    @JsonProperty("et3NotificationDocCollection")
    private List<DocumentTypeItem> et3NotificationDocCollection;
    @JsonProperty("et3OtherTypeDocumentName")
    private String et3OtherTypeDocumentName;
    @JsonProperty("et3NotificationDocRecipient")
    private List<String> et3NotificationDocRecipient;
    @JsonProperty("et3ClaimantAndRespondentAddresses")
    private String et3ClaimantAndRespondentAddresses;
    @JsonProperty("et3EmailLinkToAcas")
    private String et3EmailLinkToAcas;

    //Referral
    @JsonProperty("referralCollection")
    private List<ReferralTypeItem> referralCollection;
    @JsonProperty("referralHearingDetails")
    private String referralHearingDetails;
    @JsonProperty("selectReferral")
    private DynamicFixedListType selectReferral;
    @JsonProperty("replyToReferralDcfLink")
    private String replyToReferralDcfLink;
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

    // Upload Documents Rejection
    @JsonProperty("caseRejectedEmailSent")
    private String caseRejectedEmailSent;

    // Respondent Organisation Policies
    @JsonProperty("respondentOrganisationPolicy0")
    private OrganisationPolicy respondentOrganisationPolicy0;
    @JsonProperty("respondentOrganisationPolicy1")
    private OrganisationPolicy respondentOrganisationPolicy1;
    @JsonProperty("respondentOrganisationPolicy2")
    private OrganisationPolicy respondentOrganisationPolicy2;
    @JsonProperty("respondentOrganisationPolicy3")
    private OrganisationPolicy respondentOrganisationPolicy3;
    @JsonProperty("respondentOrganisationPolicy4")
    private OrganisationPolicy respondentOrganisationPolicy4;
    @JsonProperty("respondentOrganisationPolicy5")
    private OrganisationPolicy respondentOrganisationPolicy5;
    @JsonProperty("respondentOrganisationPolicy6")
    private OrganisationPolicy respondentOrganisationPolicy6;
    @JsonProperty("respondentOrganisationPolicy7")
    private OrganisationPolicy respondentOrganisationPolicy7;
    @JsonProperty("respondentOrganisationPolicy8")
    private OrganisationPolicy respondentOrganisationPolicy8;
    @JsonProperty("respondentOrganisationPolicy9")
    private OrganisationPolicy respondentOrganisationPolicy9;
    @JsonProperty("suggestedHearingVenues")
    private DynamicFixedListType suggestedHearingVenues;
    @JsonProperty("listedDateInPastWarning")
    private String listedDateInPastWarning;
    @JsonProperty("noticeOfChangeAnswers0")
    private NoticeOfChangeAnswers noticeOfChangeAnswers0;
    @JsonProperty("noticeOfChangeAnswers1")
    private NoticeOfChangeAnswers noticeOfChangeAnswers1;
    @JsonProperty("noticeOfChangeAnswers2")
    private NoticeOfChangeAnswers noticeOfChangeAnswers2;
    @JsonProperty("noticeOfChangeAnswers3")
    private NoticeOfChangeAnswers noticeOfChangeAnswers3;
    @JsonProperty("noticeOfChangeAnswers4")
    private NoticeOfChangeAnswers noticeOfChangeAnswers4;
    @JsonProperty("noticeOfChangeAnswers5")
    private NoticeOfChangeAnswers noticeOfChangeAnswers5;
    @JsonProperty("noticeOfChangeAnswers6")
    private NoticeOfChangeAnswers noticeOfChangeAnswers6;
    @JsonProperty("noticeOfChangeAnswers7")
    private NoticeOfChangeAnswers noticeOfChangeAnswers7;
    @JsonProperty("noticeOfChangeAnswers8")
    private NoticeOfChangeAnswers noticeOfChangeAnswers8;
    @JsonProperty("noticeOfChangeAnswers9")
    private NoticeOfChangeAnswers noticeOfChangeAnswers9;
    @JsonProperty("changeOrganisationRequestField")
    private ChangeOrganisationRequest changeOrganisationRequestField;

    // Claimant TSE
    @JsonProperty("claimantTse")
    private ClaimantTse claimantTse;

    //Respondent Tell Something Else
    @JsonProperty("resTseNotAvailableWarning")
    private String resTseNotAvailableWarning;
    @JsonProperty("tseRespondNotAvailableWarning")
    private String tseRespondNotAvailableWarning;
    @JsonProperty("respondToTribunalNotAvailableWarning")
    private String respondToTribunalNotAvailableWarning;
    @JsonProperty("resTseSelectApplication")
    private String resTseSelectApplication;
    @JsonProperty("resTseVariableContent")
    private String resTseVariableContent;
    @JsonProperty("resTseDocument1")
    private UploadedDocumentType resTseDocument1;
    @JsonProperty("resTseTextBox1")
    private String resTseTextBox1;
    @JsonProperty("resTseDocument2")
    private UploadedDocumentType resTseDocument2;
    @JsonProperty("resTseTextBox2")
    private String resTseTextBox2;
    @JsonProperty("resTseDocument3")
    private UploadedDocumentType resTseDocument3;
    @JsonProperty("resTseTextBox3")
    private String resTseTextBox3;
    @JsonProperty("resTseDocument4")
    private UploadedDocumentType resTseDocument4;
    @JsonProperty("resTseTextBox4")
    private String resTseTextBox4;
    @JsonProperty("resTseDocument5")
    private UploadedDocumentType resTseDocument5;
    @JsonProperty("resTseTextBox5")
    private String resTseTextBox5;
    @JsonProperty("resTseDocument6")
    private UploadedDocumentType resTseDocument6;
    @JsonProperty("resTseTextBox6")
    private String resTseTextBox6;
    @JsonProperty("resTseDocument7")
    private UploadedDocumentType resTseDocument7;
    @JsonProperty("resTseTextBox7")
    private String resTseTextBox7;
    @JsonProperty("resTseDocument8")
    private UploadedDocumentType resTseDocument8;
    @JsonProperty("resTseTextBox8")
    private String resTseTextBox8;
    @JsonProperty("resTseDocument9")
    private UploadedDocumentType resTseDocument9;
    @JsonProperty("resTseTextBox9")
    private String resTseTextBox9;
    @JsonProperty("resTseDocument10")
    private UploadedDocumentType resTseDocument10;
    @JsonProperty("resTseTextBox10")
    private String resTseTextBox10;
    @JsonProperty("resTseDocument11")
    private UploadedDocumentType resTseDocument11;
    @JsonProperty("resTseTextBox11")
    private String resTseTextBox11;
    @JsonProperty("resTseDocument12")
    private UploadedDocumentType resTseDocument12;
    @JsonProperty("resTseTextBox12")
    private String resTseTextBox12;
    @JsonProperty("resTseCopyToOtherPartyYesOrNo")
    private String resTseCopyToOtherPartyYesOrNo;
    @JsonProperty("resTseCopyToOtherPartyTextArea")
    private String resTseCopyToOtherPartyTextArea;
    @JsonProperty("genericTseApplicationCollection")
    private List<GenericTseApplicationTypeItem> genericTseApplicationCollection;
    @JsonProperty("tseApplicationStoredCollection")
    private List<GenericTseApplicationTypeItem> tseApplicationStoredCollection;

    // Claimant tell something else
    @JsonProperty("claimantTseSelectApplication")
    private String claimantTseSelectApplication;
    @JsonProperty("claimantTseRule92")
    private String claimantTseRule92;
    @JsonProperty("claimantTseRespNotAvailable")
    private String claimantTseRespNotAvailable;
    @JsonProperty("claimantTseDocument1")
    private UploadedDocumentType claimantTseDocument1;
    @JsonProperty("claimantTseTextBox1")
    private String claimantTseTextBox1;
    @JsonProperty("claimantTseDocument2")
    private UploadedDocumentType claimantTseDocument2;
    @JsonProperty("claimantTseTextBox2")
    private String claimantTseTextBox2;
    @JsonProperty("claimantTseDocument3")
    private UploadedDocumentType claimantTseDocument3;
    @JsonProperty("claimantTseTextBox3")
    private String claimantTseTextBox3;
    @JsonProperty("claimantTseDocument4")
    private UploadedDocumentType claimantTseDocument4;
    @JsonProperty("claimantTseTextBox4")
    private String claimantTseTextBox4;
    @JsonProperty("claimantTseDocument5")
    private UploadedDocumentType claimantTseDocument5;
    @JsonProperty("claimantTseTextBox5")
    private String claimantTseTextBox5;
    @JsonProperty("claimantTseDocument6")
    private UploadedDocumentType claimantTseDocument6;
    @JsonProperty("claimantTseTextBox6")
    private String claimantTseTextBox6;
    @JsonProperty("claimantTseDocument7")
    private UploadedDocumentType claimantTseDocument7;
    @JsonProperty("claimantTseTextBox7")
    private String claimantTseTextBox7;
    @JsonProperty("claimantTseDocument8")
    private UploadedDocumentType claimantTseDocument8;
    @JsonProperty("claimantTseTextBox8")
    private String claimantTseTextBox8;
    @JsonProperty("claimantTseDocument9")
    private UploadedDocumentType claimantTseDocument9;
    @JsonProperty("claimantTseTextBox9")
    private String claimantTseTextBox9;
    @JsonProperty("claimantTseDocument10")
    private UploadedDocumentType claimantTseDocument10;
    @JsonProperty("claimantTseTextBox10")
    private String claimantTseTextBox10;
    @JsonProperty("claimantTseDocument11")
    private UploadedDocumentType claimantTseDocument11;
    @JsonProperty("claimantTseTextBox11")
    private String claimantTseTextBox11;
    @JsonProperty("claimantTseDocument12")
    private UploadedDocumentType claimantTseDocument12;
    @JsonProperty("claimantTseTextBox12")
    private String claimantTseTextBox12;
    @JsonProperty("claimantTseDocument13")
    private UploadedDocumentType claimantTseDocument13;
    @JsonProperty("claimantTseTextBox13")
    private String claimantTseTextBox13;
    @JsonProperty("claimantTseRule92AnsNoGiveDetails")
    private String claimantTseRule92AnsNoGiveDetails;

    //TSE Admin Record a Decision
    @JsonProperty("tseAdminSelectApplication")
    private DynamicFixedListType tseAdminSelectApplication;
    @JsonProperty("tseAdminTableMarkUp")
    private String tseAdminTableMarkUp;
    @JsonProperty("tseAdminEnterNotificationTitle")
    private String tseAdminEnterNotificationTitle;
    @JsonProperty("tseAdminDecision")
    private String tseAdminDecision;
    @JsonProperty("tseAdminDecisionDetails")
    private String tseAdminDecisionDetails;
    @JsonProperty("tseAdminTypeOfDecision")
    private String tseAdminTypeOfDecision;
    @JsonProperty("tseAdminIsResponseRequired")
    private String tseAdminIsResponseRequired;
    @JsonProperty("tseAdminSelectPartyRespond")
    private String tseAdminSelectPartyRespond;
    @JsonProperty("tseAdminAdditionalInformation")
    private String tseAdminAdditionalInformation;
    @JsonProperty("tseAdminResponseRequiredYesDoc")
    private List<GenericTypeItem<DocumentType>> tseAdminResponseRequiredYesDoc;
    @JsonProperty("tseAdminResponseRequiredNoDoc")
    private List<GenericTypeItem<DocumentType>> tseAdminResponseRequiredNoDoc;
    @JsonProperty("tseAdminDecisionMadeBy")
    private String tseAdminDecisionMadeBy;
    @JsonProperty("tseAdminDecisionMadeByFullName")
    private String tseAdminDecisionMadeByFullName;
    @JsonProperty("tseAdminSelectPartyNotify")
    private String tseAdminSelectPartyNotify;

    //TSE Response
    @JsonProperty("tseRespondSelectApplication")
    private DynamicFixedListType tseRespondSelectApplication;
    @JsonProperty("tseResponseIntro")
    private String tseResponseIntro;
    @JsonProperty("tseResponseTable")
    private String tseResponseTable;
    @JsonProperty("tseResponseText")
    private String tseResponseText;
    @JsonProperty("tseResponseHasSupportingMaterial")
    private String tseResponseHasSupportingMaterial;
    @JsonProperty("tseResponseSupportingMaterial")
    private List<GenericTypeItem<DocumentType>> tseResponseSupportingMaterial;
    @JsonProperty("tseResponseCopyToOtherParty")
    private String tseResponseCopyToOtherParty;
    @JsonProperty("tseResponseCopyNoGiveDetails")
    private String tseResponseCopyNoGiveDetails;
    @JsonProperty("resTseTableMarkUp")
    private String resTseTableMarkUp;
    //  if Respondent is responding to Tribunal
    @JsonProperty("tseRespondingToTribunal")
    private String tseRespondingToTribunal;
    @JsonProperty("tseRespondingToTribunalText")
    private String tseRespondingToTribunalText;

    //TSE Admin Respond to an application
    @JsonProperty("tseAdmReplyTableMarkUp")
    private String tseAdmReplyTableMarkUp;
    @JsonProperty("tseAdmReplyEnterResponseTitle")
    private String tseAdmReplyEnterResponseTitle;
    @JsonProperty("tseAdmReplyAdditionalInformation")
    private String tseAdmReplyAdditionalInformation;
    @JsonProperty("tseAdmReplyAddDocument")
    private List<GenericTypeItem<DocumentType>> tseAdmReplyAddDocument;
    @JsonProperty("tseAdmReplyIsCmoOrRequest")
    private String tseAdmReplyIsCmoOrRequest;
    @JsonProperty("tseAdmReplyCmoMadeBy")
    private String tseAdmReplyCmoMadeBy;
    @JsonProperty("tseAdmReplyRequestMadeBy")
    private String tseAdmReplyRequestMadeBy;
    @JsonProperty("tseAdmReplyCmoEnterFullName")
    private String tseAdmReplyCmoEnterFullName;
    @JsonProperty("tseAdmReplyCmoIsResponseRequired")
    private String tseAdmReplyCmoIsResponseRequired;
    @JsonProperty("tseAdmReplyRequestEnterFullName")
    private String tseAdmReplyRequestEnterFullName;
    @JsonProperty("tseAdmReplyRequestIsResponseRequired")
    private String tseAdmReplyRequestIsResponseRequired;
    @JsonProperty("tseAdmReplyRequestSelectPartyRespond")
    private String tseAdmReplyRequestSelectPartyRespond;
    @JsonProperty("tseAdmReplyCmoSelectPartyRespond")
    private String tseAdmReplyCmoSelectPartyRespond;
    @JsonProperty("tseAdmReplySelectPartyNotify")
    private String tseAdmReplySelectPartyNotify;

    // TSe Admin Close an application
    @JsonProperty("tseAdminCloseApplicationTable")
    private String tseAdminCloseApplicationTable;
    @JsonProperty("tseAdminCloseApplicationText")
    private String tseAdminCloseApplicationText;

    // Tell something else - view an application
    @JsonProperty("tseViewApplicationOpenOrClosed")
    private String tseViewApplicationOpenOrClosed;
    @JsonProperty("tseViewApplicationSelect")
    private DynamicFixedListType tseViewApplicationSelect;
    @JsonProperty("tseApplicationSummaryAndResponsesMarkup")
    private String tseApplicationSummaryAndResponsesMarkup;

    // Provide Something Else to tribunal - Respondent - Respond to an order or request from the tribunal
    @JsonProperty("pseRespondentSelectOrderOrRequest")
    private DynamicFixedListType pseRespondentSelectOrderOrRequest;
    @JsonProperty("pseRespondentOrdReqTableMarkUp")
    private String pseRespondentOrdReqTableMarkUp;
    @JsonProperty("pseRespondentOrdReqResponseText")
    private String pseRespondentOrdReqResponseText;
    @JsonProperty("pseRespondentOrdReqHasSupportingMaterial")
    private String pseRespondentOrdReqHasSupportingMaterial;
    @JsonProperty("pseRespondentOrdReqUploadDocument")
    private List<GenericTypeItem<DocumentType>> pseRespondentOrdReqUploadDocument;
    @JsonProperty("pseRespondentOrdReqCopyToOtherParty")
    private String pseRespondentOrdReqCopyToOtherParty;
    @JsonProperty("pseRespondentOrdReqCopyNoGiveDetails")
    private String pseRespondentOrdReqCopyNoGiveDetails;

    // Provide Something Else to tribunal - Respondent - View a judgment, order or notification
    @JsonProperty("pseRespondentSelectJudgmentOrderNotification")
    private DynamicFixedListType pseRespondentSelectJudgmentOrderNotification;

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
    @JsonProperty("notificationSentFrom")
    private String notificationSentFrom;

    @JsonProperty("selectNotificationDropdown")
    private DynamicFixedListType selectNotificationDropdown;

    @JsonProperty("notificationMarkdown")
    private String notificationMarkdown;

    @JsonProperty("pseViewNotifications")
    private String pseViewNotifications;

    @JsonProperty("et3RepresentingRespondent")
    private List<DynamicListTypeItem> et3RepresentingRespondent;

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

    // Bundles Respondent
    @JsonProperty("bundlesRespondentPrepareDocNotesShow")
    private String bundlesRespondentPrepareDocNotesShow;

    @JsonProperty("bundlesRespondentAgreedDocWith")
    private String bundlesRespondentAgreedDocWith;
    @JsonProperty("bundlesRespondentAgreedDocWithBut")
    private String bundlesRespondentAgreedDocWithBut;
    @JsonProperty("bundlesRespondentAgreedDocWithNo")
    private String bundlesRespondentAgreedDocWithNo;

    @JsonProperty("bundlesRespondentSelectHearing")
    private DynamicFixedListType bundlesRespondentSelectHearing;

    @JsonProperty("submitEt3Respondent")
    private DynamicFixedListType submitEt3Respondent;

    @JsonProperty("bundlesRespondentWhatDocuments")
    private String bundlesRespondentWhatDocuments;

    @JsonProperty("bundlesRespondentWhoseDocuments")
    private String bundlesRespondentWhoseDocuments;

    @JsonProperty("bundlesRespondentUploadFile")
    private UploadedDocumentType bundlesRespondentUploadFile;
    @JsonProperty("bundlesRespondentCollection")
    private List<GenericTypeItem<HearingBundleType>> bundlesRespondentCollection;

    // Claimant Bundles
    @JsonProperty("bundlesClaimantCollection")
    private List<GenericTypeItem<HearingBundleType>> bundlesClaimantCollection;

    // Remove Hearing Bundle
    @JsonProperty("removedHearingBundlesCollection")
    private List<GenericTypeItem<RemovedHearingBundleItem>> removedHearingBundlesCollection;

    @JsonProperty("removeHearingBundleSelect")
    private DynamicFixedListType removeHearingBundleSelect;

    @JsonProperty("removeBundleDropDownSelectedParty")
    private String removeBundleDropDownSelectedParty;

    @JsonProperty("hearingBundleRemoveReason")
    private String hearingBundleRemoveReason;

    @JsonProperty("adrDocumentCollection")
    private List<DocumentTypeItem> adrDocumentCollection;
    @JsonProperty("piiDocumentCollection")
    private List<DocumentTypeItem> piiDocumentCollection;
    @JsonProperty("appealDocumentCollection")
    private List<DocumentTypeItem> appealDocumentCollection;

    // Case Flags
    private CaseFlagsType caseFlags;
    private CaseFlagsType claimantFlags;
    private CaseFlagsType respondentFlags;

    //et-hearings-api
    @JsonProperty("autoListFlag")
    private String autoListFlag;

    @JsonProperty("caseAdditionalSecurityFlag")
    private String caseAdditionalSecurityFlag;
    @JsonProperty("caseCategories")
    private List<CaseCategory> caseCategories;
    @JsonProperty("caseDeepLink")
    private String caseDeepLink;

    @JsonProperty("caseInterpreterRequiredFlag")
    private String caseInterpreterRequiredFlag;
    @JsonProperty("caseManagementLocationCode")
    private String caseManagementLocationCode;
    @JsonProperty("caseSLAStartDate")
    private String caseSLAStartDate;
    @JsonProperty("caseRestrictedFlag")
    private String caseRestrictedFlag;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("externalCaseReference")
    private String externalCaseReference;

    @JsonProperty("facilitiesRequiredList")
    private List<String> facilitiesRequiredList;

    @JsonProperty("hearingChannels")
    private List<String> hearingChannels;
    @JsonProperty("hearingInWelshFlag")
    private String hearingInWelshFlag;
    @JsonProperty("hearingIsLinkedFlag")
    private String hearingIsLinkedFlag;
    @JsonProperty("hearingLocations")
    private List<HearingLocation> hearingLocations;
    @JsonProperty("hearingPriorityType")
    private String hearingPriorityType;
    @JsonProperty("hearingRequester")
    private String hearingRequester;
    @JsonProperty("hearingType")
    private String hearingType;
    @JsonProperty("hearingWindow")
    private HearingWindow hearingWindow;
    @JsonProperty("caseNameHmctsInternal")
    private String caseNameHmctsInternal;
    @JsonProperty("caseManagementCategory")
    private DynamicFixedListType caseManagementCategory;
    @JsonProperty("hmctsServiceID")
    private String hmctsServiceID;
    @JsonProperty("hmctsCaseCategory")
    private String hmctsCaseCategory;

    @JsonProperty("judiciary")
    private Judiciary judiciary;
    @JsonProperty("leadJudgeContractType")
    private String leadJudgeContractType;

    @JsonProperty("listingComments")
    private String listingComments;

    @JsonProperty("numberOfPhysicalAttendees")
    private Integer numberOfPhysicalAttendees;

    @JsonProperty("panelRequirements")
    private PanelRequirements panelRequirements;

    @JsonProperty("parties")
    private List<PartyDetails> parties;

    @JsonProperty("privateHearingRequiredFlag")
    private String privateHearingRequiredFlag;

    @JsonProperty("publicCaseName")
    private String publicCaseName;

    @JsonProperty("screenFlow")
    private List<ScreenNavigation> screenFlow;

    @JsonProperty("vocabulary")
    private List<Vocabulary> vocabulary;

    @JsonProperty("caseLinks")
    private ListTypeItem<CaseLink> caseLinks;

    @JsonProperty("partySelection")
    private List<String> partySelection;

    @JsonProperty("claimantUnavailability")
    private ListTypeItem<UnavailabilityRanges> claimantUnavailability;

    @JsonProperty("respondentUnavailability")
    private ListTypeItem<UnavailabilityRanges> respondentUnavailability;
    @JsonProperty("acasCertificate")
    private String acasCertificate;

    @JsonProperty("SearchCriteria")
    private SearchCriteria searchCriteria;

    private String waRule21ReferralSent;

    @JsonProperty("batchCaseStayed")
    private String batchCaseStayed;


    /**
     * Convenience method for using the new ListTypeItem pattern for setting repCollection.
     * @param repCollection Collection of respondent representatives
     */
    @Tolerate
    void setRepCollection(ListTypeItem<RepresentedTypeR> repCollection) {
        this.repCollection = repCollection.stream()
                .map(o -> RepresentedTypeRItem.builder().id(o.getId()).value(o.getValue()).build())
                .toList();
    }

    @JsonProperty("et1ReppedTriageAddress")
    private Address et1ReppedTriageAddress;
    @JsonProperty("et1ReppedTriageYesNo")
    private String et1ReppedTriageYesNo;
    @JsonProperty("et1ClaimStatuses")
    private String et1ClaimStatuses;

    @JsonProperty("et1ReppedSectionOne")
    private String et1ReppedSectionOne;
    @JsonProperty("et1ReppedSectionTwo")
    private String et1ReppedSectionTwo;
    @JsonProperty("et1ReppedSectionThree")
    private String et1ReppedSectionThree;

    @JsonProperty("claimantFirstName")
    private String claimantFirstName;
    @JsonProperty("claimantLastName")
    private String claimantLastName;
    @JsonProperty("claimantDateOfBirth")
    private String claimantDateOfBirth;
    @JsonProperty("claimantSex")
    private List<String> claimantSex;
    @JsonProperty("claimantPreferredTitle")
    private String claimantPreferredTitle;
    @JsonProperty("claimantContactAddress")
    private Address claimantContactAddress;
    @JsonProperty("representativeAttendHearing")
    private List<String> representativeAttendHearing;
    @JsonProperty("claimantAttendHearing")
    private List<String> claimantAttendHearing;
    @JsonProperty("claimantSupportQuestion")
    private List<String> claimantSupportQuestion;
    @JsonProperty("claimantSupportQuestionReason")
    private String claimantSupportQuestionReason;
    @JsonProperty("representativeContactPreference")
    private List<String> representativeContactPreference;
    @JsonProperty("contactPreferencePostReason")
    private String contactPreferencePostReason;
    @JsonProperty("representativePhoneNumber")
    private String representativePhoneNumber;
    @JsonProperty("representativeReferenceNumber")
    private String representativeReferenceNumber;

    @JsonProperty("didClaimantWorkForOrg")
    private List<String> didClaimantWorkForOrg;
    @JsonProperty("claimantStillWorking")
    private List<String> claimantStillWorking;
    @JsonProperty("claimantJobTitle")
    private String claimantJobTitle;
    @JsonProperty("claimantStartDate")
    private String claimantStartDate;
    @JsonProperty("claimantEndDate")
    private String claimantEndDate;
    @JsonProperty("claimantStillWorkingNoticePeriod")
    private List<String> claimantStillWorkingNoticePeriod;
    @JsonProperty("claimantStillWorkingNoticePeriodMonths")
    private String claimantStillWorkingNoticePeriodMonths;
    @JsonProperty("claimantStillWorkingNoticePeriodWeeks")
    private String claimantStillWorkingNoticePeriodWeeks;
    @JsonProperty("claimantWorkingNoticePeriod")
    private List<String> claimantWorkingNoticePeriod;
    @JsonProperty("claimantWorkingNoticePeriodMonths")
    private String claimantWorkingNoticePeriodMonths;
    @JsonProperty("claimantWorkingNoticePeriodWeeks")
    private String claimantWorkingNoticePeriodWeeks;
    @JsonProperty("claimantWorkingNoticePeriodEndDate")
    private String claimantWorkingNoticePeriodEndDate;
    @JsonProperty("claimantNoLongerWorkingQuestion")
    private List<String> claimantNoLongerWorkingQuestion;
    @JsonProperty("claimantNoLongerWorking")
    private List<String> claimantNoLongerWorking;
    @JsonProperty("claimantNoLongerWorkingMonths")
    private String claimantNoLongerWorkingMonths;
    @JsonProperty("claimantNoLongerWorkingWeeks")
    private String claimantNoLongerWorkingWeeks;
    @JsonProperty("claimantNoLongerWorkingPay")
    private String claimantNoLongerWorkingPay;
    @JsonProperty("claimantAverageWeeklyWorkHours")
    private String claimantAverageWeeklyWorkHours;
    @JsonProperty("claimantPayBeforeTax")
    private String claimantPayBeforeTax;
    @JsonProperty("claimantPayAfterTax")
    private String claimantPayAfterTax;
    @JsonProperty("claimantPayType")
    private List<String> claimantPayType;
    @JsonProperty("claimantPensionContribution")
    private List<String> claimantPensionContribution;
    @JsonProperty("claimantWeeklyPension")
    private String claimantWeeklyPension;
    @JsonProperty("claimantEmployeeBenefits")
    private List<String> claimantEmployeeBenefits;
    @JsonProperty("claimantBenefits")
    private String claimantBenefits;
    @JsonProperty("claimantNewJob")
    private List<String> claimantNewJob;
    @JsonProperty("claimantNewJobStartDate")
    private String claimantNewJobStartDate;
    @JsonProperty("claimantNewJobPayBeforeTax")
    private String claimantNewJobPayBeforeTax;
    @JsonProperty("claimantNewJobPayPeriod")
    private List<String> claimantNewJobPayPeriod;

    @JsonProperty("respondentType")
    private String respondentType;
    @JsonProperty("respondentOrganisationName")
    private String respondentOrganisationName;
    @JsonProperty("respondentFirstName")
    private String respondentFirstName;
    @JsonProperty("respondentLastName")
    private String respondentLastName;
    @JsonProperty("respondentAddress")
    private Address respondentAddress;
    @JsonProperty("didClaimantWorkAtSameAddressPreamble")
    private String didClaimantWorkAtSameAddressPreamble;
    @JsonProperty("didClaimantWorkAtSameAddress")
    private String didClaimantWorkAtSameAddress;
    @JsonProperty("claimantWorkAddressYes")
    private Address claimantWorkAddressYes;
    @JsonProperty("respondentAcasYesNo")
    private String respondentAcasYesNo;
    @JsonProperty("respondentAcasNumber")
    private String respondentAcasNumber;
    @JsonProperty("respondentNoAcasCertificateReason")
    private String respondentNoAcasCertificateReason;
    @JsonProperty("addAdditionalRespondentPreamble")
    private String addAdditionalRespondentPreamble;
    @JsonProperty("addAdditionalRespondent")
    private String addAdditionalRespondent;
    @JsonProperty("et1ReppedRespondentCollection")
    private List<GenericTypeItem<CreateRespondentType>> et1ReppedRespondentCollection;

    @JsonProperty("et1SectionThreeClaimDetails")
    private String et1SectionThreeClaimDetails;
    @JsonProperty("et1SectionThreeDocumentUpload")
    private UploadedDocumentType et1SectionThreeDocumentUpload;
    @JsonProperty("et1SectionThreeTypeOfClaim")
    private List<String> et1SectionThreeTypeOfClaim;
    @JsonProperty("discriminationTypesOfClaim")
    private List<String> discriminationTypesOfClaim;
    @JsonProperty("payTypesOfClaim")
    private List<String> payTypesOfClaim;
    @JsonProperty("whistleblowingYesNo")
    private List<String> whistleblowingYesNo;
    @JsonProperty("whistleblowingRegulator")
    private String whistleblowingRegulator;
    @JsonProperty("otherTypeOfClaimDetails")
    private String otherTypeOfClaimDetails;
    @JsonProperty("claimSuccessful")
    private List<String> claimSuccessful;
    @JsonProperty("compensationDetails")
    private String compensationDetails;
    @JsonProperty("tribunalRecommendationDetails")
    private String tribunalRecommendationDetails;
    @JsonProperty("linkedCasesYesNo")
    private List<String> linkedCasesYesNo;
    @JsonProperty("linkedCasesDetails")
    private String linkedCasesDetails;
    @JsonProperty("et1SectionOneDateCompleted")
    private String et1SectionOneDateCompleted;
    @JsonProperty("et1SectionTwoDateCompleted")
    private String et1SectionTwoDateCompleted;
    @JsonProperty("et1SectionThreeDateCompleted")
    private String et1SectionThreeDateCompleted;
    @JsonProperty("claimantRepresentativeOrganisationPolicy")
    private OrganisationPolicy claimantRepresentativeOrganisationPolicy;
    @JsonProperty("downloadDraftEt1Date")
    private String downloadDraftEt1Date;
    @JsonProperty("hearingContactLanguage")
    private List<String> hearingContactLanguage;
    @JsonProperty("claimantHearingContactLanguage")
    private List<String> claimantHearingContactLanguage;
    @JsonProperty("contactLanguageQuestion")
    private List<String> contactLanguageQuestion;
    @JsonProperty("requiresSubmissionDocuments")
    private String requiresSubmissionDocuments;

}
