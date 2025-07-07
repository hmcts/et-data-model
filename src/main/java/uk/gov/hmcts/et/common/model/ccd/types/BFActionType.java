package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class BFActionType {

    @JsonProperty("action")
    private DynamicFixedListType action;
    @JsonProperty("cwActions")
    private String cwActions;
    @JsonProperty("dateEntered")
    private String dateEntered;
    @JsonProperty("imported")
    private String imported;
    @JsonProperty("letters")
    private String letters;
    @JsonProperty("allActions")
    private String allActions;
    @JsonProperty("bfDate")
    private String bfDate;
    @JsonProperty("cleared")
    private String cleared;
    @JsonProperty("notes")
    private String notes;
    //flag to track if a wa task is already created for an expired bf due date
    @JsonProperty("isWaTaskCreated")
    private String isWaTaskCreated;
}
