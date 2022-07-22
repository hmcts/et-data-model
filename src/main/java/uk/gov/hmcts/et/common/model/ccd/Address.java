package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Strings;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.google.common.base.Strings.isNullOrEmpty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Address {

    @JsonProperty("AddressLine1")
    private String addressLine1;
    @JsonProperty("AddressLine2")
    private String addressLine2;
    @JsonProperty("AddressLine3")
    private String addressLine3;
    @JsonProperty("PostTown")
    private String postTown;
    @JsonProperty("County")
    private String county;
    @JsonProperty("PostCode")
    private String postCode;
    @JsonProperty("Country")
    private String country;

    public String toString() {
        return String.join(", ", notNullOrEmptyAddress(new ArrayList<>(), Arrays.asList(addressLine1,
                addressLine2, addressLine3, postTown, county, postCode, country)));
    }

    public String toAddressHtml() {
        StringBuilder claimantAddressStr = new StringBuilder();
        claimantAddressStr.append("<br/>" + addressLine1);
        if (!Strings.isNullOrEmpty(addressLine2)) {
            claimantAddressStr.append("<br/>" + addressLine2);
        }
        if (!Strings.isNullOrEmpty(addressLine3)) {
            claimantAddressStr.append("<br/>" + addressLine3);
        }
        claimantAddressStr.append("<br/>" + postTown)
                .append("<br/>" + postCode)
                .append("<br/><br/>");

        return claimantAddressStr.toString();
    }

    private List<String> notNullOrEmptyAddress(List<String> fullAddress, List<String> attributes) {
        for (String aux : attributes) {
            if (!isNullOrEmpty(aux)) {
                fullAddress.add(aux);
            }
        }
        return fullAddress;
    }

}

