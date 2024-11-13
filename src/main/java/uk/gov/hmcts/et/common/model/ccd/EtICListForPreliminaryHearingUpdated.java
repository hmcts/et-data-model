package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtICListForPreliminaryHearingUpdated {
    @JsonProperty("etICTypeOfPreliminaryHearing")
    private List<String> etICTypeOfPreliminaryHearing;
    @JsonProperty("etICLengthOfPrelimHearing")
    private String etICLengthOfPrelimHearing;
    @JsonProperty("prelimHearingLengthNumType")
    private String prelimHearingLengthNumType;
    @JsonProperty("etICPurposeOfPreliminaryHearing")
    private List<String> etICPurposeOfPreliminaryHearing;
    @JsonProperty("etICGiveDetailsOfHearingNotice")
    private String etICGiveDetailsOfHearingNotice;
    @JsonProperty("etICIsPreliminaryHearingWithMembers")
    private String etICIsPreliminaryHearingWithMembers;
    @JsonProperty("etICIsPreliminaryHearingWithMembersReason")
    private String etICIsPreliminaryHearingWithMembersReason;
}
