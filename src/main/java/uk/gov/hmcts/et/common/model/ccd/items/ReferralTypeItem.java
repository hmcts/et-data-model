package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.types.ReferralType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ReferralTypeItem {
    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private ReferralType value;
}
