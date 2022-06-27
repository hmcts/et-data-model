package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;
import uk.gov.hmcts.et.common.model.ccd.items.VettingJurCodesTypeItem;
import uk.gov.hmcts.et.common.model.ccd.types.*;
import uk.gov.hmcts.et.common.model.ccd.items.JurCodesTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.RespondentSumTypeItem;

import java.util.List;

/**
 * Employment Tribunal claim data that is input on the \ET1 form by a claimant.
 *
 * This class should only contain data that is specifically part of the ET1 form.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Et1CaseData {
    @JsonProperty("typeOfClaim")
    private List<String> typeOfClaim;
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
    @JsonProperty("claimantTaskListChecks")
    private TaskListCheckType claimantTaskListChecks;
}
