package uk.gov.hmcts.et.common.model.ccd.bundle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Value
@Builder(toBuilder = true)
@Jacksonized
public class Value {

    @JsonProperty("documentFileName")
    public String documentFileName;
    @JsonProperty("documentLink")
    public DocumentLink documentLink;
    @JsonProperty("typeOfDocumentFurtherEvidence")
    public String typeOfDocumentFurtherEvidence;
    @JsonProperty("restrictCheckboxFurtherEvidence")
    public List<Object> restrictCheckboxFurtherEvidence = null;

}
