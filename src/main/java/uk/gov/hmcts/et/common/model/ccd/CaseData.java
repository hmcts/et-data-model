package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;
import uk.gov.hmcts.et.common.model.ccd.items.AddressLabelTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.BFActionTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.DepositTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.EccCounterClaimTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.HearingTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.JudgementTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.RepresentedTypeRItem;
import uk.gov.hmcts.et.common.model.ccd.items.VettingJurCodesTypeItem;
import uk.gov.hmcts.et.common.model.ccd.types.AddressLabelsAttributesType;
import uk.gov.hmcts.et.common.model.ccd.types.AddressLabelsSelectionType;
import uk.gov.hmcts.et.common.model.ccd.types.CasePreAcceptType;
import uk.gov.hmcts.et.common.model.ccd.types.CompanyPremisesType;
import uk.gov.hmcts.et.common.model.ccd.types.CorrespondenceScotType;
import uk.gov.hmcts.et.common.model.ccd.types.CorrespondenceType;
import uk.gov.hmcts.et.common.model.ccd.types.RestrictedReportingType;
import uk.gov.hmcts.et.common.model.ccd.types.UploadedDocumentType;
import uk.gov.hmcts.et.common.model.listing.ListingData;

import java.util.List;

/**
 * Employment Tribunal claim data. This class contains all the data for a citizen's claim.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@EqualsAndHashCode(callSuper = true)
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
    @JsonProperty("receiptDate")
    private String receiptDate;

    @JsonProperty("claimServedDate")
    private String claimServedDate;

    @JsonProperty("feeGroupReference")
    private String feeGroupReference;
    @JsonProperty("claimantWorkAddressQuestion")
    private String claimantWorkAddressQuestion;
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
    @JsonProperty("documentCollection")
    private List<DocumentTypeItem> documentCollection;
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
    @JsonProperty("respondent")
    private String respondent;

    @JsonProperty("EQP")
    private String EQP;
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
    private String Postponed_by;
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
    @JsonProperty("ecmOfficeCT")
    private String ecmOfficeCT;

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
    @JsonProperty("et1VettingAcasCertGeneralNote")
    private String et1VettingAcasCertGeneralNote;
    // ET1 Vetting - Jurisdiction codes
    @JsonProperty("existingJurisdictionCodes")
    private String existingJurisdictionCodes;
    @JsonProperty("vettingJurisdictionCodeCollection")
    private List<VettingJurCodesTypeItem> vettingJurisdictionCodeCollection;
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
    private EtICUDLHearing etICHearingNotListedUDLHearing;
    @JsonProperty("etICHearingNotListedAnyOtherDirections")
    private String etICHearingNotListedAnyOtherDirections;
    // ET Initial Consideration - Hearing already listed
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
}
