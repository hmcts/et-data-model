package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.items.GenericTypeItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class PseResponseType {

    @JsonProperty("date")
    private String date;

    @JsonProperty("from")
    private String from;

    // Response
    @JsonProperty("response")
    private String response;
    @JsonProperty("hasSupportingMaterial")
    private String hasSupportingMaterial;
    @JsonProperty("supportingMaterial")
    private List<GenericTypeItem<DocumentType>> supportingMaterial;
    @JsonProperty("copyToOtherParty")
    private String copyToOtherParty;
    @JsonProperty("copyNoGiveDetails")
    private String copyNoGiveDetails;

}
