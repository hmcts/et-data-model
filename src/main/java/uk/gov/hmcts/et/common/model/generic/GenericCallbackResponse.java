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
// Suppression required as the confirmation_header, body and siginificant_item need to be in this format
@SuppressWarnings("checkstyle:MemberName")
public class GenericCallbackResponse {

    private List<String> errors;
    private List<String> warnings;
    private String confirmation_header;
    private String confirmation_body;
    private SignificantItem significant_item;
    private String state;
}

