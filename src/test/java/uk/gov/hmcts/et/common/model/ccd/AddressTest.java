package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressTest {
    private Address address;
    private Address addressMissingFields;

    @BeforeEach
    void setUp() throws Exception {
        String json = "{"
                + " \"AddressLine1\" : \"Unit 14\", "
                + " \"AddressLine2\" : \"3 Edgar Buildings\", "
                + " \"AddressLine3\" : \"George Street\", "
                + " \"PostTown\" : \"Bath\", "
                + " \"County\" : \"Somerset\", "
                + " \"PostCode\" : \"BA1 2FJ\", "
                + " \"Country\" : \"England\" "
                + "} ";
        String json2 = "{"
                + " \"AddressLine1\" : \"Unit 14\", "
                + " \"PostTown\" : \"Bath\", "
                + " \"County\" : \"Somerset\", "
                + " \"PostCode\" : \"BA1 2FJ\", "
                + " \"Country\" : \"England\" "
                + "} ";
        ObjectMapper mapper = new ObjectMapper();
        address = mapper.readValue(json, Address.class);
        ObjectMapper mapper2 = new ObjectMapper();
        addressMissingFields = mapper2.readValue(json2, Address.class);
    }

    @Test
    void shouldCreateAddressFromJson() {
        assertEquals(address.getAddressLine1(), "Unit 14");
        assertEquals(address.getAddressLine2(), "3 Edgar Buildings");
        assertEquals(address.getAddressLine3(), "George Street");
        assertEquals(address.getPostTown(), "Bath");
        assertEquals(address.getCounty(), "Somerset");
        assertEquals(address.getPostCode(), "BA1 2FJ");
        assertEquals(address.getCountry(), "England");
    }

    @Test
    void shouldReturnAddressAllFields() {
        assertEquals(address.toString(), "Unit 14, 3 Edgar Buildings, George Street, "
                + "Bath, Somerset, BA1 2FJ, England");
    }

    @Test
    void shouldReturnAddressMissingFields() {
        assertEquals(addressMissingFields.toString(), "Unit 14, Bath, Somerset, BA1 2FJ, England");
    }

}