package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GenericTseApplicationTypeItem {
    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private GenericTseApplicationType value;
}
