package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Et1VettingRespondentAcasTypeItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private Et1VettingRespondentAcasType value;

}
