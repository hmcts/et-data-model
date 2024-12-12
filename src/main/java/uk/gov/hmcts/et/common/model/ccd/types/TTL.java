package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TTL {
    @JsonProperty("SystemTTL")
    private String systemTTL;
    @JsonProperty("OverrideTTL")
    private String overrideTTL;
    @JsonProperty("Suspended")
    private String suspended;
}
