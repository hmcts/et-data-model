package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attendee {
    @JsonProperty("partyID")
    @Size(max = 40)
    @NotNull
    private String partyId;

    @Size(max = 60)
    @NotNull
    private String hearingSubChannel;
}
