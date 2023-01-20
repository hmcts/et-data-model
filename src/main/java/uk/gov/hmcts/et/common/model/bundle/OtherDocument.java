package uk.gov.hmcts.et.common.model.bundle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Value
@Builder(toBuilder = true)
public class OtherDocument {

    @JsonProperty("id")
    public String id;
    @JsonProperty("value")
    public Value value;

}
