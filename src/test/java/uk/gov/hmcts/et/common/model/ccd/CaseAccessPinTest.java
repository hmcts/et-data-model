package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CaseAccessPinTest {

    private static final int EXPIRY_PERIOD = 180;
    private static final int CASE_ACCESS_PIN_LENGTH = 12;
    private static final String DATE_NOW = LocalDateTime.now().plusDays(EXPIRY_PERIOD).toString();

    private static final String CASE_ACCESS_PIN_ALLOWED_CHARS = "ABCDEFGHJKLMNPRSTVWXYZ23456789";
    private static final int RANDOM_STRING_START_POSITION = 0;
    private static final boolean RANDOM_STRING_INCLUDES_LETTERS = false;
    private static final boolean RANDOM_STRING_INCLUDES_NUMBERS = false;

    @Test
    public void testDeserializeCaseAccessPin() throws IOException {
        String accessCode = RandomStringUtils.random(CASE_ACCESS_PIN_LENGTH,
                RANDOM_STRING_START_POSITION,
                CASE_ACCESS_PIN_ALLOWED_CHARS.length(),
                RANDOM_STRING_INCLUDES_LETTERS,
                RANDOM_STRING_INCLUDES_NUMBERS,
                CASE_ACCESS_PIN_ALLOWED_CHARS.toCharArray(),
                new SecureRandom());
        String json = "{\"accessCode\":\"" + accessCode + "\",\"expiryDate\":\""
                + DATE_NOW + "\",\"caseAccessibleRoles\":[\"[DEFENDANT]\"]}";
        CaseAccessPin caseAccessPin = new ObjectMapper().readValue(json, CaseAccessPin.class);

        assertThat(caseAccessPin.getAccessCode()).hasSize(CASE_ACCESS_PIN_LENGTH);
        assertThat(caseAccessPin.getExpiryDate()).isEqualTo(DATE_NOW);
        assertThat(caseAccessPin.getCaseAccessibleRoles()).contains("[DEFENDANT]");
    }

    @Test
    public void testCaseAccessPinBuilder() {
        CaseAccessPin caseAccessPin = CaseAccessPin.builder()
                .accessCode(RandomStringUtils.random(CASE_ACCESS_PIN_LENGTH,
                        RANDOM_STRING_START_POSITION,
                        CASE_ACCESS_PIN_ALLOWED_CHARS.length(),
                        RANDOM_STRING_INCLUDES_LETTERS,
                        RANDOM_STRING_INCLUDES_NUMBERS,
                        CASE_ACCESS_PIN_ALLOWED_CHARS.toCharArray(),
                        new SecureRandom()))
                .expiryDate(DATE_NOW)
                .caseAccessibleRoles(List.of("[DEFENDANT]", "[CITIZEN]"))
                .build();
        assertThat(caseAccessPin.getAccessCode()).hasSize(CASE_ACCESS_PIN_LENGTH);
        assertThat(caseAccessPin.getExpiryDate()).isEqualTo(DATE_NOW);
        assertThat(caseAccessPin.getCaseAccessibleRoles()).contains("[DEFENDANT]");
    }

}
