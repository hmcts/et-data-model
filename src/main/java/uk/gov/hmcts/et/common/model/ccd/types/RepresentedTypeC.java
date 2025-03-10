package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.ccd.Address;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RepresentedTypeC {
    @JsonProperty("representative_id")
    private String representativeId;
    @JsonProperty("name_of_representative")
    private String nameOfRepresentative;
    @JsonProperty("name_of_organisation")
    private String nameOfOrganisation;
    @JsonProperty("representative_reference")
    private String representativeReference;
    @JsonProperty("representative_occupation")
    private String representativeOccupation;
    @JsonProperty("representative_occupation_other")
    private String representativeOccupationOther;
    @JsonProperty("representative_address")
    private Address representativeAddress;
    @JsonProperty("representative_phone_number")
    private String representativePhoneNumber;
    @JsonProperty("representative_mobile_number")
    private String representativeMobileNumber;
    @JsonProperty("representative_email_address")
    private String representativeEmailAddress;
    @JsonProperty("representative_preference")
    private String representativePreference;
    @JsonProperty("representative_contact_preference_post_reason")
    private String representativeContactPreferencePostReason;
    /** UUID for identifying legal rep's firm. */
    @JsonProperty("organisationId")
    private String organisationId;
    @JsonProperty("myHmctsOrganisation")
    private Organisation myHmctsOrganisation;
    @JsonProperty("hearingContactLanguage")
    private List<String> hearingContactLanguage;
    @JsonProperty("contactLanguageQuestion")
    private List<String> contactLanguageQuestion;
    @JsonProperty("representativeAttendHearing")
    private List<String> representativeAttendHearing;
    @JsonProperty("representative_dx_address")
    private String representativeDXAddress;
}
