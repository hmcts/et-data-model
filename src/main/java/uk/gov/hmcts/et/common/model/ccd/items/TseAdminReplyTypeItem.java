package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.types.TseAdminReplyType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class TseAdminReplyTypeItem implements TseReplyTypeItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private TseAdminReplyType value;

    public String getDate() {
        return this.value.getDate();
    }

    public TseAdminReplyType getValue() {
        return this.value;
    }

}
