package uk.gov.hmcts.et.common.model.listing.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.listing.types.ReportListingsType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ReportListingsTypeItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private ReportListingsType value;
}
