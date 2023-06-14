package uk.gov.hmcts.et.common.model.hmc;

public final class ValidationError {

    private ValidationError() {
    }

    private static final String CHARACTERS_LONG = "characters long";
    public static final String AUTO_LIST_FLAG_NULL_EMPTY = "Auto list flag can not be null or empty";
    public static final String HEARING_TYPE_NULL_EMPTY = "Hearing type can not be null or empty";
    public static final String HEARING_TYPE_MAX_LENGTH = "Hearing type must not be more than 40 " + CHARACTERS_LONG;
    public static final String DURATION_EMPTY = "Duration can not be empty";
    public static final String NON_STANDARD_HEARING_DURATION_REASONS_MAX_LENGTH_MSG = "Non standard hearing duration "
            + "reasons length cannot be greater than 70 " + CHARACTERS_LONG;
    public static final String HEARING_PRIORITY_TYPE = "Hearing priority type can not be empty";
    public static final String HEARING_PRIORITY_TYPE_MAX_LENGTH = "Hearing priority type must not be more than 60 "
            + CHARACTERS_LONG;
    public static final String DURATION_MIN_VALUE = "Duration should be greater than or equal to 0";
    public static final String NUMBER_OF_PHYSICAL_ATTENDEES_MIN_VALUE = "Number of physical attendees should be "
            + " greater than or equal to 0";
    public static final String HEARING_LOCATION_EMPTY = "Hearing locations can not be empty";
    public static final String LISTING_COMMENTS_MAX_LENGTH = "Listing comments must not be more than 2000 "
            + CHARACTERS_LONG;
    public static final String LISTING_REASON_CODE_MAX_LENGTH = "Listing comments must not be more than 70 "
            + CHARACTERS_LONG;
    public static final String HEARING_REQUESTER_MAX_LENGTH = "Hearing requester must not be more than 60 "
            + CHARACTERS_LONG;
    public static final String LEAD_JUDGE_CONTRACT_TYPE_MAX_LENGTH = "Lead judge contract type must not be more than "
            + "70 " + CHARACTERS_LONG;
    public static final String MEMBER_ID_EMPTY = "Member Id can not be empty";
    public static final String MEMBER_ID_MAX_LENGTH = "Member Id must not be more than 70 " + CHARACTERS_LONG;
    public static final String MEMBER_TYPE_MAX_LENGTH = "Member type must not be more than 70 " + CHARACTERS_LONG;
    public static final String LOCATION_ID_EMPTY = "Location id can not be empty";
    public static final String HMCTS_SERVICE_CODE_EMPTY_INVALID = "Hmcts service code is invalid";
    public static final String CASE_REF_EMPTY = "Case ref can not be empty";
    public static final String EXTERNAL_CASE_REFERENCE_MAX_LENGTH = "External case reference must not be more than 70 "
            + CHARACTERS_LONG;
    public static final String CASE_DEEP_LINK_EMPTY = "Case deep link can not be empty";
    public static final String CASE_DEEP_LINK_INVALID = "Case deep link is invalid";
    public static final String CASE_DEEP_LINK_MAX_LENGTH = "Case deep link can not be more than 1024 "
            + CHARACTERS_LONG;
    public static final String HMCTS_INTERNAL_CASE_NAME_EMPTY = "Hmcts internal case name can not be empty";
    public static final String HMCTS_INTERNAL_CASE_NAME_MAX_LENGTH = "Hmcts internal case name can not be more than  "
            + "1024 " + CHARACTERS_LONG;
    public static final String PUBLIC_CASE_NAME_EMPTY = "Public case name can not be empty";
    public static final String PUBLIC_CASE_NAME_MAX_LENGTH = "Public case name can not be more than 1024 "
            + CHARACTERS_LONG;
    public static final String CASE_MANAGEMENT_LOCATION_CODE_EMPTY = "Case management location can not be empty";
    public static final String CASE_MANAGEMENT_LOCATION_CODE_MAX_LENGTH = "Case management location can not be more "
            + "than 40 " + CHARACTERS_LONG;
    public static final String CASE_SLA_START_DATE_EMPTY = "Case sla start date can not be empty";
    public static final String INVALID_HEARING_DETAILS = "Hearing Details are required";
    public static final String INVALID_REQUEST_DETAILS = "Request details are required";
    public static final String INVALID_CASE_DETAILS = "Case details are required";
    public static final String PARTY_DETAILS_NULL_EMPTY = "Party id can not be empty";
    public static final String PARTY_DETAILS_MAX_LENGTH = "Party id must not be more than 40 " + CHARACTERS_LONG;
    public static final String PARTY_ROLE_MAX_LENGTH = "Party role must not be more than 40 " + CHARACTERS_LONG;
    public static final String NAME_NULL_EMPTY = "Name can not be empty";
    public static final String NAME_MAX_LENGTH = "Name must not be more than 2000 " + CHARACTERS_LONG;
    public static final String ORGANISATION_TYPE_NULL_EMPTY = "Organisation type can not be empty";
    public static final String ORGANISATION_TYPE_MAX_LENGTH = "Organisation type must not be more than 60 "
            + CHARACTERS_LONG;
    public static final String CFT_ORG_ID_MAX_LENGTH = "CFT organisation id must not be more than 60 "
            + CHARACTERS_LONG;
    public static final String UNAVAILABLE_FROM_DATE_EMPTY = "Unavailable from date can not be empty";
    public static final String UNAVAILABLE_TO_DATE_EMPTY = "Unavailable to date can not be empty";
    public static final String RELATED_PARTY_EMPTY = "Related Party can not be empty";
    public static final String RELATED_PARTY_MAX_LENGTH = "Related Party must not be more than 15 "
            + CHARACTERS_LONG;
    public static final String RELATIONSHIP_TYPE_EMPTY = "Relationship type can not be empty";
    public static final String RELATIONSHIP_TYPE_MAX_LENGTH = "Relationship type must not be more than 10 characters"
            + " long";
    public static final String TITLE_MAX_LENGTH = "Title must not be more than 40 " + CHARACTERS_LONG;
    public static final String FIRST_NAME_EMPTY = "First name can not be empty";
    public static final String FIRST_NAME_MAX_LENGTH = "First name must not be more than 100 " + CHARACTERS_LONG;
    public static final String LAST_NAME_EMPTY = "Last name can not be empty";
    public static final String LAST_NAME_MAX_LENGTH = "Last name must not be more than 730 " + CHARACTERS_LONG;
    public static final String HEARING_CHANNEL_EMPTY = "Hearing Channel must be present and not null or empty";
    public static final String CHANNEL_TYPE_MAX_LENGTH = "Channel Type must not be more than 70 " + CHARACTERS_LONG;
    public static final String PREFERRED_HEARING_CHANNEL_MAX_LENGTH = "Preferred hearing channel must not be more than "
            + "70 " + CHARACTERS_LONG;
    public static final String INTERPRETER_LANGUAGE_MAX_LENGTH = "Interpreter language must not be more than 10 "
            + CHARACTERS_LONG;
    public static final String REASONABLE_ADJUSTMENTS_MAX_LENGTH_MSG = "Reasonable adjustments must not be more than "
            + "10 " + CHARACTERS_LONG;
    public static final String VULNERABLE_DETAILS_MAX_LENGTH = "Vulnerable details must not be more than 2000 "
            + CHARACTERS_LONG;
    public static final String HEARING_CHANNEL_EMAIL_MAX_LENGTH = "Hearing channel email must not be more than 120 "
            + CHARACTERS_LONG;
    public static final String HEARING_CHANNEL_EMAIL_INVALID = "HearingChannelEmail must be valid email address";
    public static final String HEARING_CHANNEL_PHONE_MAX_LENGTH = "Hearing channel phone must not be more than 30 "
            + CHARACTERS_LONG;
    public static final String HEARING_CHANNEL_PHONE_INVALID = "HearingChannel phone is invalid";
    public static final String ROLE_TYPE_MAX_LENGTH_MSG = "Role type length cannot be greater than 70 "
            + CHARACTERS_LONG;
    public static final String AUTHORISATION_SUB_TYPE_MAX_LENGTH_MSG = "Authorisation sub type length cannot be "
            + "greater than 70 " + CHARACTERS_LONG;

