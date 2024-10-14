package uk.gov.hmcts.et.common.model.bundle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value
@Builder(toBuilder = true)
@Jacksonized
public class BundleCreateResponse {

    @JsonProperty("data")
    public BundleData data;
    @JsonProperty("errors")
    public List<String> errors;
    @JsonProperty("warnings")
    public List<String> warnings;
    @JsonProperty("documentTaskId")
    public Integer documentTaskId;

}