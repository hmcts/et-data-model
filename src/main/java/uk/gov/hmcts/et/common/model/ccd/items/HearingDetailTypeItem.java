package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import uk.gov.hmcts.et.common.model.ccd.types.HearingDetailType;

public class HearingDetailTypeItem {
    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private HearingDetailType value;
}
