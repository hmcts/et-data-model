package uk.gov.hmcts.et.common.model.hmc.validator;

import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import uk.gov.hmcts.et.common.model.hmc.DayOfWeekUnavailableType;
import uk.gov.hmcts.et.common.model.hmc.UnavailabilityDow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CapitalizedEnumValidatorTest {

    static Validator validator;

    @BeforeEach
    void setUp() {
        validator = Validation.byDefaultProvider()
                .configure()
                .messageInterpolator(new ParameterMessageInterpolator())
                .buildValidatorFactory()
                .getValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"})
    void whenInvalidCaseUnavailabilityDow(String dowValue) {
        final Set<ConstraintViolation<UnavailabilityDow>> violations =
                createAndValidateUnavailabilityDow(dowValue);
        assertFalse(violations.isEmpty());
        assertEquals(1, violations.size());
        List<String> validationErrors = new ArrayList<>();
        violations.forEach(e -> validationErrors.add(e.getMessage()));
        assertEquals("Unsupported type for dow", validationErrors.get(0));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"})
    void whenValidCaseUnavailabilityDow(String dowValue) {
        final Set<ConstraintViolation<UnavailabilityDow>> violations =
                createAndValidateUnavailabilityDow(dowValue);
        assertTrue(violations.isEmpty());
    }

    private Set<ConstraintViolation<UnavailabilityDow>> createAndValidateUnavailabilityDow(String dowValue) {
        UnavailabilityDow unavailabilityDow = new UnavailabilityDow();
        unavailabilityDow.setDowUnavailabilityType(DayOfWeekUnavailableType.ALL.toString());
        unavailabilityDow.setDow(dowValue);
        return validator.validate(unavailabilityDow);
    }
}
