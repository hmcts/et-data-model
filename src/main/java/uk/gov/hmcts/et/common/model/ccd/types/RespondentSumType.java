package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.ccd.Address;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;
import uk.gov.hmcts.et.common.model.ccd.types.et3links.ET3CaseDetailsLinksStatuses;
import uk.gov.hmcts.et.common.model.ccd.types.et3links.ET3HubLinksStatuses;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RespondentSumType {
    @JsonProperty("response_status")
    private String responseStatus;
    @JsonProperty("responseToClaim")
    private String responseToClaim;
    @JsonProperty("rejection_reason")
    private String rejectionReason;
    @JsonProperty("rejection_reason_other")
    private String rejectionReasonOther;
    @JsonProperty("responseOutOfTime")
    private String responseOutOfTime;
    @JsonProperty("responseNotOnPrescribedForm")
    private String responseNotOnPrescribedForm;
    @JsonProperty("responseRequiredInfoAbsent")
    private String responseRequiredInfoAbsent;
    @JsonProperty("responseNotes")
    private String responseNotes;
    @JsonProperty("response_referred_to_judge")
    private String responseReferredToJudge;
    @JsonProperty("response_returned_from_judge")
    private String responseReturnedFromJudge;
    @JsonProperty("respondent_name")
    private String respondentName;
    @JsonProperty("respondentEcc")
    private String respondentEcc;
    @JsonProperty("respondentEccReply")
    private String respondentEccReply;
    @JsonProperty("respondentEccReplyCount")
    private String respondentEccReplyCount; // for WA Tasks

    @JsonProperty("respondent_hearing_panel_preference")
    private String respondentHearingPanelPreference;
    @JsonProperty("respondent_hearing_panel_preference_reason")
    private String respondentHearingPanelPreferenceReason;

    @JsonProperty("respondentType")
    private String respondentType;
    @JsonProperty("respondentOrganisation")
    private String respondentOrganisation;
    @JsonProperty("respondentFirstName")
    private String respondentFirstName;
    @JsonProperty("respondentLastName")
    private String respondentLastName;
    @JsonProperty("respondent_ACAS_question")
    private String respondentAcasQuestion;
    @JsonProperty("respondent_ACAS")
    private String respondentAcas;
    @JsonProperty("respondent_ACAS_no")
    private String respondentAcasNo;
    @JsonProperty("respondent_address")
    private Address respondentAddress;
    @JsonProperty("respondent_phone1")
    private String respondentPhone1;
    @JsonProperty("respondent_phone2")
    private String respondentPhone2;
    @JsonProperty("respondent_email")
    private String respondentEmail;
    @JsonProperty("respondent_contact_preference")
    private String respondentContactPreference;
    @JsonProperty("responseStruckOut")
    private String responseStruckOut;
    @JsonProperty("responseStruckOutDate")
    private String responseStruckOutDate;
    @JsonProperty("responseStruckOutChairman")
    private String responseStruckOutChairman;
    @JsonProperty("responseStruckOutReason")
    private String responseStruckOutReason;
    @JsonProperty("responseRespondentAddress")
    private Address responseRespondentAddress;
    @JsonProperty("responseRespondentPhone1")
    private String responseRespondentPhone1;
    @JsonProperty("responseRespondentPhone2")
    private String responseRespondentPhone2;
    @JsonProperty("responseRespondentEmail")
    private String responseRespondentEmail;
    @JsonProperty("responseRespondentContactPreference")
    private String responseRespondentContactPreference;

    @JsonProperty("responseReceived")
    private String responseReceived;
    @JsonProperty("responseReceivedDate")
    private String responseReceivedDate;
    @JsonProperty("responseReceivedCount")
    private String responseReceivedCount; // for WA Tasks

    @JsonProperty("responseRespondentNameQuestion")
    private String responseRespondentNameQuestion;
    @JsonProperty("responseRespondentName")
    private String responseRespondentName;
    @JsonProperty("responseContinue")
    private String responseContinue;
    @JsonProperty("responseCounterClaim")
    private String responseCounterClaim;
    @JsonProperty("responseReference")
    private String responseReference;
    @JsonProperty("extensionRequested")
    private String extensionRequested;
    @JsonProperty("extensionGranted")
    private String extensionGranted;
    @JsonProperty("extensionDate")
    private String extensionDate;
    @JsonProperty("extensionResubmitted")
    private String extensionResubmitted;
    @JsonProperty("et3Vetting")
    private Et3VettingType et3Vetting;
    @JsonProperty("et3VettingCompleted")
    private String et3VettingCompleted;

    // ET3 Response
    @JsonProperty("et3ResponseIsClaimantNameCorrect")
    private String et3ResponseIsClaimantNameCorrect;
    @JsonProperty("et3ResponseClaimantNameCorrection")
    private String et3ResponseClaimantNameCorrection;
    @JsonProperty("et3ResponseRespondentCompanyNumber")
    private String et3ResponseRespondentCompanyNumber;
    @JsonProperty("et3ResponseRespondentEmployerType")
    private String et3ResponseRespondentEmployerType;
    @JsonProperty("et3ResponseRespondentPreferredTitle")
    private String et3ResponseRespondentPreferredTitle;
    @JsonProperty("et3ResponseRespondentContactName")
    private String et3ResponseRespondentContactName;
    @JsonProperty("et3ResponseDXAddress")
    private String et3ResponseDXAddress;
    @JsonProperty("et3ResponseContactReason")
    private String et3ResponseContactReason;
    @JsonProperty("et3ResponseHearingRepresentative")
    private List<String> et3ResponseHearingRepresentative;
    @JsonProperty("et3ResponseHearingRespondent")
    private List<String> et3ResponseHearingRespondent;
    @JsonProperty("et3ResponseEmploymentCount")
    private String et3ResponseEmploymentCount;
    @JsonProperty("et3ResponseMultipleSites")
    private String et3ResponseMultipleSites;
    @JsonProperty("et3ResponseSiteEmploymentCount")
    private String et3ResponseSiteEmploymentCount;
    @JsonProperty("et3ResponseAcasAgree")
    private String et3ResponseAcasAgree;
    @JsonProperty("et3ResponseAcasAgreeReason")
    private String et3ResponseAcasAgreeReason;
    @JsonProperty("et3ResponseAreDatesCorrect")
    private String et3ResponseAreDatesCorrect;
    @JsonProperty("et3ResponseEmploymentStartDate")
    private String et3ResponseEmploymentStartDate;
    @JsonProperty("et3ResponseEmploymentEndDate")
    private String et3ResponseEmploymentEndDate;
    @JsonProperty("et3ResponseEmploymentInformation")
    private String et3ResponseEmploymentInformation;
    @JsonProperty("et3ResponseContinuingEmployment")
    private String et3ResponseContinuingEmployment;
    @JsonProperty("et3ResponseIsJobTitleCorrect")
    private String et3ResponseIsJobTitleCorrect;
    @JsonProperty("et3ResponseCorrectJobTitle")
    private String et3ResponseCorrectJobTitle;
    @JsonProperty("et3ResponseClaimantWeeklyHours")
    private String et3ResponseClaimantWeeklyHours;
    @JsonProperty("et3ResponseClaimantCorrectHours")
    private String et3ResponseClaimantCorrectHours;
    @JsonProperty("et3ResponseEarningDetailsCorrect")
    private String et3ResponseEarningDetailsCorrect;
    @JsonProperty("et3ResponsePayFrequency")
    private String et3ResponsePayFrequency;
    @JsonProperty("et3ResponsePayBeforeTax")
    private String et3ResponsePayBeforeTax;
    @JsonProperty("et3ResponsePayTakehome")
    private String et3ResponsePayTakehome;
    @JsonProperty("et3ResponseIsNoticeCorrect")
    private String et3ResponseIsNoticeCorrect;
    @JsonProperty("et3ResponseCorrectNoticeDetails")
    private String et3ResponseCorrectNoticeDetails;
    @JsonProperty("et3ResponseIsPensionCorrect")
    private String et3ResponseIsPensionCorrect;
    @JsonProperty("et3ResponsePensionCorrectDetails")
    private String et3ResponsePensionCorrectDetails;
    @JsonProperty("et3ResponseRespondentContestClaim")
    private String et3ResponseRespondentContestClaim;
    @JsonProperty("et3ResponseContestClaimDocument")
    private List<DocumentTypeItem> et3ResponseContestClaimDocument;
    @JsonProperty("et3ResponseContestClaimDetails")
    private String et3ResponseContestClaimDetails;
    @JsonProperty("et3ResponseEmployerClaim")
    private String et3ResponseEmployerClaim;
    @JsonProperty("et3ResponseEmployerClaimDetails")
    private String et3ResponseEmployerClaimDetails;
    @JsonProperty("et3ResponseEmployerClaimDocument")
    private UploadedDocumentType et3ResponseEmployerClaimDocument;
    @JsonProperty("et3ResponseRespondentSupportNeeded")
    private String et3ResponseRespondentSupportNeeded;
    @JsonProperty("et3ResponseRespondentSupportDetails")
    private String et3ResponseRespondentSupportDetails;
    @JsonProperty("et3ResponseRespondentSupportDocument")
    private UploadedDocumentType et3ResponseRespondentSupportDocument;
    @JsonProperty("et3Form")
    private UploadedDocumentType et3Form;
    @JsonProperty("et3FormWelsh")
    private UploadedDocumentType et3FormWelsh;
    @JsonProperty("et3NotificationAcceptedDate")
    private String et3NotificationAcceptedDate;

    @JsonProperty("personalDetailsSection")
    private String personalDetailsSection;
    @JsonProperty("employmentDetailsSection")
    private String employmentDetailsSection;
    @JsonProperty("claimDetailsSection")
    private String claimDetailsSection;

    //ET3 fields
    @JsonProperty("idamId")
    private String idamId;
    @JsonProperty("et3CaseDetailsLinksStatuses")
    private ET3CaseDetailsLinksStatuses et3CaseDetailsLinksStatuses;
    @JsonProperty("et3HubLinksStatuses")
    private ET3HubLinksStatuses et3HubLinksStatuses;
    @JsonProperty("et3ResponseLanguagePreference")
    private String et3ResponseLanguagePreference;
    @JsonProperty("et3ResponseHearingRespondentNoDetails")
    private String et3ResponseHearingRespondentNoDetails;
    @JsonProperty("et3Status")
    private String et3Status;
    @JsonProperty("et3IsRespondentAddressCorrect")
    private String et3IsRespondentAddressCorrect;
    @JsonProperty("contactDetailsSection")
    private String contactDetailsSection;
    @JsonProperty("employerDetailsSection")
    private String employerDetailsSection;
    @JsonProperty("conciliationAndEmployeeDetailsSection")
    private String conciliationAndEmployeeDetailsSection;
    @JsonProperty("payPensionBenefitDetailsSection")
    private String payPensionBenefitDetailsSection;
    @JsonProperty("contestClaimSection")
    private String contestClaimSection;
    @JsonProperty("employersContractClaimSection")
    private String employersContractClaimSection;
    @JsonProperty("representativeRemoved")
    private String representativeRemoved;
    @JsonProperty("represented")
    private String represented;
    @JsonProperty("representativeId")
    private String representativeId;
}
