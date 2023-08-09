package uk.gov.hmcts.et.common.model.bundle;

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
public class BundleSubfolder {
    private BundleSubfolderDetails value;

    @JsonCreator
    public BundleSubfolder(@JsonProperty("value") BundleSubfolderDetails value) {
        this.value = value;
    }
}