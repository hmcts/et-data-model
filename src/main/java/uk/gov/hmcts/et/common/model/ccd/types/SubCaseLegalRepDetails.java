package uk.gov.hmcts.et.common.model.ccd.types;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import uk.gov.hmcts.et.common.model.ccd.items.ListTypeItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubCaseLegalRepDetails {
    @JsonProperty("caseReference")
    private String caseReference;
    @JsonProperty("legalRepIds")
    private List<String> legalRepIds;
}
