package uk.gov.hmcts.et.common.model.ccd.items;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlagDetailType {
    private String name;
    private String subTypeValue;
    private String subTypeKey;
    private String otherDescription;
    private String otherDescription_cy;
    private String flagComment;
    private String flagComment_cy;
    private String dateTimeModified;
    private String dateTimeCreated;
    private ListTypeItem<String> path;
    private String hearingRelevant;
    private String flagCode;
    private String status;
}
