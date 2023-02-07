package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class SendNotificationTypeItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private SendNotificationType value;

}
