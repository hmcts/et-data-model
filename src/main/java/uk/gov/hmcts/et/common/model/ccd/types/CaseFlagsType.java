package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.ccd.items.FlagDetailType;
import uk.gov.hmcts.et.common.model.ccd.items.ListTypeItem;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CaseFlagsType {
    @JsonProperty("partyName")
    private String partyName;
    @JsonProperty("roleOnCase")
    private String roleOnCase;
    @JsonProperty("details")
    private ListTypeItem<FlagDetailType> details;
    @JsonProperty("groupId")
    private String groupId;
    @JsonProperty("visibility")
    private String visibility;
}
