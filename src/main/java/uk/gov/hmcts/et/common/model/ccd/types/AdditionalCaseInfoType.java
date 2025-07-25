package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class AdditionalCaseInfoType {

    @JsonProperty("additional_live_appeal")
    private String additionalLiveAppeal;
    @JsonProperty("additional_sensitive")
    private String additionalSensitive;
    @JsonProperty("doNotPostpone")
    private String doNotPostpone;
    @JsonProperty("digitalFile")
    private String digitalFile;
    @JsonProperty("reasonableAdjustment")
    private String reasonableAdjustment;
    @JsonProperty("interventionRequired")
    private String interventionRequired;
    @JsonProperty("reservedToJudge")
    private String reservedToJudge;
}
