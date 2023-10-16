package uk.gov.hmcts.et.common.model.bundle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@JsonIgnoreProperties(ignoreUnknown = true)
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Jacksonized
public record MultiBundleConfig(String value) {

}