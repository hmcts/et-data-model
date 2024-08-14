package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CaseAccessPinTest {

    private static final int EXPIRY_PERIOD = 180;
    private static final int CASE_ACCESS_PIN_LENGTH = 12;
    private static final String DATE_NOW = LocalDateTime.now().plusDays(EXPIRY_PERIOD).toString();

    @Test
    public void testDeserializeCaseAccessPin() throws IOException {
        String json = "{\"expiryDate\":\"" + DATE_NOW + "\",\"caseAccessibleRoles\":[\"[DEFENDANT]\"]}";
        CaseAccessPin caseAccessPin = new ObjectMapper().readValue(json, CaseAccessPin.class);

        assertThat(caseAccessPin.getAccessCode()).isNotBlank();
        assertThat(caseAccessPin.getExpiryDate()).isEqualTo(DATE_NOW);
        assertThat(caseAccessPin.getCaseAccessibleRoles()).contains("[DEFENDANT]");
    }

    @Test
    public void testCaseAccessPinBuilder() {
        CaseAccessPin caseAccessPin = new CaseAccessPin.Builder()
                .expiryDate(DATE_NOW)
                .caseAccessibleRoles(List.of("[DEFENDANT]", "[CITIZEN]"))
                .build();
        assertThat(caseAccessPin.getAccessCode()).hasSize(CASE_ACCESS_PIN_LENGTH);
        assertThat(caseAccessPin.getExpiryDate()).isEqualTo(DATE_NOW);
        assertThat(caseAccessPin.getCaseAccessibleRoles()).contains("[DEFENDANT]");
    }

}
