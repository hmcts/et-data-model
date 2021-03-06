package uk.gov.hmcts.et.common.model.generic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@ToString
public class GenericCaseDetails {

    @JsonProperty("id")
    private String caseId;
    @JsonProperty("jurisdiction")
    private String jurisdiction;
    @JsonProperty("state")
    private String state;

    @JsonProperty("case_type_id")
    private String caseTypeId;
    @JsonProperty("created_date")
    private LocalDateTime createdDate;
    @JsonProperty("last_modified")
    private LocalDateTime lastModified;
    @JsonProperty("data_classification")
    private Map<String, JsonNode> dataClassification;
}
