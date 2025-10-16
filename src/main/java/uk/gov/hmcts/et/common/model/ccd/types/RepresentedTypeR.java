package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.bulk.types.DynamicFixedListType;
import uk.gov.hmcts.et.common.model.ccd.Address;
import uk.gov.hmcts.et.common.model.ccd.items.GenericTypeItem;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RepresentedTypeR {
    @JsonProperty("id")
    private String id;
    @JsonProperty("respondentId")
    private String respondentId;
    @JsonProperty("dynamic_resp_rep_name")
    private DynamicFixedListType dynamicRespRepName;
    @JsonProperty("resp_rep_name") // Respondent who is being represented
    private String respRepName;
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
    @JsonProperty("representative_preference_reason")
    private String representativePreferenceReason;
    @JsonProperty("respondentOrganisation")
    private Organisation respondentOrganisation;
    @JsonProperty("myHmctsYesNo")
    private String myHmctsYesNo;
    /** UUID for identifying the non system user legal rep's organisation for HMC. */
    @JsonProperty("nonMyHmctsOrganisationId")
    private String nonMyHmctsOrganisationId;
    @JsonProperty("representativeContactLanguage")
    private String representativeContactLanguage;
    @JsonProperty("organisationUsers")
    private List<GenericTypeItem<OrganisationUsersIdamUser>> organisationUsers;
}
