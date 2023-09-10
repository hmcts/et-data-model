package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("name_cy")
    private String nameCy;
    private String subTypeValue;
    @JsonProperty("subTypeValue_cy")
    private String subTypeValueCy;
    private String subTypeKey;
    private String otherDescription;
    @JsonProperty("otherDescription_cy")
    private String otherDescriptionCy;
    private String flagComment;
    @JsonProperty("flagComment_cy")
    private String flagCommentCy;
    private String dateTimeModified;
    private String dateTimeCreated;
    private ListTypeItem<String> path;
    private String hearingRelevant;
    private String flagCode;
    private String status;
    private String availableExternally;
}