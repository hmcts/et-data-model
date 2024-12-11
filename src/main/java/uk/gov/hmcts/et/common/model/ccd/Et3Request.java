package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.ccd.items.RespondentSumTypeItem;

/**
 * Model to update or submit ET3 form.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Et3Request {
    @JsonProperty("caseSubmissionReference")
    private String caseSubmissionReference;
    @JsonProperty("requestType")
    private String requestType;
    @JsonProperty("caseTypeId")
    private String caseTypeId;
    @JsonProperty("caseDetailsLinksSectionId")
    private String caseDetailsLinksSectionId;
    @JsonProperty("caseDetailsLinksSectionStatus")
    private String caseDetailsLinksSectionStatus;
    @JsonProperty("responseHubLinksSectionId")
    private String responseHubLinksSectionId;
    @JsonProperty("responseHubLinksSectionStatus")
    private String responseHubLinksSectionStatus;
    @JsonProperty("respondent")
    private RespondentSumTypeItem respondent;
}
