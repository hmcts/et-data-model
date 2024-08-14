package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CaseAccessPinTest {

    private static final int EXPIRY_PERIOD = 180;
    private static final int CASE_ACCESS_PIN_LENGTH = 12;
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @Test
    public void testDeserializeCaseAccessPin() throws IOException {
        String dateNow = LocalDateTime.now().plusDays(EXPIRY_PERIOD).format(DATE_TIME_FORMATTER);
        String json = "{\"expiryDate\":\"" + dateNow + "\",\"caseAccessibleRoles\":[\"[DEFENDANT]\"]}";
        CaseAccessPin caseAccessPin = new ObjectMapper().readValue(json, CaseAccessPin.class);

        assertThat(caseAccessPin.getAccessCode()).isNotBlank();
        assertThat(caseAccessPin.getExpiryDate()).isEqualTo(dateNow);
        assertThat(caseAccessPin.getCaseAccessibleRoles()).contains("[DEFENDANT]");
    }

    @Test
    public void testCaseAccessPinBuilder() {

        String dateNow = LocalDate.now().plusDays(EXPIRY_PERIOD).format(DATE_TIME_FORMATTER);
        CaseAccessPin caseAccessPin = new CaseAccessPin.Builder()
                .expiryDate(dateNow)
                .caseAccessibleRoles(List.of("[DEFENDANT]", "[CITIZEN]"))
                .build();
        assertThat(caseAccessPin.getAccessCode()).hasSize(CASE_ACCESS_PIN_LENGTH);
        assertThat(caseAccessPin.getExpiryDate()).isEqualTo(dateNow);
        assertThat(caseAccessPin.getCaseAccessibleRoles()).contains("[DEFENDANT]");
    }

}
