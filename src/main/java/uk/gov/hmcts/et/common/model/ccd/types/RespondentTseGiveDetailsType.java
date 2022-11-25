package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;

public class RespondentTseGiveDetailsType {

    @JsonProperty("resTseDocuments")
    private DocumentTypeItem resTseDocuments;
    @JsonProperty("resTseTextBox")
    private String resTseTextBox;
}
