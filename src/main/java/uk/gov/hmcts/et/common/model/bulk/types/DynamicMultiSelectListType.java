package uk.gov.hmcts.et.common.model.bulk.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class DynamicMultiSelectListType {

    private ArrayList<DynamicValueType> value;
    @JsonProperty("list_items")
    private List<DynamicValueType> listItems;
}
