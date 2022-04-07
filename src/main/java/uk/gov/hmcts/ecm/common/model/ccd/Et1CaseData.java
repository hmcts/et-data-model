package uk.gov.hmcts.ecm.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.ecm.common.model.ccd.types.AdditionalCaseInfoType;
import uk.gov.hmcts.ecm.common.model.ccd.items.JurCodesTypeItem;
import uk.gov.hmcts.ecm.common.model.ccd.types.ClaimantIndType;
import uk.gov.hmcts.ecm.common.model.ccd.items.RespondentSumTypeItem;
import uk.gov.hmcts.ecm.common.model.ccd.types.ClaimantWorkAddressType;
import uk.gov.hmcts.ecm.common.model.ccd.types.ClaimantOtherType;
import uk.gov.hmcts.ecm.common.model.ccd.types.RepresentedTypeC;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Et1CaseData {
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
}
