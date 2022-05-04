package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ClaimantOtherType {

    @JsonProperty("claimant_occupation")
    private String claimantOccupation;
    @JsonProperty("claimant_employed_from")
    private String claimantEmployedFrom;
    @JsonProperty("claimant_employed_currently")
    private String claimantEmployedCurrently;
    @JsonProperty("claimant_employed_to")
    private String claimantEmployedTo;
    @JsonProperty("claimant_employed_notice_period")
    private String claimantEmployedNoticePeriod;
    @JsonProperty("claimant_disabled")
    private String claimantDisabled;
    @JsonProperty("claimant_disabled_details")
    private String claimantDisabledDetails;
    @JsonProperty("claimant_notice_period")
    private String claimantNoticePeriod;
    @JsonProperty("claimant_notice_period_unit")
    private String claimantNoticePeriodUnit;
    @JsonProperty("claimant_notice_period_duration")
    private String claimantNoticePeriodDuration;
    @JsonProperty("claimant_average_weekly_hours")
    private String claimantAverageWeeklyHours;
    @JsonProperty("claimant_pay_before_tax")
    private String claimantPayBeforeTax;
    @JsonProperty("claimant_pay_after_tax")
    private String claimantPayAfterTax;
    @JsonProperty("claimant_pay_cycle")
    private String claimantPayCycle;
    @JsonProperty("claimant_pension_contribution")
    private String claimantPensionContribution;
    @JsonProperty("claimant_pension_weekly_contribution")
    private String claimantPensionWeeklyContribution;
    @JsonProperty("claimant_benefits")
    private String claimantBenefits;
    @JsonProperty("claimant_benefits_detail")
    private String claimantBenefitsDetail;
}
