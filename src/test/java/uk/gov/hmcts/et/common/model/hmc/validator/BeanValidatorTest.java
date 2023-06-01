package uk.gov.hmcts.et.common.model.hmc.validator;

import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.gov.hmcts.et.common.model.hmc.Attendee;
import uk.gov.hmcts.et.common.model.hmc.CaseCategory;
import uk.gov.hmcts.et.common.model.hmc.CaseCategoryType;
import uk.gov.hmcts.et.common.model.hmc.CaseDetails;
import uk.gov.hmcts.et.common.model.hmc.CaseHearing;
import uk.gov.hmcts.et.common.model.hmc.DayOfWeekUnavailable;
import uk.gov.hmcts.et.common.model.hmc.DayOfWeekUnavailableType;
import uk.gov.hmcts.et.common.model.hmc.HearingDaySchedule;
import uk.gov.hmcts.et.common.model.hmc.HearingDetails;
import uk.gov.hmcts.et.common.model.hmc.HearingLocation;
import uk.gov.hmcts.et.common.model.hmc.HearingResponse;
import uk.gov.hmcts.et.common.model.hmc.HearingWindow;
import uk.gov.hmcts.et.common.model.hmc.ListAssistCaseStatus;
import uk.gov.hmcts.et.common.model.hmc.ListingReasonCode;
import uk.gov.hmcts.et.common.model.hmc.ListingStatus;
import uk.gov.hmcts.et.common.model.hmc.LocationType;
import uk.gov.hmcts.et.common.model.hmc.OrganisationDetails;
import uk.gov.hmcts.et.common.model.hmc.PanelPreference;
import uk.gov.hmcts.et.common.model.hmc.PanelRequirements;
import uk.gov.hmcts.et.common.model.hmc.PartyDetails;
import uk.gov.hmcts.et.common.model.hmc.PartyType;
import uk.gov.hmcts.et.common.model.hmc.RelatedParty;
import uk.gov.hmcts.et.common.model.hmc.RequestDetailsGet;
import uk.gov.hmcts.et.common.model.hmc.RequestDetailsPost;
import uk.gov.hmcts.et.common.model.hmc.RequirementType;
import uk.gov.hmcts.et.common.model.hmc.UnavailabilityDow;
import uk.gov.hmcts.et.common.model.hmc.UnavailabilityRanges;
import uk.gov.hmcts.et.common.model.hmc.ValidationError;
import uk.gov.hmcts.et.common.model.hmc.hearing.PostHearingPayload;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static uk.gov.hmcts.et.common.model.hmc.ValidationError.CATEGORY_TYPE_EMPTY;
import static uk.gov.hmcts.et.common.model.hmc.ValidationError.CATEGORY_VALUE_EMPTY;
import static uk.gov.hmcts.et.common.model.hmc.ValidationError.HEARING_LOCATION_EMPTY;
import static uk.gov.hmcts.et.common.model.hmc.ValidationError.PARTY_DETAILS_NULL_EMPTY;
import static uk.gov.hmcts.et.common.model.hmc.ValidationError.PARTY_ROLE_EMPTY;
import static uk.gov.hmcts.et.common.model.hmc.ValidationError.PARTY_ROLE_MAX_LENGTH;
import static uk.gov.hmcts.et.common.model.hmc.ValidationError.PARTY_TYPE_EMPTY;

class BeanValidatorTest {

    private static ValidatorFactory validatorFactory;
    private static Validator validator;

    @BeforeEach
    void createValidator() {
        validator = Validation.byDefaultProvider()
            .configure()
            .messageInterpolator(new ParameterMessageInterpolator())
            .buildValidatorFactory()
            .getValidator();
    }

