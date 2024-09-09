package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import uk.gov.hmcts.et.common.model.ccd.items.JurCodesTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.RespondentSumTypeItem;
import uk.gov.hmcts.et.common.model.ccd.types.AdditionalCaseInfoType;
import uk.gov.hmcts.et.common.model.ccd.types.ClaimantHearingPreference;
import uk.gov.hmcts.et.common.model.ccd.types.ClaimantIndType;
import uk.gov.hmcts.et.common.model.ccd.types.ClaimantOtherType;
import uk.gov.hmcts.et.common.model.ccd.types.ClaimantRequestType;
import uk.gov.hmcts.et.common.model.ccd.types.ClaimantType;
import uk.gov.hmcts.et.common.model.ccd.types.ClaimantWorkAddressType;
import uk.gov.hmcts.et.common.model.ccd.types.NewEmploymentType;
import uk.gov.hmcts.et.common.model.ccd.types.RepresentedTypeC;
import uk.gov.hmcts.et.common.model.ccd.types.TaskListCheckType;
import uk.gov.hmcts.et.common.model.ccd.types.TriageQuestions;
import uk.gov.hmcts.et.common.model.ccd.types.citizenhub.HubLinksStatuses;

import java.util.List;

/**
 * Employment Tribunal claim data that is input on the ET1 form by a claimant.
 * This class should only contain data that is specifically part of the ET1 form.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@EqualsAndHashCode(callSuper = false)
public class Et1CaseData extends Et3CaseData {
    @JsonProperty("typeOfClaim")
    private List<String> typeOfClaim;
    @JsonProperty("typesOfClaim")
    private List<String> typesOfClaim;
    @JsonProperty("caseType")
    private String ecmCaseType;
    @JsonProperty("caseSource")
    private String caseSource;
    @JsonProperty("claimantRepresentedQuestion")
    private String claimantRepresentedQuestion;
    @JsonProperty("claimantWorkAddressQuestion")
    private String claimantWorkAddressQuestion;
    @JsonProperty("ClaimantPcqId")
    private String claimantPcqId;
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
    @JsonProperty("claimantTaskListChecks")
    private TaskListCheckType claimantTaskListChecks;
    @JsonProperty("receiptDate")
    private String receiptDate;
    @JsonProperty("triageQuestions")
    private TriageQuestions triageQuestions;
    @JsonProperty("et1OnlineSubmission")
    private String et1OnlineSubmission;
    // Citizen hub
    @JsonProperty("hubLinksStatuses")
    private HubLinksStatuses hubLinksStatuses;
}
