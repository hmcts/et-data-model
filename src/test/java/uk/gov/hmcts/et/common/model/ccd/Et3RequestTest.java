package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Et3RequestTest {

    private static final String et3RequestDataFilePath = "et3-request-data.json";

    @Test
    @SneakyThrows
    void testET3RequestModel() {
        Et3Request et3Request = generateEt3Request();
        assertTrue(ObjectUtils.isNotEmpty(et3Request));

        assertEquals(Et3RequestTestConstants.CASE_ID, et3Request.getCaseId());
        assertEquals(Et3RequestTestConstants.REQUEST_TYPE, et3Request.getRequestType());
        assertEquals(Et3RequestTestConstants.CASE_TYPE, et3Request.getCaseType());
        assertEquals(Et3RequestTestConstants.RESPONSE_STATUS, et3Request.getRespondent().getResponseStatus());
        assertEquals(Et3RequestTestConstants.RESPONSE_TO_CLAIM, et3Request.getRespondent().getResponseToClaim());
        assertEquals(Et3RequestTestConstants.REJECTION_REASON, et3Request.getRespondent().getRejectionReason());
        assertEquals(Et3RequestTestConstants.REJECTION_REASON_OTHER,
                et3Request.getRespondent().getRejectionReasonOther());
        assertEquals(Et3RequestTestConstants.RESPONSE_OUT_OF_TIME, et3Request.getRespondent().getResponseOutOfTime());
        assertEquals(Et3RequestTestConstants.RESPONSE_NOT_ON_PRESCRIBED_FORM,
                et3Request.getRespondent().getResponseNotOnPrescribedForm());
        assertEquals(Et3RequestTestConstants.RESPONSE_REQUIRED_INFO_ABSENT,
                et3Request.getRespondent().getResponseRequiredInfoAbsent());
        assertEquals(Et3RequestTestConstants.RESPONSE_NOTES, et3Request.getRespondent().getResponseNotes());
        assertEquals(Et3RequestTestConstants.RESPONSE_REFERRED_TO_JUDGE,
                et3Request.getRespondent().getResponseReferredToJudge());
        assertEquals(Et3RequestTestConstants.RESPONSE_RETURNED_FROM_JUDGE,
                et3Request.getRespondent().getResponseReturnedFromJudge());
        assertEquals(Et3RequestTestConstants.RESPONDENT_NAME, et3Request.getRespondent().getRespondentName());
        assertEquals(Et3RequestTestConstants.RESPONDENT_TYPE, et3Request.getRespondent().getRespondentType());
        assertEquals(Et3RequestTestConstants.RESPONDENT_ORGANISATION,
                et3Request.getRespondent().getRespondentOrganisation());
        assertEquals(Et3RequestTestConstants.RESPONDENT_FIRST_NAME,
                et3Request.getRespondent().getRespondentFirstName());
        assertEquals(Et3RequestTestConstants.RESPONDENT_LAST_NAME, et3Request.getRespondent().getRespondentLastName());
        assertEquals(Et3RequestTestConstants.RESPONDENT_ACAS_QUESTION,
                et3Request.getRespondent().getRespondentAcasQuestion());
        assertEquals(Et3RequestTestConstants.RESPONDENT_ACAS, et3Request.getRespondent().getRespondentAcas());
        assertEquals(Et3RequestTestConstants.RESPONDENT_ACAS_NO, et3Request.getRespondent().getRespondentAcasNo());
        assertEquals(Et3RequestTestConstants.RESPONDENT_ADDRESS_ADDRESS_LINE_1,
                et3Request.getRespondent().getRespondentAddress().getAddressLine1());
        assertEquals(Et3RequestTestConstants.RESPONDENT_ADDRESS_ADDRESS_LINE_2,
                et3Request.getRespondent().getRespondentAddress().getAddressLine2());
        assertEquals(Et3RequestTestConstants.RESPONDENT_ADDRESS_ADDRESS_LINE_3,
                et3Request.getRespondent().getRespondentAddress().getAddressLine3());
        assertEquals(Et3RequestTestConstants.RESPONDENT_ADDRESS_POST_TOWN,
                et3Request.getRespondent().getRespondentAddress().getPostTown());
        assertEquals(Et3RequestTestConstants.RESPONDENT_ADDRESS_COUNTY,
                et3Request.getRespondent().getRespondentAddress().getCounty());
        assertEquals(Et3RequestTestConstants.RESPONDENT_ADDRESS_POST_CODE,
                et3Request.getRespondent().getRespondentAddress().getPostCode());
        assertEquals(Et3RequestTestConstants.RESPONDENT_ADDRESS_COUNTRY,
                et3Request.getRespondent().getRespondentAddress().getCountry());
        assertEquals(Et3RequestTestConstants.RESPONDENT_PHONE_1, et3Request.getRespondent().getRespondentPhone1());
        assertEquals(Et3RequestTestConstants.RESPONDENT_PHONE_2, et3Request.getRespondent().getRespondentPhone2());
        assertEquals(Et3RequestTestConstants.RESPONDENT_EMAIL, et3Request.getRespondent().getRespondentEmail());
        assertEquals(Et3RequestTestConstants.RESPONDENT_CONTACT_PREFERENCE,
                et3Request.getRespondent().getRespondentContactPreference());
        assertEquals(Et3RequestTestConstants.RESPONSE_STRUCK_OUT, et3Request.getRespondent().getResponseStruckOut());
        assertEquals(Et3RequestTestConstants.RESPONSE_STRUCK_OUT_DATE,
                et3Request.getRespondent().getResponseStruckOutDate());
        assertEquals(Et3RequestTestConstants.RESPONSE_STRUCK_OUT_CHAIRMAN,
                et3Request.getRespondent().getResponseStruckOutChairman());
        assertEquals(Et3RequestTestConstants.RESPONSE_STRUCK_OUT_REASON,
                et3Request.getRespondent().getResponseStruckOutReason());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_ADDRESS_ADDRESS_LINE_1,
                et3Request.getRespondent().getResponseRespondentAddress().getAddressLine1());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_ADDRESS_ADDRESS_LINE_2,
                et3Request.getRespondent().getResponseRespondentAddress().getAddressLine2());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_ADDRESS_ADDRESS_LINE_3,
                et3Request.getRespondent().getResponseRespondentAddress().getAddressLine3());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_ADDRESS_POST_TOWN,
                et3Request.getRespondent().getResponseRespondentAddress().getPostTown());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_ADDRESS_COUNTY,
                et3Request.getRespondent().getResponseRespondentAddress().getCounty());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_ADDRESS_POST_CODE,
                et3Request.getRespondent().getResponseRespondentAddress().getPostCode());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_ADDRESS_COUNTRY,
                et3Request.getRespondent().getResponseRespondentAddress().getCountry());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_PHONE_1,
                et3Request.getRespondent().getResponseRespondentPhone1());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_PHONE_2,
                et3Request.getRespondent().getResponseRespondentPhone2());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_EMAIL,
                et3Request.getRespondent().getResponseRespondentEmail());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_CONTACT_PREFERENCE,
                et3Request.getRespondent().getResponseRespondentContactPreference());
        assertEquals(Et3RequestTestConstants.RESPONSE_RECEIVED, et3Request.getRespondent().getResponseReceived());
        assertEquals(Et3RequestTestConstants.RESPONSE_RECEIVED_DATE,
                et3Request.getRespondent().getResponseReceivedDate());
        assertEquals(Et3RequestTestConstants.RESPONSE_RECEIVED_COUNT,
                et3Request.getRespondent().getResponseReceivedCount());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_NAME_QUESTION,
                et3Request.getRespondent().getResponseRespondentNameQuestion());
        assertEquals(Et3RequestTestConstants.RESPONSE_RESPONDENT_NAME,
                et3Request.getRespondent().getResponseRespondentName());
        assertEquals(Et3RequestTestConstants.RESPONSE_CONTINUE, et3Request.getRespondent().getResponseContinue());
        assertEquals(Et3RequestTestConstants.RESPONSE_COUNTER_CLAIM,
                et3Request.getRespondent().getResponseCounterClaim());
        assertEquals(Et3RequestTestConstants.RESPONSE_REFERENCE, et3Request.getRespondent().getResponseReference());
        assertEquals(Et3RequestTestConstants.EXTENSION_REQUESTED, et3Request.getRespondent().getExtensionRequested());
        assertEquals(Et3RequestTestConstants.EXTENSION_GRANTED, et3Request.getRespondent().getExtensionGranted());
        assertEquals(Et3RequestTestConstants.EXTENSION_DATE, et3Request.getRespondent().getExtensionDate());
        assertEquals(Et3RequestTestConstants.EXTENSION_RESUBMITTED,
                et3Request.getRespondent().getExtensionResubmitted());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_CHOOSE_RESPONDENT_VALUE_CODE,
                et3Request.getRespondent().getEt3Vetting().getEt3ChooseRespondent().getValue().getCode());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_CHOOSE_RESPONDENT_VALUE_LABEL,
                et3Request.getRespondent().getEt3Vetting().getEt3ChooseRespondent().getValue().getLabel());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_CHOOSE_RESPONDENT_LIST_ITEMS_1_CODE,
                et3Request.getRespondent().getEt3Vetting().getEt3ChooseRespondent().getListItems().get(0).getCode());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_CHOOSE_RESPONDENT_LIST_ITEMS_1_LABEL,
                et3Request.getRespondent().getEt3Vetting().getEt3ChooseRespondent().getListItems().get(0).getLabel());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_CHOOSE_RESPONDENT_LIST_ITEMS_2_CODE,
                et3Request.getRespondent().getEt3Vetting().getEt3ChooseRespondent().getListItems().get(1).getCode());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_CHOOSE_RESPONDENT_LIST_ITEMS_2_LABEL,
                et3Request.getRespondent().getEt3Vetting().getEt3ChooseRespondent().getListItems().get(1).getLabel());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_IS_THERE_AN_ET3_RESPONSE,
                et3Request.getRespondent().getEt3Vetting().getEt3IsThereAnEt3Response());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_NO_ET3_RESPONSE,
                et3Request.getRespondent().getEt3Vetting().getEt3NoEt3Response());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotes());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_IS_THERE_A_COMPANIES_HOUSE_SEARCH_DOCUMENT,
                et3Request.getRespondent().getEt3Vetting().getEt3IsThereACompaniesHouseSearchDocument());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_COMPANY_HOUSE_DOCUMENT_BINARY_URL,
                et3Request.getRespondent().getEt3Vetting().getEt3CompanyHouseDocument().getDocumentBinaryUrl());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_COMPANY_HOUSE_DOCUMENT_FILE_NAME,
                et3Request.getRespondent().getEt3Vetting().getEt3CompanyHouseDocument().getDocumentFilename());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_COMPANY_HOUSE_DOCUMENT_URL,
                et3Request.getRespondent().getEt3Vetting().getEt3CompanyHouseDocument().getDocumentUrl());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_COMPANY_HOUSE_DOCUMENT_CATEGORY_ID,
                et3Request.getRespondent().getEt3Vetting().getEt3CompanyHouseDocument().getCategoryId());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_COMPANY_HOUSE_DOCUMENT_UPLOAD_TIMESTAMP,
                et3Request.getRespondent().getEt3Vetting().getEt3CompanyHouseDocument().getUploadTimestamp());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES_COMPANY_HOUSE,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotesCompanyHouse());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_IS_THERE_AN_INDIVIDUAL_SEARCH_DOCUMENT,
                et3Request.getRespondent().getEt3Vetting().getEt3IsThereAnIndividualSearchDocument());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_INDIVIDUAL_INSOLVENCY_DOCUMENT_BINARY_URL,
                et3Request.getRespondent().getEt3Vetting().getEt3IndividualInsolvencyDocument().getDocumentBinaryUrl());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_INDIVIDUAL_INSOLVENCY_DOCUMENT_FILE_NAME,
                et3Request.getRespondent().getEt3Vetting().getEt3IndividualInsolvencyDocument().getDocumentFilename());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_INDIVIDUAL_INSOLVENCY_DOCUMENT_URL,
                et3Request.getRespondent().getEt3Vetting().getEt3IndividualInsolvencyDocument().getDocumentUrl());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_INDIVIDUAL_INSOLVENCY_DOCUMENT_CATEGORY_ID,
                et3Request.getRespondent().getEt3Vetting().getEt3IndividualInsolvencyDocument().getCategoryId());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_INDIVIDUAL_INSOLVENCY_DOCUMENT_UPLOAD_TIMESTAMP,
                et3Request.getRespondent().getEt3Vetting().getEt3IndividualInsolvencyDocument().getUploadTimestamp());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES_INDIVIDUAL_INSOLVENCY,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotesIndividualInsolvency());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_LEGAL_ISSUE,
                et3Request.getRespondent().getEt3Vetting().getEt3LegalIssue());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_LEGAL_ISSUE_GIVE_DETAILS,
                et3Request.getRespondent().getEt3Vetting().getEt3LegalIssueGiveDetails());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES_LEGAL_ENTITY,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotesLegalEntity());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_RESPONSE_IN_TIME,
                et3Request.getRespondent().getEt3Vetting().getEt3ResponseInTime());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_RESPONSE_IN_TIME_DETAILS,
                et3Request.getRespondent().getEt3Vetting().getEt3ResponseInTimeDetails());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_DO_WE_HAVE_RESPONDENTS_NAME,
                et3Request.getRespondent().getEt3Vetting().getEt3DoWeHaveRespondentsName());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES_RESPONDENT_NAME,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotesRespondentName());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_DOES_RESPONDENTS_NAME_MATCH,
                et3Request.getRespondent().getEt3Vetting().getEt3DoesRespondentsNameMatch());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_RESPONDENT_NAME_MISMATCH_DETAILS,
                et3Request.getRespondent().getEt3Vetting().getEt3RespondentNameMismatchDetails());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES_RESPONDENT_NAME_MATCH,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotesRespondentNameMatch());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_DO_WE_HAVE_RESPONDENT_ADDRESS,
                et3Request.getRespondent().getEt3Vetting().getEt3DoWeHaveRespondentsAddress());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_DOES_RESPONDENTS_ADDRESS_MATCH,
                et3Request.getRespondent().getEt3Vetting().getEt3DoesRespondentsAddressMatch());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_RESPONDENT_ADDRESS_MISMATCH_DETAILS,
                et3Request.getRespondent().getEt3Vetting().getEt3RespondentAddressMismatchDetails());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES_RESPONDENT_ADDRESS,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotesRespondentAddress());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES_ADDRESS_MATCH,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotesAddressMatch());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_IS_CASE_LISTED_FOR_HEARING,
                et3Request.getRespondent().getEt3Vetting().getEt3IsCaseListedForHearing());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_IS_CASE_LISTED_FOR_HEARING_DETAILS,
                et3Request.getRespondent().getEt3Vetting().getEt3IsCaseListedForHearingDetails());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES_CASE_LISTED,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotesCaseListed());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_IS_THIS_LOCATION_CORRECT,
                et3Request.getRespondent().getEt3Vetting().getEt3IsThisLocationCorrect());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES_TRANSFER_APPLICATION,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotesTransferApplication());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_REGIONAL_OFFICE,
                et3Request.getRespondent().getEt3Vetting().getEt3RegionalOffice());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_WHY_WE_SHOULD_CHANGE_THE_OFFICE,
                et3Request.getRespondent().getEt3Vetting().getEt3WhyWeShouldChangeTheOffice());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_CONTEST_CLAIM,
                et3Request.getRespondent().getEt3Vetting().getEt3ContestClaim());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_CONTEST_CLAIM_GIVE_DETAILS,
                et3Request.getRespondent().getEt3Vetting().getEt3ContestClaimGiveDetails());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES_CONTEST_CLAIM,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotesContestClaim());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_CONTRACT_CLAIM_SECTION_7,
                et3Request.getRespondent().getEt3Vetting().getEt3ContractClaimSection7());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_CONTRACT_CLAIM_SECTION_7_DETAILS,
                et3Request.getRespondent().getEt3Vetting().getEt3ContractClaimSection7Details());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES_CONTRACT_CLAIM_SECTION_7,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotesContractClaimSection7());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_RULE_26,
                et3Request.getRespondent().getEt3Vetting().getEt3Rule26());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_RULE_26_DETAILS,
                et3Request.getRespondent().getEt3Vetting().getEt3Rule26Details());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_SUGGESTED_ISSUES[0],
                et3Request.getRespondent().getEt3Vetting().getEt3SuggestedIssues().get(0));
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_SUGGESTED_ISSUES[1],
                et3Request.getRespondent().getEt3Vetting().getEt3SuggestedIssues().get(1));
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_SUGGESTED_ISSUES_STRIKE_OUT,
                et3Request.getRespondent().getEt3Vetting().getEt3SuggestedIssuesStrikeOut());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_SUGGESTED_ISSUE_INTERPRETERS,
                et3Request.getRespondent().getEt3Vetting().getEt3SuggestedIssueInterpreters());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_SUGGESTED_ISSUE_JURISDICTIONAL,
                et3Request.getRespondent().getEt3Vetting().getEt3SuggestedIssueJurisdictional());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_SUGGESTED_ISSUE_ADJUSTMENTS,
                et3Request.getRespondent().getEt3Vetting().getEt3SuggestedIssueAdjustments());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_SUGGESTED_ISSUE_RULE_50,
                et3Request.getRespondent().getEt3Vetting().getEt3SuggestedIssueRule50());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_SUGGESTED_ISSUE_TIME_POINTS,
                et3Request.getRespondent().getEt3Vetting().getEt3SuggestedIssueTimePoints());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_GENERAL_NOTES_RULE_26,
                et3Request.getRespondent().getEt3Vetting().getEt3GeneralNotesRule26());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_ADDITIONAL_INFORMATION,
                et3Request.getRespondent().getEt3Vetting().getEt3AdditionalInformation());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_VETTING_DOCUMENT_BINARY_URL,
                et3Request.getRespondent().getEt3Vetting().getEt3VettingDocument().getDocumentBinaryUrl());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_VETTING_DOCUMENT_FILE_NAME,
                et3Request.getRespondent().getEt3Vetting().getEt3VettingDocument().getDocumentFilename());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_VETTING_DOCUMENT_URL,
                et3Request.getRespondent().getEt3Vetting().getEt3VettingDocument().getDocumentUrl());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_VETTING_DOCUMENT_CATEGORY_ID,
                et3Request.getRespondent().getEt3Vetting().getEt3VettingDocument().getCategoryId());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_ET3_VETTING_DOCUMENT_UPLOAD_TIMESTAMP,
                et3Request.getRespondent().getEt3Vetting().getEt3VettingDocument().getUploadTimestamp());
        assertEquals(Et3RequestTestConstants.ET3_VETTING_COMPLETED,
                et3Request.getRespondent().getEt3VettingCompleted());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_IS_CLAIMANT_NAME_CORRECT,
                et3Request.getRespondent().getEt3ResponseIsClaimantNameCorrect());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_CLAIMANT_NAME_CORRECTION,
                et3Request.getRespondent().getEt3ResponseClaimantNameCorrection());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_RESPONDENT_COMPANY_NUMBER,
                et3Request.getRespondent().getEt3ResponseRespondentCompanyNumber());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_RESPONDENT_EMPLOYER_TYPE,
                et3Request.getRespondent().getEt3ResponseRespondentEmployerType());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_RESPONDENT_PREFERRED_TITLE,
                et3Request.getRespondent().getEt3ResponseRespondentPreferredTitle());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_RESPONDENT_CONTACT_NAME,
                et3Request.getRespondent().getEt3ResponseRespondentContactName());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_DX_ADDRESS,
                et3Request.getRespondent().getEt3ResponseDXAddress());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_CONTACT_REASON,
                et3Request.getRespondent().getEt3ResponseContactReason());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_HEARING_REPRESENTATIVE[0],
                et3Request.getRespondent().getEt3ResponseHearingRepresentative().get(0));
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_HEARING_REPRESENTATIVE[1],
                et3Request.getRespondent().getEt3ResponseHearingRepresentative().get(1));
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_HEARING_RESPONDENT[0],
                et3Request.getRespondent().getEt3ResponseHearingRespondent().get(0));
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_HEARING_RESPONDENT[1],
                et3Request.getRespondent().getEt3ResponseHearingRespondent().get(1));
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_EMPLOYMENT_COUNT,
                et3Request.getRespondent().getEt3ResponseEmploymentCount());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_MULTIPLE_SITES,
                et3Request.getRespondent().getEt3ResponseMultipleSites());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_SITE_EMPLOYMENT_COUNT,
                et3Request.getRespondent().getEt3ResponseSiteEmploymentCount());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_ACAS_AGREE,
                et3Request.getRespondent().getEt3ResponseAcasAgree());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_ACAS_AGREE_REASON,
                et3Request.getRespondent().getEt3ResponseAcasAgreeReason());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_ARE_DATES_CORRECT,
                et3Request.getRespondent().getEt3ResponseAreDatesCorrect());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_EMPLOYMENT_START_DATE,
                et3Request.getRespondent().getEt3ResponseEmploymentStartDate());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_EMPLOYMENT_END_DATE,
                et3Request.getRespondent().getEt3ResponseEmploymentEndDate());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_EMPLOYMENT_INFORMATION,
                et3Request.getRespondent().getEt3ResponseEmploymentInformation());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_CONTINUING_EMPLOYMENT,
                et3Request.getRespondent().getEt3ResponseContinuingEmployment());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_IS_JOB_TITLE_CORRECT,
                et3Request.getRespondent().getEt3ResponseIsJobTitleCorrect());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_CORRECT_JOB_TITLE,
                et3Request.getRespondent().getEt3ResponseCorrectJobTitle());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_CLAIMANT_WEEKLY_HOURS,
                et3Request.getRespondent().getEt3ResponseClaimantWeeklyHours());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_CLAIMANT_CORRECT_HOURS,
                et3Request.getRespondent().getEt3ResponseClaimantCorrectHours());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_EARNING_DETAILS_CORRECT,
                et3Request.getRespondent().getEt3ResponseEarningDetailsCorrect());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_PAY_FREQUENCY,
                et3Request.getRespondent().getEt3ResponsePayFrequency());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_PAY_BEFORE_TAX,
                et3Request.getRespondent().getEt3ResponsePayBeforeTax());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_PAY_TAKE_HOME,
                et3Request.getRespondent().getEt3ResponsePayTakehome());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_IS_NOTICE_CORRECT,
                et3Request.getRespondent().getEt3ResponseIsNoticeCorrect());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_CORRECT_NOTICE_DETAILS,
                et3Request.getRespondent().getEt3ResponseCorrectNoticeDetails());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_IS_PENSION_CORRECT,
                et3Request.getRespondent().getEt3ResponseIsPensionCorrect());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_PENSION_CORRECT_DETAILS,
                et3Request.getRespondent().getEt3ResponsePensionCorrectDetails());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_RESPONDENT_CONTEST_CLAIM,
                et3Request.getRespondent().getEt3ResponseRespondentContestClaim());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_CONTEST_CLAIM_DETAILS,
                et3Request.getRespondent().getEt3ResponseContestClaimDetails());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_EMPLOYER_CLAIM,
                et3Request.getRespondent().getEt3ResponseEmployerClaim());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_EMPLOYER_CLAIM_DETAILS,
                et3Request.getRespondent().getEt3ResponseEmployerClaimDetails());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_EMPLOYER_CLAIM_DOCUMENT_BINARY_URL,
                et3Request.getRespondent().getEt3ResponseEmployerClaimDocument().getDocumentBinaryUrl());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_EMPLOYER_CLAIM_DOCUMENT_FILE_NAME,
                et3Request.getRespondent().getEt3ResponseEmployerClaimDocument().getDocumentFilename());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_EMPLOYER_CLAIM_DOCUMENT_URL,
                et3Request.getRespondent().getEt3ResponseEmployerClaimDocument().getDocumentUrl());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_EMPLOYER_CLAIM_DOCUMENT_CATEGORY_ID,
                et3Request.getRespondent().getEt3ResponseEmployerClaimDocument().getCategoryId());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_EMPLOYER_CLAIM_DOCUMENT_UPLOAD_TIMESTAMP,
                et3Request.getRespondent().getEt3ResponseEmployerClaimDocument().getUploadTimestamp());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_RESPONDENT_SUPPORT_NEEDED,
                et3Request.getRespondent().getEt3ResponseRespondentSupportNeeded());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_RESPONDENT_SUPPORT_DETAILS,
                et3Request.getRespondent().getEt3ResponseRespondentSupportDetails());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_RESPONDENT_SUPPORT_DOCUMENT_BINARY_URL,
                et3Request.getRespondent().getEt3ResponseRespondentSupportDocument().getDocumentBinaryUrl());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_RESPONDENT_SUPPORT_DOCUMENT_FILE_NAME,
                et3Request.getRespondent().getEt3ResponseRespondentSupportDocument().getDocumentFilename());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_RESPONDENT_SUPPORT_DOCUMENT_URL,
                et3Request.getRespondent().getEt3ResponseRespondentSupportDocument().getDocumentUrl());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_RESPONDENT_SUPPORT_DOCUMENT_CATEGORY_ID,
                et3Request.getRespondent().getEt3ResponseRespondentSupportDocument().getCategoryId());
        assertEquals(Et3RequestTestConstants.ET3_RESPONSE_RESPONDENT_SUPPORT_DOCUMENT_UPLOAD_TIMESTAMP,
                et3Request.getRespondent().getEt3ResponseRespondentSupportDocument().getUploadTimestamp());
        assertEquals(Et3RequestTestConstants.ET3_FORM_DOCUMENT_BINARY_URL,
                et3Request.getRespondent().getEt3Form().getDocumentBinaryUrl());
        assertEquals(Et3RequestTestConstants.ET3_FORM_DOCUMENT_FILE_NAME,
                et3Request.getRespondent().getEt3Form().getDocumentFilename());
        assertEquals(Et3RequestTestConstants.ET3_FORM_DOCUMENT_URL,
                et3Request.getRespondent().getEt3Form().getDocumentUrl());
        assertEquals(Et3RequestTestConstants.ET3_FORM_DOCUMENT_CATEGORY_ID,
                et3Request.getRespondent().getEt3Form().getCategoryId());
        assertEquals(Et3RequestTestConstants.ET3_FORM_DOCUMENT_UPLOAD_TIMESTAMP,
                et3Request.getRespondent().getEt3Form().getUploadTimestamp());
        assertEquals(Et3RequestTestConstants.PERSONAL_DETAILS_SECTION,
                et3Request.getRespondent().getPersonalDetailsSection());
        assertEquals(Et3RequestTestConstants.EMPLOYMENT_DETAILS_SECTION,
                et3Request.getRespondent().getEmploymentDetailsSection());
        assertEquals(Et3RequestTestConstants.CLAIM_DETAILS_SECTION,
                et3Request.getRespondent().getClaimDetailsSection());
        assertEquals(Et3RequestTestConstants.IDAM_ID, et3Request.getRespondent().getIdamId());
        assertEquals(Et3RequestTestConstants.ET3_CASE_DETAILS_LINKS_STATUSES_PERSONAL_DETAILS,
                et3Request.getRespondent().getEt3CaseDetailsLinksStatuses().getPersonalDetails());
        assertEquals(Et3RequestTestConstants.ET3_CASE_DETAILS_LINKS_STATUSES_ET1_CLAIM_FORM,
                et3Request.getRespondent().getEt3CaseDetailsLinksStatuses().getEt1ClaimForm());
        assertEquals(Et3RequestTestConstants.ET3_CASE_DETAILS_LINKS_STATUSES_RESPONDENT_RESPONSE,
                et3Request.getRespondent().getEt3CaseDetailsLinksStatuses().getRespondentResponse());
        assertEquals(Et3RequestTestConstants.ET3_CASE_DETAILS_LINKS_STATUSES_HEARING_DETAILS,
                et3Request.getRespondent().getEt3CaseDetailsLinksStatuses().getHearingDetails());
        assertEquals(Et3RequestTestConstants.ET3_CASE_DETAILS_LINKS_STATUSES_RESPONDENT_REQUESTS_AND_APPLICATIONS,
                et3Request.getRespondent().getEt3CaseDetailsLinksStatuses().getRespondentRequestsAndApplications());
        assertEquals(Et3RequestTestConstants.ET3_CASE_DETAILS_LINKS_STATUSES_CLAIMANT_APPLICATIONS,
                et3Request.getRespondent().getEt3CaseDetailsLinksStatuses().getClaimantApplications());
        assertEquals(Et3RequestTestConstants.ET3_CASE_DETAILS_LINKS_STATUSES_CONTACT_TRIBUNAL,
                et3Request.getRespondent().getEt3CaseDetailsLinksStatuses().getContactTribunal());
        assertEquals(Et3RequestTestConstants.ET3_CASE_DETAILS_LINKS_STATUSES_TRIBUNAL_ORDERS,
                et3Request.getRespondent().getEt3CaseDetailsLinksStatuses().getTribunalOrders());
        assertEquals(Et3RequestTestConstants.ET3_CASE_DETAILS_LINKS_STATUSES_TRIBUNAL_JUDGEMENTS,
                et3Request.getRespondent().getEt3CaseDetailsLinksStatuses().getTribunalJudgements());
        assertEquals(Et3RequestTestConstants.ET3_CASE_DETAILS_LINKS_STATUSES_DOCUMENTS,
                et3Request.getRespondent().getEt3CaseDetailsLinksStatuses().getDocuments());
        assertEquals(Et3RequestTestConstants.ET3_HUB_LINKS_STATUSES_CONTACT_DETAILS,
                et3Request.getRespondent().getEt3HubLinksStatuses().getContactDetails());
        assertEquals(Et3RequestTestConstants.ET3_HUB_LINKS_STATUSES_EMPLOYER_DETAILS,
                et3Request.getRespondent().getEt3HubLinksStatuses().getEmployerDetails());
        assertEquals(Et3RequestTestConstants.ET3_HUB_LINKS_STATUSES_CONCILIATION_AND_EMPLOYEE_DETAILS,
                et3Request.getRespondent().getEt3HubLinksStatuses().getConciliationAndEmployeeDetails());
        assertEquals(Et3RequestTestConstants.ET3_HUB_LINKS_STATUSES_PAY_PENSION_BENEFIT_DETAILS,
                et3Request.getRespondent().getEt3HubLinksStatuses().getPayPensionBenefitDetails());
        assertEquals(Et3RequestTestConstants.ET3_HUB_LINKS_STATUSES_CONTEST_CLAIM,
                et3Request.getRespondent().getEt3HubLinksStatuses().getContestClaim());
        assertEquals(Et3RequestTestConstants.ET3_HUB_LINKS_STATUSES_CHECK_YOUR_ANSWERS,
                et3Request.getRespondent().getEt3HubLinksStatuses().getCheckYorAnswers());
    }

    private static Et3Request generateEt3Request() throws  IOException, URISyntaxException {
        String json = new String(Files.readAllBytes(Paths.get(Objects.requireNonNull(Thread.currentThread()
                .getContextClassLoader().getResource(et3RequestDataFilePath)).toURI())));
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Et3Request.class);
    }
}
