package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.hmc.validator.ListingReasonCodeEnum;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static uk.gov.hmcts.et.common.model.hmc.ValidationError.AMEND_REASON_CODE_MAX_LENGTH;
import static uk.gov.hmcts.et.common.model.hmc.ValidationError.FACILITIES_REQUIRED_MAX_LENGTH_MSG;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HearingDetails {

    @JsonProperty("autolistFlag")
    @NotNull(message = ValidationError.AUTO_LIST_FLAG_NULL_EMPTY)
    private Boolean autoListFlag;

    @ListingReasonCodeEnum(enumClass = ListingReasonCode.class, fieldName = "listingAutoChangeReasonCode")
    @Size(max = 70, message = ValidationError.LISTING_REASON_CODE_MAX_LENGTH)
    private String listingAutoChangeReasonCode;

    @NotEmpty(message = ValidationError.HEARING_TYPE_NULL_EMPTY)
    @Size(max = 40, message = ValidationError.HEARING_TYPE_MAX_LENGTH)
    private String hearingType;

    private HearingWindow hearingWindow;

    @NotNull(message = ValidationError.DURATION_EMPTY)
    @Min(value = 0, message = ValidationError.DURATION_MIN_VALUE)
    private Integer duration;

    private List<@Size(max = 70, message = ValidationError.NON_STANDARD_HEARING_DURATION_REASONS_MAX_LENGTH_MSG) String>
            nonStandardHearingDurationReasons;

    @NotEmpty(message = ValidationError.HEARING_PRIORITY_TYPE)
    @Size(max = 60, message = ValidationError.HEARING_PRIORITY_TYPE_MAX_LENGTH)
    private String hearingPriorityType;

    @Min(value = 0, message = ValidationError.NUMBER_OF_PHYSICAL_ATTENDEES_MIN_VALUE)
    private Integer numberOfPhysicalAttendees;

    private Boolean hearingInWelshFlag;

    @Valid
    @NotNull(message = ValidationError.HEARING_LOCATION_EMPTY)
    @NotEmpty(message = ValidationError.INVALID_HEARING_LOCATION)
    private List<HearingLocation> hearingLocations;

    private List<@Size(max = 70, message = FACILITIES_REQUIRED_MAX_LENGTH_MSG) String> facilitiesRequired;

    @Size(max = 2000, message = ValidationError.LISTING_COMMENTS_MAX_LENGTH)
    private String listingComments;

    @Size(max = 60, message = ValidationError.HEARING_REQUESTER_MAX_LENGTH)
    private String hearingRequester;

    @Builder.Default()
    private Boolean privateHearingRequiredFlag = true;

    @Size(max = 70, message = ValidationError.LEAD_JUDGE_CONTRACT_TYPE_MAX_LENGTH)
    private String leadJudgeContractType;

    @Valid
    @NotNull(message = ValidationError.INVALID_PANEL_REQUIREMENTS)
    private PanelRequirements panelRequirements;

    private Boolean hearingIsLinkedFlag;

    private List<@Size(min = 1, max = 70, message = AMEND_REASON_CODE_MAX_LENGTH) String> amendReasonCodes;

    @Valid
    @NotNull(message = ValidationError.HEARING_CHANNEL_EMPTY)
    private List<@Size(max = 70, message = ValidationError.CHANNEL_TYPE_MAX_LENGTH)String> hearingChannels;
}