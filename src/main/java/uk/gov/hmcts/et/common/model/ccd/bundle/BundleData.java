package uk.gov.hmcts.et.common.model.ccd.bundle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value
@Builder(toBuilder = true)
public class BundleData {

    @JsonProperty("bundleConfiguration")
    public String bundleConfiguration;
    @JsonProperty("id")
    public String id;
    @JsonProperty("data")
    public Data data;
    @JsonProperty("caseBundles")
    public List<Bundle> caseBundles;

}