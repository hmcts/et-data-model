package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class SendNotificationTypeMultiple extends SendNotificationType {

    @JsonProperty("sendNotificationNotifyLeadCase")
    private String sendNotificationNotifyLeadCase;
    @JsonProperty("sendNotificationNotifyAll")
    private String sendNotificationNotifyAll;
}
