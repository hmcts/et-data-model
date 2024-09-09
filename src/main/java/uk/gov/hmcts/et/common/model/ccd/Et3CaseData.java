package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import uk.gov.hmcts.et.common.model.ccd.types.et3hub.ET3CaseDetailsLinksStatuses;
import uk.gov.hmcts.et.common.model.ccd.types.et3hub.ET3HubLinksStatuses;

/**
 * Employment tribunal response to claim data that is input on the ET3 form by a claimant.
 * This class should only contain data that is specifically part of the ET3 form.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@EqualsAndHashCode(callSuper = false)
public class Et3CaseData extends Et1CaseData {
    // ET3 hub
    @JsonProperty("et3CaseDetailsLinksStatuses")
    private ET3CaseDetailsLinksStatuses et3CaseDetailsLinksStatuses;
    @JsonProperty("et3HubLinksStatuses")
    private ET3HubLinksStatuses et3HubLinksStatuses;
}
