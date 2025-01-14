package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuppressWarnings("PMD.AbbreviationAsWordInName") //Suppress due to generic field names
public class TTL {
    @JsonProperty("SystemTTL")
    private LocalDate systemTTL;
    @JsonProperty("OverrideTTL")
    private LocalDate overrideTTL;
    @JsonProperty("Suspended")
    private String suspended;
}
