package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.List;


/**
 * Defines the access pin which can be used by third parties such as defendants, legal representatives etc...
 */
@Data
@JsonDeserialize(builder = CaseAccessPin.Builder.class)
public class CaseAccessPin {
    @JsonProperty("accessCode")
    private final String accessCode;
    @JsonProperty("expiryDate")
    private final LocalDate expiryDate;
    @JsonProperty("caseAccessibleRoles")
    private final List<String> caseAccessibleRoles;

    private CaseAccessPin(Builder builder) {
        this.accessCode = builder.accessCode;
        this.expiryDate = builder.expiryDate;
        this.caseAccessibleRoles = builder.caseAccessibleRoles;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        private final String accessCode;
        private LocalDate expiryDate;
        private List<String> caseAccessibleRoles;

        private static final String CASE_ACCESS_PIN_ALLOWED_CHARS = "ABCDEFGHJKLMNPRSTVWXYZ23456789";
        private static final int RANDOM_STRING_LENGTH = 12;
        private static final int RANDOM_STRING_START_POSITION = 0;
        private static final boolean RANDOM_STRING_INCLUDES_LETTERS = false;
        private static final boolean RANDOM_STRING_INCLUDES_NUMBERS = false;

        public Builder() {
            this.accessCode = RandomStringUtils.random(Builder.RANDOM_STRING_LENGTH,
                    RANDOM_STRING_START_POSITION,
                    CASE_ACCESS_PIN_ALLOWED_CHARS.length(),
                    RANDOM_STRING_INCLUDES_LETTERS,
                    RANDOM_STRING_INCLUDES_NUMBERS,
                    CASE_ACCESS_PIN_ALLOWED_CHARS.toCharArray(),
                    new SecureRandom());
        }

        public Builder expiryDate(LocalDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder caseAccessibleRoles(List<String> caseAccessibleRoles) {
            this.caseAccessibleRoles = caseAccessibleRoles;
            return this;
        }

        public CaseAccessPin build() {
            return new CaseAccessPin(this);
        }
    }
}