    public static final String AUTHORISATION_TYPES_MAX_LENGTH_MSG = "Authorisation sub type length cannot be "
            + "greater than 70 " + CHARACTERS_LONG;
    public static final String PANEL_SPECIALISMS_MAX_LENGTH_MSG = "Panel Specialisms length cannot be greater than 70 "
            + CHARACTERS_LONG;
    public static final String FACILITIES_REQUIRED_MAX_LENGTH_MSG = "Facilities required length cannot be greater "
            + "than 70 " + CHARACTERS_LONG;
    public static final String INVALID_PANEL_REQUIREMENTS = "Panel requirements are required";
    public static final String CATEGORY_VALUE = "category Value cannot be greater than 70 " + CHARACTERS_LONG;
    public static final String INVALID_HEARING_LOCATION = "Hearing locations are required";
    public static final String INVALID_CASE_CATEGORIES = "Case categories are required";
    public static final String CASE_CATEGORY_EMPTY = "Case category can not be empty";
    public static final String CASE_RESTRICTED_FLAG_NULL_EMPTY = "Case restricted flag can not be empty";
    public static final String VERSION_NUMBER_NULL_EMPTY = "Version number must be present";
    public static final String CATEGORY_TYPE_EMPTY = "Category type must be present";
    public static final String CATEGORY_VALUE_EMPTY = "Category value must be present";
    public static final String PARTY_TYPE_EMPTY = "Party type must be present";
    public static final String PARTY_ROLE_EMPTY = "Party role must be present";
    public static final String PARTY_NAME_NULL_EMPTY = "Party name must be present";
    public static final String OTHER_REASON_LENGTH = "Other reasonable adjustment details cannot be greater than 200 "
            + CHARACTERS_LONG;
    public static final String CUSTODY_STATUS_LENGTH = "Custody status cannot be greater than 80 " + CHARACTERS_LONG;
    public static final String AMEND_REASON_CODE_MAX_LENGTH = "Amend reason code must be at least 1 but no more than "
            + "70 " + CHARACTERS_LONG;
    public static final String INVALID_CASE_REFERENCE = "Invalid case reference";
}
