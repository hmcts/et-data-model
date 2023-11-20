package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtICFurtherInfoAnswers {
    @JsonProperty("etICFurtherInformationGiveDetails")
    private String etICFurtherInformationGiveDetails;
    @JsonProperty("etICFurtherInformationTimeToComply")
    private String etICFurtherInformationTimeToComply;
}


