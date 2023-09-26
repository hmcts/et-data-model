package uk.gov.hmcts.et.common.model.ccd.items;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenericTseApplicationTypeItem extends Item<GenericTseApplicationType> {
    private String id;
    private GenericTseApplicationType value;
}