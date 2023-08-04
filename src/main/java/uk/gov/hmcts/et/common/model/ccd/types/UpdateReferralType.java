package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class UpdateReferralType {
    @JsonProperty("updateReferralNumber")
    private String updateReferralNumber;
    @JsonProperty("updateReferralHearingDate")
    private String updateReferralHearingDate;
    @JsonProperty("updateReferCaseTo")
    private String updateReferCaseTo;
    @JsonProperty("updateReferentEmail")
    private String updateReferentEmail;
    @JsonProperty("updateIsUrgent")
    private String updateIsUrgent;
    @JsonProperty("updateReferralSubject")
    private String updateReferralSubject;
    @JsonProperty("updateReferralSubjectSpecify")
    private String updateReferralSubjectSpecify;
    @JsonProperty("updateReferralDetails")
    private String updateReferralDetails;
    @JsonProperty("updateReferralDocument")
    private List<DocumentTypeItem> updateReferralDocument;
    @JsonProperty("updateReferralInstruction")
    private String updateReferralInstruction;
    @JsonProperty("updateReferredBy")
    private String updateReferredBy;
    @JsonProperty("updateReferralDate")
    private String updateReferralDate;
}

