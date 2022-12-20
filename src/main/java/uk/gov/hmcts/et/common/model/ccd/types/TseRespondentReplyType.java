package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class TseRespondentReplyType {
  @JsonProperty("from")
  private String from;
  @JsonProperty("date")
  private String date;
  @JsonProperty("response")
  private String response;
  @JsonProperty("hasSupportingMaterial")
  private String hasSupportingMaterial;
  @JsonProperty("supportingMaterial")
  private List<DocumentTypeItem> supportingMaterial;
  @JsonProperty("copyToOtherParty")
  private String copyToOtherParty;
  @JsonProperty("copyNoGiveDetails")
  private String copyNoGiveDetails;
  @JsonProperty("summaryPdf")
  private UploadedDocumentType summaryPdf;
}