package uk.gov.hmcts.et.common.model.bulk.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.bulk.types.MultipleType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class MultipleTypeItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private MultipleType value;
}
