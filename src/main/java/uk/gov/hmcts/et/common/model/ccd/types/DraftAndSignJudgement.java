package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.Document;

@JsonIgnoreProperties(ignoreUnknown = true)
@SuperBuilder
@Data
@NoArgsConstructor
public class DraftAndSignJudgement {
    @JsonProperty("isJudgement")
    private String isJudgement;
    @JsonProperty("draftAndSignJudgementDocument")
    private Document draftAndSignJudgementDocument;
    @JsonProperty("furtherDirections")
    private String furtherDirections;
}
