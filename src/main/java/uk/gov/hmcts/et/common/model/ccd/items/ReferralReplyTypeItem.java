package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.types.ReferralReplyType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ReferralReplyTypeItem {
    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private ReferralReplyType value;
}
