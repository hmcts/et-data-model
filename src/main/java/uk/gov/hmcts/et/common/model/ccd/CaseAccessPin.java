package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

/**
 * Defines the access pin which can be used by third parties such as defendants, legal representatives etc...
 */
@Data
@Builder
@Jacksonized
public class CaseAccessPin {
    @JsonProperty("accessCode")
    private final String accessCode;
    @JsonProperty("expiryDate")
    private final String expiryDate;
    @JsonProperty("caseAccessibleRoles")
    private final List<String> caseAccessibleRoles;
}
