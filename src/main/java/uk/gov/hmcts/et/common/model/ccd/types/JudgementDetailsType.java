package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class JudgementDetailsType {

    @JsonProperty("folio_number")
    private String folioNumber;
    @JsonProperty("reasons_given")
    private String reasonsGiven;
    @JsonProperty("date_reasons_issued")
    private String dateReasonsIssued;
    @JsonProperty("awardMade")
    private String awardMade;
    @JsonProperty("financialAwardMade")
    private String financialAwardMade;
    @JsonProperty("remedy_left_to_parties")
    private String remedyLeftToParties;
    @JsonProperty("reinstate_reengage_order")
    private String reinstateReengageOrder;
    @JsonProperty("reinstated_reengaged")
    private String reinstatedReengaged;
    @JsonProperty("cert_of_correction_date")
    private String certOfCorrectionDate;
    @JsonProperty("cert_of_correction_sent")
    private String certOfCorrectionSent;
    @JsonProperty("non-financial_award")
    private String nonFinancialAward;
    @JsonProperty("total_award")
    private String totalAward;
    @JsonProperty("adjustment")
    private String adjustment;
    @JsonProperty("adjustmentPercentage")
    private String adjustmentPercentage;
    @JsonProperty("certificateOfCorrection")
    private String certificateOfCorrection;
}
