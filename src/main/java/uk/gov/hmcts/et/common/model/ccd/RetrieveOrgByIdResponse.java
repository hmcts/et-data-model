package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Jacksonized
@Builder
public class RetrieveOrgByIdResponse {
    @JsonProperty(value = "superUser")
    private SuperUser superUser;

    @Data
    @Jacksonized
    @Builder
    public static class SuperUser {
        String firstName;
        String lastName;
        String email;
    }
}
