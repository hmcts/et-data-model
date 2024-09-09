package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import uk.gov.hmcts.et.common.model.ccd.types.et3hub.ET3CaseDetailsLinksStatuses;
import uk.gov.hmcts.et.common.model.ccd.types.et3hub.ET3HubLinksStatuses;
import uk.gov.hmcts.et.common.model.generic.BaseCaseData;

/**
 * Employment Tribunal claim data that is input on the ET1 form by a claimant.
 * This class should only contain data that is specifically part of the ET1 form.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Et3CaseData extends BaseCaseData {
    // ET3 hub
    @JsonProperty("et3CaseDetailsLinksStatuses")
    private ET3CaseDetailsLinksStatuses et3CaseDetailsLinksStatuses;
    @JsonProperty("et3HubLinksStatuses")
    private ET3HubLinksStatuses et3HubLinksStatuses;
}