    @Test
    void shouldHaveHearingDetailsViolations() {
        HearingDetails hearingDetails = new HearingDetails();
        hearingDetails.setAutoListFlag(null);
        hearingDetails.setHearingType(
                "HearingType more than 40HearingType more than 40HearingType more than 40HearingType more than 40");
        hearingDetails.setDuration(-1);
        hearingDetails.setHearingPriorityType("");
        hearingDetails.setNumberOfPhysicalAttendees(-1);
        hearingDetails.setLeadJudgeContractType("Lead judge contractLead judge contractLead judge contractLead judge "
                + "contractLead judge contractLead judge contract");
        Set<ConstraintViolation<HearingDetails>> violations = validator.validate(hearingDetails);
        hearingDetails.setPanelRequirements(panelRequirements());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(10, violations.size());
        assertTrue(validationErrors.contains(ValidationError.AUTO_LIST_FLAG_NULL_EMPTY));
        assertTrue(validationErrors.contains(ValidationError.HEARING_TYPE_MAX_LENGTH));
        assertTrue(validationErrors.contains(ValidationError.DURATION_MIN_VALUE));
        assertTrue(validationErrors.contains(ValidationError.HEARING_PRIORITY_TYPE));
        assertTrue(validationErrors.contains(ValidationError.NUMBER_OF_PHYSICAL_ATTENDEES_MIN_VALUE));
        assertTrue(validationErrors.contains(ValidationError.LEAD_JUDGE_CONTRACT_TYPE_MAX_LENGTH));
        assertTrue(validationErrors.contains(HEARING_LOCATION_EMPTY));
        assertTrue(validationErrors.contains(ValidationError.HEARING_CHANNEL_EMPTY));
    }

