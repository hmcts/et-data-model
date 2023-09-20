package uk.gov.hmcts.et.common.model.hmc.validator;

import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.gov.hmcts.et.common.model.hmc.CaseCategory;
import uk.gov.hmcts.et.common.model.hmc.CaseCategoryType;
import uk.gov.hmcts.et.common.model.hmc.CaseDetails;
import uk.gov.hmcts.et.common.model.hmc.HearingDetails;
import uk.gov.hmcts.et.common.model.hmc.HearingLocation;
import uk.gov.hmcts.et.common.model.hmc.HearingWindow;
import uk.gov.hmcts.et.common.model.hmc.ListingReasonCode;
import uk.gov.hmcts.et.common.model.hmc.LocationType;
import uk.gov.hmcts.et.common.model.hmc.PanelRequirements;
import uk.gov.hmcts.et.common.model.hmc.PartyDetails;
import uk.gov.hmcts.et.common.model.hmc.PartyType;
import uk.gov.hmcts.et.common.model.hmc.RequestDetails;
import uk.gov.hmcts.et.common.model.hmc.ValidationError;
import uk.gov.hmcts.et.common.model.hmc.hearing.HearingRequestPayload;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
        caseDetails.setCaseNameHmctsInternal("");
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
        RequestDetails requestDetails = new RequestDetails();
        Set<ConstraintViolation<RequestDetails>> violations = validator.validate(requestDetails);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.VERSION_NUMBER_NULL_EMPTY));
    }

    @Test
    void shouldFailAsHearingDetailsNotPresent() {
        HearingRequestPayload hearingRequest = new HearingRequestPayload();
        hearingRequest.setCaseDetails(caseDetails());
        hearingRequest.setRequestDetails(new RequestDetails());
        Set<ConstraintViolation<HearingRequestPayload>> violations = validator.validate(hearingRequest);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.INVALID_HEARING_DETAILS));
    }

    @Test
    void shouldFailAsCaseDetailsCaseCategoriesNotPresent() {
        HearingRequestPayload hearingRequest = new HearingRequestPayload();
        hearingRequest.setHearingDetails(hearingDetails());
        hearingRequest.getHearingDetails().setPanelRequirements(panelRequirements());
        hearingRequest.setCaseDetails(caseDetails());
        hearingRequest.getCaseDetails().setCaseCategories(new ArrayList<>());
        hearingRequest.setRequestDetails(new RequestDetails());
        Set<ConstraintViolation<HearingRequestPayload>> violations = validator.validate(hearingRequest);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.INVALID_CASE_CATEGORIES));
    }

    @Test
    void shouldFailAsPanelRequirementsNotPresent() {
        HearingRequestPayload hearingRequest = new HearingRequestPayload();
        hearingRequest.setHearingDetails(hearingDetails());
        hearingRequest.setCaseDetails(caseDetails());
        hearingRequest.setRequestDetails(new RequestDetails());
        Set<ConstraintViolation<HearingRequestPayload>> violations = validator.validate(hearingRequest);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.INVALID_PANEL_REQUIREMENTS));
    }

    @Test
    void shouldFailAsCaseDetailsNotPresent() {
        HearingRequestPayload hearingRequest = new HearingRequestPayload();
        hearingRequest.setHearingDetails(hearingDetails());
        hearingRequest.getHearingDetails().setPanelRequirements(panelRequirements());
        hearingRequest.setRequestDetails(new RequestDetails());
        Set<ConstraintViolation<HearingRequestPayload>> violations = validator.validate(hearingRequest);
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        assertTrue(validationErrors.contains(ValidationError.INVALID_CASE_DETAILS));

    }

    @Test
    void shouldFailAsHearingLocationsNotPresent() {
        HearingRequestPayload hearingRequest = new HearingRequestPayload();
        hearingRequest.setHearingDetails(hearingDetails());
        hearingRequest.setCaseDetails(caseDetails());
        hearingRequest.getHearingDetails().setHearingLocations(new ArrayList<>());
        hearingRequest.getHearingDetails().setPanelRequirements(panelRequirements());
        hearingRequest.setRequestDetails(new RequestDetails());
        Set<ConstraintViolation<HearingRequestPayload>> violations = validator.validate(hearingRequest);
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
        category.setCategoryType(CaseCategoryType.CASETYPE.getLabel());
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
        category.setCategoryType(CaseCategoryType.CASETYPE.getLabel());
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
        partyDetails.setPartyName("abcdefg");
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
        partyDetails.setPartyName("abcdefg");
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
        partyDetails.setPartyName("abcdefg");
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
        partyDetails.setPartyName("abcdefg");
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
        partyDetails.setPartyName("abcdefg");
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
        partyDetails.setPartyName("abcdefg");
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
        partyDetails.setPartyName("abcdefg");
        Set<ConstraintViolation<PartyDetails>> violations = validator.validate(partyDetails);
        assertTrue(violations.isEmpty());
    }

    @Test
    void whenInvalidPartyRoleIs7Characters() {
        PartyDetails partyDetails = new PartyDetails();
        partyDetails.setPartyID("XXX1");
        partyDetails.setPartyType(PartyType.IND.toString());
        partyDetails.setPartyRole("abcdefg");
        partyDetails.setPartyName("abcdefg");
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

    public HearingDetails hearingDetails() {
        HearingDetails hearingDetails = new HearingDetails();
        hearingDetails.setAutoListFlag(false);
        hearingDetails.setListingAutoChangeReasonCode(ListingReasonCode.NO_MAPPING_AVAILABLE.getLabel());
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
        location1.setLocationType(LocationType.CLUSTER.getLabel());
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
        caseDetails.setCaseNameHmctsInternal("Internal case name");
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
