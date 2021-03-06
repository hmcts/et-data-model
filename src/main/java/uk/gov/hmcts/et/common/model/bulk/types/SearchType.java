package uk.gov.hmcts.et.common.model.bulk.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class SearchType {

    @JsonProperty("caseIDS")
    private String caseIDS;
    @JsonProperty("ethosCaseReferenceS")
    private String ethosCaseReferenceS;
    @JsonProperty("leadClaimantS")
    private String leadClaimantS;
    @JsonProperty("clerkRespS")
    private String clerkRespS;
    @JsonProperty("claimantSurnameS")
    private String claimantSurnameS;
    @JsonProperty("respondentSurnameS")
    private String respondentSurnameS;
    @JsonProperty("claimantRepS")
    private String claimantRepS;
    @JsonProperty("respondentRepS")
    private String respondentRepS;
    @JsonProperty("fileLocS")
    private String fileLocS;
    @JsonProperty("receiptDateS")
    private String receiptDateS;
    @JsonProperty("positionTypeS")
    private String positionTypeS;
    @JsonProperty("feeGroupReferenceS")
    private String feeGroupReferenceS;
    @JsonProperty("jurCodesCollectionTextS")
    private String jurCodesCollectionS;
    @JsonProperty("stateS")
    private String stateS;
    @JsonProperty("currentPositionS")
    private String currentPositionS;
    @JsonProperty("claimantAddressLine1S")
    private String claimantAddressLine1S;
    @JsonProperty("claimantPostCodeS")
    private String claimantPostCodeS;
    @JsonProperty("respondentAddressLine1S")
    private String respondentAddressLine1S;
    @JsonProperty("respondentPostCodeS")
    private String respondentPostCodeS;
    @JsonProperty("flag1S")
    private String flag1S;
    @JsonProperty("flag2S")
    private String flag2S;
    @JsonProperty("EQPS")
    private String eqps;
    @JsonProperty("respondentRepOrgS")
    private String respondentRepOrgS;
    @JsonProperty("claimantRepOrgS")
    private String claimantRepOrgS;
}