    @Test
    void shouldHaveHearingDetails_NonStandardHearingDurationReasonsViolations() {
        HearingDetails hearingDetails = hearingDetails();
        hearingDetails.setPanelRequirements(panelRequirements());
        String reason = "NonStandardHearingDurationReasonsnonStandardHearingDurationReasonsnonStandardHearingDura ";
        hearingDetails.setNonStandardHearingDurationReasons(Arrays.asList(reason));
        Set<ConstraintViolation<HearingDetails>> violations = validator.validate(hearingDetails);
        hearingDetails.setPanelRequirements(panelRequirements());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.NON_STANDARD_HEARING_DURATION_REASONS_MAX_LENGTH_MSG));
    }

    @Test
    void shouldHaveHearingDetails_HearingLocationRequiredViolations() {
        HearingDetails hearingDetails = hearingDetails();
        hearingDetails.setPanelRequirements(panelRequirements());
        hearingDetails.setHearingLocations(null);
        Set<ConstraintViolation<HearingDetails>> violations = validator.validate(hearingDetails);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(2, violations.size());
        assertTrue(validationErrors.contains(HEARING_LOCATION_EMPTY));
    }

    @Test
    void shouldHaveHearingDetails_HearingLocationRequiredViolations1() {
        HearingDetails hearingDetails = hearingDetails();
        hearingDetails.setPanelRequirements(panelRequirements());
        List<HearingLocation> locations = new ArrayList<>();
        HearingLocation location1 = new HearingLocation();
        location1.setLocationId(null);
        location1.setLocationType(null);
        locations.add(location1);
        hearingDetails.setHearingLocations(locations);
        Set<ConstraintViolation<HearingDetails>> violations = validator.validate(hearingDetails);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(2, violations.size());
        assertTrue(validationErrors.contains(ValidationError.LOCATION_ID_EMPTY));
        assertTrue(validationErrors.contains("Unsupported type for locationType"));
    }

    @Test
    void shouldHaveHearingDetails_HearingLocationDetailsViolations() {
        HearingDetails hearingDetails = hearingDetails();
        hearingDetails.setPanelRequirements(panelRequirements());
        HearingLocation hearingLocation = new HearingLocation();
        hearingLocation.setLocationType("cluster");
        hearingLocation.setLocationId("");
        List<HearingLocation> hearingLocations = new ArrayList<>();
        hearingLocations.add(hearingLocation);
        hearingDetails.setHearingLocations(hearingLocations);
        Set<ConstraintViolation<HearingDetails>> violations = validator.validate(hearingDetails);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.LOCATION_ID_EMPTY));
    }

    @Test
    void shouldHave_NoHearingDetailsViolation() {
        HearingDetails hearingDetails = hearingDetails();
        hearingDetails.setPanelRequirements(panelRequirements());
        Set<ConstraintViolation<HearingDetails>> violations = validator.validate(hearingDetails);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertTrue(violations.isEmpty());
    }

    @Test
    void shouldHave_NoCaseDetailsViolations() {
        CaseDetails caseDetails = caseDetails();
        Set<ConstraintViolation<CaseDetails>> violations = validator.validate(caseDetails);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertTrue(violations.isEmpty());
    }

    @Test
    void shouldHave_CaseDetailsViolations() {
        CaseDetails caseDetails = new CaseDetails();
        caseDetails.setHmctsServiceCode("");
        caseDetails.setCaseRef("");
        caseDetails.setExternalCaseReference("externalCaseReferenceexternalCaseReferenceexternalCaseReferenceexternal"
                + "CaseReference");
        caseDetails.setCaseDeepLink("abc");
        caseDetails.setHmctsInternalCaseName("");
        caseDetails.setPublicCaseName("");
        caseDetails.setCaseCategories(new ArrayList<>());
        caseDetails.setCaseManagementLocationCode("");
        caseDetails.setCaseRestrictedFlag(null);
        caseDetails.setCaseSlaStartDate(null);
        Set<ConstraintViolation<CaseDetails>> violations = validator.validate(caseDetails);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(12, violations.size());
        assertTrue(validationErrors.contains(ValidationError.HMCTS_SERVICE_CODE_EMPTY_INVALID));
        assertTrue(validationErrors.contains(ValidationError.CASE_REF_EMPTY));
        assertTrue(validationErrors.contains(ValidationError.EXTERNAL_CASE_REFERENCE_MAX_LENGTH));
        assertTrue(validationErrors.contains(ValidationError.CASE_DEEP_LINK_INVALID));
        assertTrue(validationErrors.contains(ValidationError.HMCTS_INTERNAL_CASE_NAME_EMPTY));
        assertTrue(validationErrors.contains(ValidationError.PUBLIC_CASE_NAME_EMPTY));
        assertTrue(validationErrors.contains(ValidationError.CASE_MANAGEMENT_LOCATION_CODE_EMPTY));
        assertTrue(validationErrors.contains(ValidationError.CASE_RESTRICTED_FLAG_NULL_EMPTY));

    }

    @Test
    void shouldHave_CaseCategoryViolations() {
        CaseCategory category = new CaseCategory();
        category.setCategoryType("caseType");
        category.setCategoryValue("externalCaseReferenceexternalCaseReferenceexternalCaseReferenceexternal"
                + "CaseReference");
        List<CaseCategory> caseCategories = new ArrayList<>();
        caseCategories.add(category);
        CaseDetails caseDetails = caseDetails();
        caseDetails.setCaseCategories(caseCategories);
        Set<ConstraintViolation<CaseDetails>> violations = validator.validate(caseDetails);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.CATEGORY_VALUE));
    }

    @Test
    void shouldFailAsRequestDetailsVersionNumberNotPresent() {
        RequestDetailsPost requestDetails = new RequestDetailsPost();
        Set<ConstraintViolation<RequestDetailsPost>> violations = validator.validate(requestDetails);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.VERSION_NUMBER_NULL_EMPTY));
    }

    @Test
    void shouldFailAsHearingDetailsNotPresent() {
        PostHearingPayload hearingRequest = new PostHearingPayload();
        hearingRequest.setCaseDetails(caseDetails());
        hearingRequest.setRequestDetails(new RequestDetailsPost());
        Set<ConstraintViolation<PostHearingPayload>> violations = validator.validate(hearingRequest);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.INVALID_HEARING_DETAILS));
    }

    @Test
    void shouldFailAsCaseDetailsCaseCategoriesNotPresent() {
        PostHearingPayload hearingRequest = new PostHearingPayload();
        hearingRequest.setHearingDetails(hearingDetails());
        hearingRequest.getHearingDetails().setPanelRequirements(panelRequirements());
        hearingRequest.setCaseDetails(caseDetails());
        hearingRequest.getCaseDetails().setCaseCategories(new ArrayList<>());
        hearingRequest.setRequestDetails(new RequestDetailsPost());
        Set<ConstraintViolation<PostHearingPayload>> violations = validator.validate(hearingRequest);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.INVALID_CASE_CATEGORIES));
    }

    @Test
    void shouldFailAsPanelRequirementsNotPresent() {
        PostHearingPayload hearingRequest = new PostHearingPayload();
        hearingRequest.setHearingDetails(hearingDetails());
        hearingRequest.setCaseDetails(caseDetails());
        hearingRequest.setRequestDetails(new RequestDetailsPost());
        Set<ConstraintViolation<PostHearingPayload>> violations = validator.validate(hearingRequest);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.INVALID_PANEL_REQUIREMENTS));
    }

    @Test
    void shouldFailAsCaseDetailsNotPresent() {
        PostHearingPayload hearingRequest = new PostHearingPayload();
        hearingRequest.setHearingDetails(hearingDetails());
        hearingRequest.getHearingDetails().setPanelRequirements(panelRequirements());
        hearingRequest.setRequestDetails(new RequestDetailsPost());
        Set<ConstraintViolation<PostHearingPayload>> violations = validator.validate(hearingRequest);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.INVALID_CASE_DETAILS));

    }

    @Test
    void shouldFailAsHearingLocationsNotPresent() {
        PostHearingPayload hearingRequest = new PostHearingPayload();
        hearingRequest.setHearingDetails(hearingDetails());
        hearingRequest.setCaseDetails(caseDetails());
        hearingRequest.getHearingDetails().setHearingLocations(new ArrayList<>());
        hearingRequest.getHearingDetails().setPanelRequirements(panelRequirements());
        hearingRequest.setRequestDetails(new RequestDetailsPost());
        Set<ConstraintViolation<PostHearingPayload>> violations = validator.validate(hearingRequest);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.INVALID_HEARING_LOCATION));

    }

    @Test
    void whenInvalidCaseCategoryTypeIsNull() {
        CaseCategory category = new CaseCategory();
        category.setCategoryValue("XXX");
        category.setCategoryType(null);
        Set<ConstraintViolation<CaseCategory>> violations = validator.validate(category);
        assertFalse(violations.isEmpty());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> {
            validationErrors.add(e.getMessage());
        });
        assertEquals(2, violations.size());
        assertTrue(validationErrors.contains("Unsupported type for categoryType"));
        assertTrue(validationErrors.contains(CATEGORY_TYPE_EMPTY));
    }

    @Test
    void whenInvalidCaseCategoryTypeIsEmpty() {
        CaseCategory category = new CaseCategory();
        category.setCategoryValue("XXXX");
        category.setCategoryType("");
        Set<ConstraintViolation<CaseCategory>> violations = validator.validate(category);
        assertFalse(violations.isEmpty());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> {
            validationErrors.add(e.getMessage());
        });
        assertEquals(2, violations.size());
        assertTrue(validationErrors.contains("Unsupported type for categoryType"));
        assertTrue(validationErrors.contains(CATEGORY_TYPE_EMPTY));
    }

    @Test
    void whenInvalidCaseCategoryValueIsNull() {
        CaseCategory category = new CaseCategory();
        category.setCategoryValue(null);
        category.setCategoryType(CaseCategoryType.CASETYPE.toString());
        Set<ConstraintViolation<CaseCategory>> violations = validator.validate(category);
        assertFalse(violations.isEmpty());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> {
            validationErrors.add(e.getMessage());
        });
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(CATEGORY_VALUE_EMPTY));
    }

    @Test
    void whenInvalidCaseCategoryValueIsEmpty() {
        CaseCategory category = new CaseCategory();
        category.setCategoryValue("");
        category.setCategoryType(CaseCategoryType.CASETYPE.toString());
        Set<ConstraintViolation<CaseCategory>> violations = validator.validate(category);
        assertFalse(violations.isEmpty());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> {
            validationErrors.add(e.getMessage());
        });
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(CATEGORY_VALUE_EMPTY));
    }

    @Test
    void whenInvalidPartyIdIsNull() {
        PartyDetails partyDetails = new PartyDetails();
        partyDetails.setPartyID(null);
        partyDetails.setPartyType(PartyType.IND.toString());
        partyDetails.setPartyRole("role1");
        Set<ConstraintViolation<PartyDetails>> violations = validator.validate(partyDetails);
        assertFalse(violations.isEmpty());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> {
            validationErrors.add(e.getMessage());
        });
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(PARTY_DETAILS_NULL_EMPTY));
    }

    @Test
    void whenInvalidPartyIdIsEmpty() {
        PartyDetails partyDetails = new PartyDetails();
        partyDetails.setPartyID("");
        partyDetails.setPartyType(PartyType.IND.toString());
        partyDetails.setPartyRole("role1");
        Set<ConstraintViolation<PartyDetails>> violations = validator.validate(partyDetails);
        assertFalse(violations.isEmpty());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> {
            validationErrors.add(e.getMessage());
        });
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(PARTY_DETAILS_NULL_EMPTY));
    }

    @Test
    void whenInvalidPartyTypeIsNull() {
        PartyDetails partyDetails = new PartyDetails();
        partyDetails.setPartyID("XXX1");
        partyDetails.setPartyType(null);
        partyDetails.setPartyRole("role1");
        Set<ConstraintViolation<PartyDetails>> violations = validator.validate(partyDetails);
        assertFalse(violations.isEmpty());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> {
            validationErrors.add(e.getMessage());
        });
        assertEquals(2, violations.size());
        assertTrue(validationErrors.contains("Unsupported type for partyType"));
        assertTrue(validationErrors.contains(PARTY_TYPE_EMPTY));
    }

    @Test
    void whenInvalidPartyTypeIsEmpty() {
        PartyDetails partyDetails = new PartyDetails();
        partyDetails.setPartyID("XXX1");
        partyDetails.setPartyType("");
        partyDetails.setPartyRole("role1");
        Set<ConstraintViolation<PartyDetails>> violations = validator.validate(partyDetails);
        assertFalse(violations.isEmpty());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> {
            validationErrors.add(e.getMessage());
        });
        assertEquals(2, violations.size());
        assertTrue(validationErrors.contains("Unsupported type for partyType"));
        assertTrue(validationErrors.contains(PARTY_TYPE_EMPTY));
    }

    @Test
    void whenInvalidPartyRoleIsNull() {
        PartyDetails partyDetails = new PartyDetails();
        partyDetails.setPartyID("XXX1");
        partyDetails.setPartyType(PartyType.IND.toString());
        partyDetails.setPartyRole(null);
        Set<ConstraintViolation<PartyDetails>> violations = validator.validate(partyDetails);
        assertFalse(violations.isEmpty());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> {
            validationErrors.add(e.getMessage());
        });
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(PARTY_ROLE_EMPTY));
    }

    @Test
    void whenInvalidPartyRoleIsEmpty() {
        PartyDetails partyDetails = new PartyDetails();
        partyDetails.setPartyID("XXX1");
        partyDetails.setPartyType(PartyType.IND.toString());
        partyDetails.setPartyRole("");
        Set<ConstraintViolation<PartyDetails>> violations = validator.validate(partyDetails);
        assertFalse(violations.isEmpty());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> {
            validationErrors.add(e.getMessage());
        });
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(PARTY_ROLE_EMPTY));
    }

    @Test
    void whenValidPartyRoleIs6Characters() {
        PartyDetails partyDetails = new PartyDetails();
        partyDetails.setPartyID("XXX1");
        partyDetails.setPartyType(PartyType.IND.toString());
        partyDetails.setPartyRole("abcdef");
        Set<ConstraintViolation<PartyDetails>> violations = validator.validate(partyDetails);
        assertTrue(violations.isEmpty());
    }

    @Test
    void whenInvalidPartyRoleIs7Characters() {
        PartyDetails partyDetails = new PartyDetails();
        partyDetails.setPartyID("XXX1");
        partyDetails.setPartyType(PartyType.IND.toString());
        partyDetails.setPartyRole("abcdefg");
        Set<ConstraintViolation<PartyDetails>> violations = validator.validate(partyDetails);
        assertEquals(1, violations.size());
        assertTrue(violations.stream()
                .map(ConstraintViolation::getMessage)
                .anyMatch(msg -> msg.equals(PARTY_ROLE_MAX_LENGTH)));
    }

    @Test
    void shouldHave_NoHearingDetailsViolationAsHearingWindowOptional() {
        HearingDetails hearingDetails = hearingDetails();
        hearingDetails.setHearingWindow(null);
        hearingDetails.setPanelRequirements(panelRequirements());
        Set<ConstraintViolation<HearingDetails>> violations = validator.validate(hearingDetails);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertTrue(violations.isEmpty());
    }

    @Test
    void shouldHave_NoHearingDetailsViolationAsListingAutoChangeReasonCodeOptional() {
        HearingDetails hearingDetails = hearingDetails();
        hearingDetails.setListingAutoChangeReasonCode(null);
        hearingDetails.setPanelRequirements(panelRequirements());
        Set<ConstraintViolation<HearingDetails>> violations = validator.validate(hearingDetails);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertTrue(violations.isEmpty());
    }

    @Test
    void attendee_partyIdShouldFailValidationOver40Characters() {
        Attendee attendee = attendee();
        attendee.setPartyId(String.format("%041d", 0));
        Set<ConstraintViolation<Attendee>> violations = validator.validate(attendee);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 1);
        assertEquals(validationErrors.get(0), "size must be between 0 and 40");
    }

    @Test
    void attendee_partyIdShouldFailValidationWhenEmpty() {
        Attendee attendee = attendee();
        attendee.setPartyId(null);
        Set<ConstraintViolation<Attendee>> violations = validator.validate(attendee);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 1);
        assertEquals(validationErrors.get(0), "must not be null");
    }

    @Test
    void attendee_hearingSubChannelShouldFailValidationOver60Characters() {
        Attendee attendee = attendee();
        attendee.setHearingSubChannel(String.format("%061d", 0));
        Set<ConstraintViolation<Attendee>> violations = validator.validate(attendee);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(1, validationErrors.size());
        assertEquals("size must be between 0 and 60", validationErrors.get(0));
    }

    @Test
    void attendee_hearingSubChannelShouldFailValidationWhenEmpty() {
        Attendee attendee = attendee();
        attendee.setHearingSubChannel(null);
        Set<ConstraintViolation<Attendee>> violations = validator.validate(attendee);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(1, validationErrors.size());
        assertEquals("must not be null", validationErrors.get(0));
    }

    @Test
    void attendee_valid() {
        Attendee value = Attendee.builder().partyId("12345").hearingSubChannel("1234").build();
        Set<ConstraintViolation<Attendee>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void hearingResponse_valid() {
        HearingResponse response = HearingResponse.builder().build();
        response.setLaCaseStatus(ListAssistCaseStatus.CASE_CLOSED.toString());
        response.setListingStatus(ListingStatus.DRAFT.toString());
        Set<ConstraintViolation<HearingResponse>> violations = validator.validate(response);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void caseHearing_valid() {
        CaseHearing value = CaseHearing.builder()
                .hearingId("1")
                .hearingType("type")
                .hearingIsLinkedFlag(false)
                .hearingListingStatus("status")
                .hearingGroupRequestId("1")
                .hearingRequestDateTime(LocalDateTime.now())
                .lastResponseReceivedDateTime(LocalDateTime.now())
                .listAssistCaseStatus("status")
                .responseVersion(1)
                .hmcStatus("status")
                .hearingDaySchedule(Collections.emptyList())
                .build();

        Set<ConstraintViolation<CaseHearing>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void hearingDaySchedule_valid() {
        HearingDaySchedule value = HearingDaySchedule.builder()
                .attendees(Collections.emptyList())
                .hearingJudgeId("1")
                .hearingRoomId("1")
                .hearingVenueId("1")
                .hearingEndDateTime(LocalDateTime.now())
                .hearingStartDateTime(LocalDateTime.now())
                .listAssistSessionId("1")
                .panelMemberIds(Collections.emptyList())
                .build();

        Set<ConstraintViolation<HearingDaySchedule>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void hearingLocation_valid() {
        HearingLocation value = HearingLocation.builder()
                .locationId("123")
                .locationType(LocationType.CLUSTER.toString())
                .build();

        Set<ConstraintViolation<HearingLocation>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void hearingWindow_valid() {
        HearingWindow value = HearingWindow.builder()
                .dateRangeEnd(LocalDate.now())
                .dateRangeStart(LocalDate.now())
                .firstDateTimeMustBe(LocalDateTime.now())
                .build();

        Set<ConstraintViolation<HearingWindow>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void organisationDetails_valid() {
        OrganisationDetails value = OrganisationDetails.builder()
                .cftOrganisationID("123")
                .organisationType("type")
                .name("name")
                .build();

        Set<ConstraintViolation<OrganisationDetails>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void panelPreference_valid() {
        PanelPreference value = PanelPreference.builder()
                .memberID("1234")
                .memberType("type")
                .requirementType(RequirementType.EXCLUDE.toString())
                .build();

        Set<ConstraintViolation<PanelPreference>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void panelRequirements_valid() {
        PanelRequirements value = PanelRequirements.builder()
                .roleType(List.of("type"))
                .authorisationSubType(List.of("subType"))
                .panelPreferences(Collections.emptyList())
                .panelSpecialisms(List.of("nothing"))
                .build();

        Set<ConstraintViolation<PanelRequirements>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void partyDetails_valid() {
        PartyDetails value = PartyDetails.builder()
                .partyID("123")
                .partyType(PartyType.IND.toString())
                .partyRole("role")
                .unavailabilityDow(Collections.emptyList())
                .unavailabilityRanges(Collections.emptyList())
                .build();

        Set<ConstraintViolation<PartyDetails>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void relatedParty_valid() {
        RelatedParty value = RelatedParty.builder()
                .relatedPartyID("123")
                .relationshipType("max10")
                .build();

        Set<ConstraintViolation<RelatedParty>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void requestDetailsGet_valid() {
        RequestDetailsGet value = RequestDetailsGet.builder()
                .hearingRequestId("1234")
                .versionNumber(1)
                .status("status")
                .timeStamp(LocalDateTime.now())
                .hearingGroupRequestId("123")
                .partiesNotifiedDateTime(LocalDateTime.now())
                .build();

        Set<ConstraintViolation<RequestDetailsGet>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void requestDetailsPost_valid() {
        RequestDetailsPost value = RequestDetailsPost.builder()
                .versionNumber(1)
                .build();

        Set<ConstraintViolation<RequestDetailsPost>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void unavailabilityDow_valid() {
        UnavailabilityDow value = UnavailabilityDow.builder()
                .dow(DayOfWeekUnavailable.FRIDAY.toString())
                .dowUnavailabilityType(DayOfWeekUnavailableType.ALL.toString())
                .build();

        Set<ConstraintViolation<UnavailabilityDow>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    @Test
    void unavailabilityRanges_valid() {
        UnavailabilityRanges value = UnavailabilityRanges.builder()
                .unavailableFromDate(LocalDate.now())
                .unavailableToDate(LocalDate.now())
                .unavailabilityType(DayOfWeekUnavailableType.AM.toString())
                .build();

        Set<ConstraintViolation<UnavailabilityRanges>> violations = validator.validate(value);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals(validationErrors.size(), 0);
    }

    public Attendee attendee() {
        return Attendee.builder()
                .partyId("123456")
                .hearingSubChannel("subchannel")
                .build();
    }

    public HearingDetails hearingDetails() {
        HearingDetails hearingDetails = new HearingDetails();
        hearingDetails.setAutoListFlag(false);
        hearingDetails.setListingAutoChangeReasonCode(ListingReasonCode.NO_MAPPING_AVAILABLE.toString());
        hearingDetails.setHearingType("Some hearing type");
        HearingWindow hearingWindow = new HearingWindow();
        hearingWindow.setDateRangeEnd(LocalDate.parse("2017-03-01"));
        hearingWindow.setDateRangeStart(LocalDate.parse("2017-03-01"));
        hearingDetails.setHearingWindow(hearingWindow);
        hearingDetails.setDuration(360);
        hearingDetails.setNonStandardHearingDurationReasons(List.of("First reason", "Second reason"));
        hearingDetails.setHearingPriorityType("Priority type");
        hearingDetails.setHearingIsLinkedFlag(Boolean.TRUE);
        hearingDetails.setHearingChannels(getHearingChannelsList());
        HearingLocation location1 = new HearingLocation();
        location1.setLocationType(LocationType.CLUSTER.toString());
        location1.setLocationId("Location Id");
        List<HearingLocation> hearingLocations = new ArrayList<>();
        hearingLocations.add(location1);
        hearingDetails.setHearingLocations(hearingLocations);
        hearingDetails.setFacilitiesRequired(List.of("facility1", "facility2"));
        return hearingDetails;
    }

    public static List<String> getHearingChannelsList() {
        return List.of("someChannelType", "someOtherChannelType");
    }

    public PanelRequirements panelRequirements() {
        PanelRequirements panelRequirements = new PanelRequirements();
        panelRequirements.setRoleType(List.of("RoleType1"));
        panelRequirements.setAuthorisationSubType(List.of("AuthorisationSubType2"));
        return panelRequirements;
    }

    public CaseDetails caseDetails() {
        CaseDetails caseDetails = new CaseDetails();
        caseDetails.setHmctsServiceCode("ABA1");
        caseDetails.setCaseRef("1111222233334444");
        caseDetails.setCaseDeepLink("https://www.google.com");
        caseDetails.setHmctsInternalCaseName("Internal case name");
        caseDetails.setPublicCaseName("Public case name");
        caseDetails.setCaseManagementLocationCode("CMLC123");
        caseDetails.setCaseRestrictedFlag(false);
        caseDetails.setCaseSlaStartDate(LocalDate.parse("2017-03-01"));
        CaseCategory category = new CaseCategory();
        category.setCategoryType("CASETYPE");
        category.setCategoryValue("PROBATE");
        List<CaseCategory> caseCategories = new ArrayList<>();
        caseCategories.add(category);
        caseDetails.setCaseCategories(caseCategories);
        return caseDetails;
    }
}
