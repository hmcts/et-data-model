package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor

public class Judiciary {

    private List<String> roleType;
    private List<String> authorisationTypes;
    private List<String> authorisationSubType;
//    private List<PanelComposition> panelComposition; this does not exist in the code base currently
    private List<PanelPreference> judiciaryPreferences;
    private List<String> judiciarySpecialisms;
}
