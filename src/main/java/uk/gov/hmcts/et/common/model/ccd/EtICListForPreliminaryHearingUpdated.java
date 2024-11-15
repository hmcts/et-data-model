package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtICListForPreliminaryHearingUpdated {
    @JsonProperty("etICTypeOfPreliminaryHearingV2")
    private List<String> etICTypeOfPreliminaryHearing;
    @JsonProperty("etICPurposeOfPreliminaryHearingV2")
    private List<String> etICPurposeOfPreliminaryHearing;
    @JsonProperty("etICGiveDetailsOfHearingNoticeV2")
    private String etICGiveDetailsOfHearingNotice;
    @JsonProperty("etICLengthOfPrelimHearingV2")
    private String etICLengthOfPrelimHearing;
    @JsonProperty("prelimHearingLengthNumTypeV2")
    private String prelimHearingLengthNumType;
    @JsonProperty("etICIsPreliminaryHearingWithMembersV2")
    private String etICIsPreliminaryHearingWithMembers;
    @JsonProperty("etICIsPreliminaryHearingWithMembersReasonV2")
    private String etICIsPreliminaryHearingWithMembersReason;
}
