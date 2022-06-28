package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Et1VettingRespondentAcasType {

    @JsonProperty("et1VettingRespondentDetailsMarkUp")
    private String et1VettingRespondentDetailsMarkUp;
    @JsonProperty("et1VettingRespondentAcasNumberMarkUp")
    private String et1VettingRespondentAcasNumberMarkUp;
    @JsonProperty("et1VettingRespondentAcasIsYesOrNo")
    private String et1VettingRespondentAcasIsYesOrNo;
    @JsonProperty("et1VettingRespondentAcasExemptYesOrNo")
    private String et1VettingRespondentAcasExemptYesOrNo;

}
