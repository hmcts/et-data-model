package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@SuperBuilder
@Data
@NoArgsConstructor
public class RequestDetails {
    @JsonProperty("versionNumber")
    @NotNull(message = ValidationError.VERSION_NUMBER_NULL_EMPTY)
    private String versionNumber;
}
