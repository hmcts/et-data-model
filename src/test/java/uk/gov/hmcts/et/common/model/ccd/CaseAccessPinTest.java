package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CaseAccessPinTest {

    @Test
    public void testDeserializeCaseAccessPin() throws IOException {
        LocalDate dateNow = LocalDate.now();
        String json = "{\"expiryDate\":\"" + dateNow + "\",\"caseAccessibleRoles\":[\"[DEFENDANT]\"]}";
        CaseAccessPin caseAccessPin =
                new ObjectMapper().registerModule(new JavaTimeModule())
                        .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
                .readValue(json, CaseAccessPin.class);

        assertThat(caseAccessPin.getAccessCode()).isNotBlank();
        assertThat(caseAccessPin.getExpiryDate()).isEqualTo(dateNow);
        assertThat(caseAccessPin.getCaseAccessibleRoles()).contains("[DEFENDANT]");
    }

    @Test
    public void testCaseAccessPinBuilder() {
        LocalDate dateNow = LocalDate.now();

        CaseAccessPin caseAccessPin = new CaseAccessPin.Builder()
                .expiryDate(dateNow)
                .caseAccessibleRoles(List.of("[DEFENDANT]", "[CITIZEN]"))
                .build();
        assertThat(caseAccessPin.getAccessCode()).hasSize(12);
        assertThat(caseAccessPin.getExpiryDate()).isEqualTo(dateNow);
        assertThat(caseAccessPin.getCaseAccessibleRoles()).contains("[DEFENDANT]");
    }

}
