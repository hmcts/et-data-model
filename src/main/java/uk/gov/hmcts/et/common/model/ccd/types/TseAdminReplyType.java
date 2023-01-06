package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class TseAdminReplyType {

    @JsonProperty("date")
    private String date;
    @JsonProperty("enterResponseTitle")
    private String enterResponseTitle;
    @JsonProperty("additionalInformation")
    private String additionalInformation;
    @JsonProperty("addDocument")
    private UploadedDocumentType addDocument;
    @JsonProperty("isCmoOrRequest")
    private String isCmoOrRequest;
    @JsonProperty("cmoMadeBy")
    private String cmoMadeBy;
    @JsonProperty("requestMadeBy")
    private String requestMadeBy;
    @JsonProperty("enterFullName")
    private String enterFullName;
    @JsonProperty("isResponseRequired")
    private String isResponseRequired;
    @JsonProperty("selectPartyRespond")
    private String selectPartyRespond;
    @JsonProperty("selectPartyNotify")
    private String selectPartyNotify;

}
