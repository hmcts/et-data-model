package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.ccd.items.ListTypeItem;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubCaseLegalRepDetails {
    @JsonProperty("caseReference")
    private String caseReference;
    @JsonProperty("legalRepIds")
    private ListTypeItem<String> legalRepIds;
}
