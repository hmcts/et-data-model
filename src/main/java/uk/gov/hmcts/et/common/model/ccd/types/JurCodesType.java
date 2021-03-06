package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class JurCodesType {

    @JsonProperty("juridictionCodesList")
    private String juridictionCodesList;
    @JsonProperty("judgmentOutcome")
    private String judgmentOutcome;
    @JsonProperty("dateNotified")
    private String dateNotified;
    @JsonProperty("disposalDate")
    private String disposalDate;
    @JsonProperty("juridictionCodesSubList1")
    private String juridictionCodesSubList1;
}
