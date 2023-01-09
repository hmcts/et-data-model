package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.types.TseRespondentReplyType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class TseRespondentReplyTypeItem implements TseReplyTypeItem {
    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private TseRespondentReplyType value;

    public String getDate() {
        return this.value.getDate();
    }
}
