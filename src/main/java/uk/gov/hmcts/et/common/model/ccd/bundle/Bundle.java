package uk.gov.hmcts.et.common.model.ccd.bundle;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value
@Builder(toBuilder = true)
@Jacksonized
public class Bundle {
    private BundleDetails value;

    @JsonCreator
    public Bundle(@JsonProperty("value") BundleDetails value) {
        this.value = value;
    }

}
