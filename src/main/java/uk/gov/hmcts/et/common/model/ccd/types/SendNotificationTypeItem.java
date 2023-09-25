package uk.gov.hmcts.et.common.model.ccd.types;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.ccd.items.GenericTypeItem;
import uk.gov.hmcts.et.common.model.ccd.items.Item;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SendNotificationTypeItem extends Item<SendNotificationType> {
    private String id;
    private SendNotificationType value;
}
