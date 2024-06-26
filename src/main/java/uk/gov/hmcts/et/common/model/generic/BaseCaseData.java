package uk.gov.hmcts.et.common.model.generic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;
import uk.gov.hmcts.et.common.model.bundle.Bundle;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.ReferralTypeItem;
import uk.gov.hmcts.et.common.model.ccd.types.CaseLocation;
import uk.gov.hmcts.et.common.model.ccd.types.DigitalCaseFileType;

import java.util.List;

/**
 * Data common to single and multiple cases.
 */
@Getter
@Setter
public class BaseCaseData {
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

    //Document collection
    private List<DocumentTypeItem> documentCollection;
    private List<DocumentTypeItem> claimantDocumentCollection;
    private List<DocumentTypeItem> legalrepDocumentCollection;

    @JsonProperty("digitalCaseFile")
    private DigitalCaseFileType digitalCaseFile;

    @JsonProperty("bundleConfiguration")
    private String bundleConfiguration;

    @JsonProperty("caseBundles")
    private List<Bundle> caseBundles;

    private String nextListedDate;

    @JsonProperty("caseManagementLocation")
    private CaseLocation caseManagementLocation;
    @JsonProperty("managingOffice")
    private String managingOffice;
}
