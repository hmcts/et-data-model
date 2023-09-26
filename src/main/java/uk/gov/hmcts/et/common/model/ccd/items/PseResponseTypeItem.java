package uk.gov.hmcts.et.common.model.ccd.items;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.ccd.types.PseResponseType;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PseResponseTypeItem extends Item<PseResponseType> {
    private String id;
    private PseResponseType value;
}
