package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class PseStatusType {

    @JsonProperty("userIdamId")
    private String userIdamId;
    @JsonProperty("notificationState")
    private String notificationState;
    @JsonProperty("dateTime")
    private String dateTime;

}
