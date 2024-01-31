package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import uk.gov.hmcts.et.common.model.generic.GenericCaseDetails;

@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GenericTypeCaseDetails<T> extends GenericCaseDetails {

    @JsonProperty("case_data")
    private T caseData;
}