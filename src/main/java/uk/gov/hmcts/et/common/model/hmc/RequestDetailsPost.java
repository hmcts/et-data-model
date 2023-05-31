package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestDetailsPost {
    @JsonProperty("versionNumber")
    @NotNull(message = ValidationError.VERSION_NUMBER_NULL_EMPTY)
    private Integer versionNumber;
}
