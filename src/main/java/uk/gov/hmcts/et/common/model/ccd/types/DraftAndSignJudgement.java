package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@SuperBuilder
@Data
@NoArgsConstructor
public class DraftAndSignJudgement {
    @JsonProperty("isJudgement")
    private String isJudgement;
    @JsonProperty("draftAndSignJudgementDocuments")
    private List<DocumentTypeItem> draftAndSignJudgementDocuments;
    @JsonProperty("furtherDirections")
    private String furtherDirections;
}
