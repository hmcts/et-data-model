package uk.gov.hmcts.et.common.model.bundle;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value
@Builder(toBuilder = true)
@Jacksonized
public class BundleDocumentDetails {
    private String name;
    private String description;
    private int sortIndex;
    private DocumentLink sourceDocument;

    @JsonCreator
    public BundleDocumentDetails(@JsonProperty("name") String name,
                                 @JsonProperty("description") String description,
                                 @JsonProperty("sortIndex") int sortIndex,
                                 @JsonProperty("sourceDocument") DocumentLink sourceDocument) {
        this.name = name;
        this.description = description;
        this.sortIndex = sortIndex;
        this.sourceDocument = sourceDocument;
    }
}