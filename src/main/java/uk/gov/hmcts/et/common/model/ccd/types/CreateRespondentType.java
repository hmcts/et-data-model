package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.et.common.model.ccd.Address;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class CreateRespondentType {

    @JsonProperty("respondentType")
    private String respondentType;
    @JsonProperty("respondentFirstName")
    private String respondentFirstName;
    @JsonProperty("respondentLastName")
    private String respondentLastName;
    @JsonProperty("respondentOrganisation")
    private String respondentOrganisation;
    @JsonProperty("respondent_address")
    private Address respondentAddress;
    @JsonProperty("respondent_ACAS_question")
    private String respondentAcasQuestion;
    @JsonProperty("respondent_ACAS")
    private String respondentAcas;
    @JsonProperty("respondent_ACAS_no")
    private String respondentAcasNo;
}
