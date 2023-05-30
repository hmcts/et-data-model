package uk.gov.hmcts.et.common.model.hmc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import static uk.gov.hmcts.et.common.model.hmc.ValidationError.REASONABLE_ADJUSTMENTS_MAX_LENGTH_MSG;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IndividualDetails {
    @Size(max = 40, message = ValidationError.TITLE_MAX_LENGTH)
    private String title;

    @NotNull(message = ValidationError.FIRST_NAME_EMPTY)
    @Size(max = 100, message = ValidationError.FIRST_NAME_MAX_LENGTH)
    private String firstName;

    @NotNull(message = ValidationError.LAST_NAME_EMPTY)
    @Size(max = 730, message = ValidationError.LAST_NAME_MAX_LENGTH)
    private String lastName;

    @Size(max = 70, message = ValidationError.PREFERRED_HEARING_CHANNEL_MAX_LENGTH)
    private String preferredHearingChannel;

    @Size(max = 10, message = ValidationError.INTERPRETER_LANGUAGE_MAX_LENGTH)
    private String interpreterLanguage;

    private List<@Size(max = 10, message = REASONABLE_ADJUSTMENTS_MAX_LENGTH_MSG) String> reasonableAdjustments;

    @Size(max = 200, message = ValidationError.CUSTODY_STATUS_LENGTH)
    private String otherReasonableAdjustmentDetails;

    @Size(max = 80, message = ValidationError.OTHER_REASON_LENGTH)
    private String custodyStatus;

    private Boolean vulnerableFlag;

    @Size(max = 2000, message = ValidationError.VULNERABLE_DETAILS_MAX_LENGTH)
    private String vulnerabilityDetails;

    private List<
            @Email(message = ValidationError.HEARING_CHANNEL_EMAIL_INVALID)
            @Size(max = 120, message = ValidationError.HEARING_CHANNEL_EMAIL_MAX_LENGTH)
                    String> hearingChannelEmail;

    private List<
            @Pattern(regexp = "^\\+?(?:[0-9] ?){6,14}[0-9]$",
                    message = ValidationError.HEARING_CHANNEL_PHONE_INVALID)
            @Size(max = 30, message = ValidationError.HEARING_CHANNEL_PHONE_MAX_LENGTH)
                    String> hearingChannelPhone;

    @Valid
    private List<RelatedParty> relatedParties;
}
