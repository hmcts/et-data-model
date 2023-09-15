package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchParty {

    @JsonProperty("DateOfBirth")
    private String dateOfBirth;
    @JsonProperty("DateOfDeath")
    private String dateOfDeath;
    @JsonProperty("PostCode")
    private String postCode;
    @JsonProperty("AddressLine1")
    private String addressLine1;
    @JsonProperty("EmailAddress")
    private String emailAddress;
    @JsonProperty("Name")
    private String name;
}
