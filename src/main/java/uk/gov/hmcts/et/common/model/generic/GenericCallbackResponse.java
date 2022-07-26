package uk.gov.hmcts.et.common.model.generic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.SignificantItem;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericCallbackResponse {

    private List<String> errors;
    private List<String> warnings;
    private String confirmationHeader;
    private String confirmationBody;
    private SignificantItem significantItem;
    private String state;
}

