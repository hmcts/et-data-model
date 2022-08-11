package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.items.DocumentTypeItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ReferralType {
    @JsonProperty("referralNumber")
    private String referralNumber;
    @JsonProperty("referCaseTo")
    private String referCaseTo;
    @JsonProperty("referrerEmail")
    private String referrerEmail;
    @JsonProperty("isUrgent")
    private String isUrgent;
    @JsonProperty("referralSubject")
    private String referralSubject;
    @JsonProperty("referralSubjectSpecify")
    private String referralSubjectSpecify;
    @JsonProperty("referralDetails")
    private String referralDetails;
    @JsonProperty("referralDocument")
    private List<DocumentTypeItem> referralDocument;
    @JsonProperty("referralInstruction")
    private String referralInstruction;
    @JsonProperty("referredBy")
    private String referredBy;
    @JsonProperty("referralDate")
    private String referralDate;
    @JsonProperty("referralStatus")
    private String referralStatus;
}

