package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TTL {
    @JsonProperty("systemTTL")
    private String systemTTL;
    @JsonProperty("overrideTTL")
    private String overrideTTL;
    @JsonProperty("suspendedTTL")
    private String suspendedTTL;
}
