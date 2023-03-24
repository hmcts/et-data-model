package uk.gov.hmcts.et.common.model.ccd.types.citizenhub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.et.common.model.ccd.types.UploadedDocumentType;

import java.util.AbstractMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ClaimantTse {

    @JsonProperty("contactApplicationType")
    private String contactApplicationType;
    @JsonProperty("contactApplicationText")
    private String contactApplicationText;
    @JsonProperty("contactApplicationFile")
    private UploadedDocumentType contactApplicationFile;
    @JsonProperty("copyToOtherPartyYesOrNo")
    private String copyToOtherPartyYesOrNo;
    @JsonProperty("copyToOtherPartyText")
    private String copyToOtherPartyText;

    public static final Map<String, String> APP_TYPE_MAP = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("withdraw", "Withdraw all/part of claim"),
            new AbstractMap.SimpleEntry<>("change-details", "Change my personal details"),
            new AbstractMap.SimpleEntry<>("postpone", "Postpone a hearing"),
            new AbstractMap.SimpleEntry<>("vary", "Vary/revoke an order"),
            new AbstractMap.SimpleEntry<>("reconsider-decision", "Consider a decision afresh"),
            new AbstractMap.SimpleEntry<>("amend", "Amend my claim"),
            new AbstractMap.SimpleEntry<>("respondent", "Order respondent to do something"),
            new AbstractMap.SimpleEntry<>("witness", "Order a witness to attend"),
            new AbstractMap.SimpleEntry<>("non-compliance", "Tell tribunal respondent not complied"),
            new AbstractMap.SimpleEntry<>("publicity", "Restrict publicity"),
            new AbstractMap.SimpleEntry<>("strike", "Strike out all/part of response"),
            new AbstractMap.SimpleEntry<>("reconsider-judgement", "Reconsider judgement"),
            new AbstractMap.SimpleEntry<>("other", "Contact about something else")
    );
}
