package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Et3VettingType {
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
    private DocumentTypeItem et3CompanyHouseDocument;
    @JsonProperty("et3GeneralNotesCompanyHouse")
    private String et3GeneralNotesCompanyHouse;
    // ET3 Individual insolvency search document page
    @JsonProperty("et3IsThereAnIndividualSearchDocument")
    private String et3IsThereAnIndividualSearchDocument;
    @JsonProperty("et3IndividualInsolvencyDocument")
    private DocumentTypeItem et3IndividualInsolvencyDocument;
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
    @JsonProperty("et3RespondentAddressMismatchDetails")
    private String et3RespondentAddressMismatchDetails;
    @JsonProperty("et3GeneralNotesRespondentAddress")
    private String et3GeneralNotesRespondentAddress;
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
}
