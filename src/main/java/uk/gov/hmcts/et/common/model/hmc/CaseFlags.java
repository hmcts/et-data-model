package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class CaseFlags {

    @JsonProperty("flags")
    private List<PartyFlags> flags;
    @JsonProperty("flagAmendURL")
    private String flagAmendUrl;
}
