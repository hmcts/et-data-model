package uk.gov.hmcts.et.common.model.ccd.bundle;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Value
@Builder(toBuilder = true)
@Jacksonized
public class BundleFolderDetails {
    private String name;
    private List<BundleDocument> documents;
    private List<BundleSubfolder> folders;
    private int sortIndex;

    @JsonCreator
    public BundleFolderDetails(@JsonProperty("name") String name,
                               @JsonProperty("documents") List<BundleDocument> documents,
                               @JsonProperty("folders") List<BundleSubfolder> folders,
                               @JsonProperty("sortIndex") int sortIndex) {
        this.name = name;
        this.documents = documents;
        this.folders = folders;
        this.sortIndex = sortIndex;
    }
}
