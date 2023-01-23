package uk.gov.hmcts.et.common.model.ccd.bundle;

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
public class Data {
    @JsonProperty("furtherEvidences")
    public List<FurtherEvidence> furtherEvidences;
    @JsonProperty("otherDocuments")
    public List<OtherDocument> otherDocuments;
}
