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
public class BundleDocument {
    private BundleDocumentDetails value;

    @JsonCreator
    public BundleDocument(@JsonProperty("value") BundleDocumentDetails value) {
        this.value = value;
    }
}