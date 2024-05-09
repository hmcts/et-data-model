package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class RemovedHearingBundleItem {
    @JsonProperty("bundleName")
    private String bundleName;

    @JsonProperty("removedDateTime")
    private String removedDateTime;

    @JsonProperty("removedReason")
    private String removedReason;
}
