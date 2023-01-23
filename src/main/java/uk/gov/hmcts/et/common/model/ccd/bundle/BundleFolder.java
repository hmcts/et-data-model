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
public class BundleFolder {
    private BundleFolderDetails value;

    @JsonCreator
    public BundleFolder(@JsonProperty("value") BundleFolderDetails value) {
        this.value = value;
    }
}
