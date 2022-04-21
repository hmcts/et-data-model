package uk.gov.hmcts.ecm.common.model.listing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import uk.gov.hmcts.ecm.common.model.generic.GenericCaseDetails;

@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ListingDetails extends GenericCaseDetails {

    @JsonProperty("case_data")
    private ListingData caseData;
}
