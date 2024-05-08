package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class NotificationsExtract {
    @JsonProperty("notificationsExtractFile")
    private UploadedDocumentType notificationsExtractFile;
    @JsonProperty("extractDateTime")
    private String extractDateTime;
}
