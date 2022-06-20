package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TaskListCheckType {

    @JsonProperty("personalDetailsCheck")
    private String personalDetailsCheck;
    @JsonProperty("employmentAndRespondentCheck")
    private String employmentAndRespondentCheck;
    @JsonProperty("claimDetailsCheck")
    private String claimDetailsCheck;
}
