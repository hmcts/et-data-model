package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class EtICHearingListedAnswers {
    @JsonProperty("etICHearingListed")
    private List<String> etICHearingListed;
    @JsonProperty("etICExtendDurationGiveDetails")
    private String etICExtendDurationGiveDetails;
    @JsonProperty("etICOtherGiveDetails")
    private String etICOtherGiveDetails;

    @JsonProperty("etICIsHearingWithJudgeOrMembers")
    private String etICIsHearingWithJudgeOrMembers;
    @JsonProperty("etICIsHearingWithJudgeOrMembersReason")
    private List<String> etICIsHearingWithJudgeOrMembersReason;
    @JsonProperty("etICIsHearingWithJudgeOrMembersFurtherDetails")
    private String etICIsHearingWithJudgeOrMembersFurtherDetails;

    @JsonProperty("etICHearingAnyOtherDirections")
    private String etICHearingAnyOtherDirections;
}
