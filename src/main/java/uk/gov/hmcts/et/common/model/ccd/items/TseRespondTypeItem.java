package uk.gov.hmcts.et.common.model.ccd.items;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.ccd.types.TseRespondType;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TseRespondTypeItem extends Item<TseRespondType> {
    private String id;
    private TseRespondType value;
}
