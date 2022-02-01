package uk.gov.hmcts.ecm.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.ecm.common.model.ccd.types.DocumentType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class DocumentTypeItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private DocumentType value;
}
