package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class NewEmploymentType {

    @JsonProperty("new_job")
    private String newJob;
    @JsonProperty("newly_employed_from")
    private String newlyEmployedFrom;
    @JsonProperty("new_pay_before_tax")
    private String newPayBeforeTax;
    @JsonProperty("new_job_pay_interval")
    private String newJobPayInterval;
}
