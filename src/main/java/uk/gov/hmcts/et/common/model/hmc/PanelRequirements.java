package uk.gov.hmcts.et.common.model.hmc;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import static uk.gov.hmcts.et.common.model.hmc.ValidationError.*;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanelRequirements {

    private List<@Size(max = 70, message = ROLE_TYPE_MAX_LENGTH_MSG) String> roleType;

    private List<@Size(max = 70, message = AUTHORISATION_SUB_TYPE_MAX_LENGTH_MSG) String> authorisationSubType;

    @Valid
    private List<PanelPreference> panelPreferences;

    private List<@Size(max = 70, message = PANEL_SPECIALISMS_MAX_LENGTH_MSG) String> panelSpecialisms;

    private List<@Size(max = 70, message = AUTHORISATION_TYPES_MAX_LENGTH_MSG) String> authorisationTypes;

}
