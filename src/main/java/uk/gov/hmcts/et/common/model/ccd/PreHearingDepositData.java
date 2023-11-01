package uk.gov.hmcts.et.common.model.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class PreHearingDepositData {
    @JsonProperty("preHearingDepositImportFile")
    private ImportFile preHearingDepositImportFile;
    @JsonProperty("payeeName")
    private String payeeName;
    @JsonProperty("regionOffice")
    private String regionOffice;
    @JsonProperty("refundReference")
    private String refundReference;
    @JsonProperty("dateSentForRefund")
    private String dateSentForRefund;
    @JsonProperty("status")
    private String status;
    @JsonProperty("journalConfirmedPaid")
    private String journalConfirmedPaid;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("journalConfirmedReceipt")
    private String journalConfirmedReceipt;
    @JsonProperty("bankingDate")
    private String bankingDate;
    @JsonProperty("phrNumber")
    private String phrNumber;
    @JsonProperty("mr1Reference")
    private String mr1Reference;
    @JsonProperty("depositComments")
    private String depositComments;
    @JsonProperty("depositReceivedFrom")
    private String depositReceivedFrom;
    @JsonProperty("caseNumber")
    private String caseNumber;
    @JsonProperty("documentUpload")
    private String documentUpload;
    @JsonProperty("depositRefundedTo")
    private String depositRefundedTo;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("claimantOrRespondentName")
    private String claimantOrRespondentName;
    @JsonProperty("depositAmount")
    private String depositAmount;
    @JsonProperty("depositOrderedAgainst")
    private String depositOrderedAgainst;
    @JsonProperty("depositRequestedBy")
    private String depositRequestedBy;
    @JsonProperty("depositCovers")
    private String depositCovers;
    @JsonProperty("depositOrderSent")
    private String depositOrderSent;
    @JsonProperty("depositDue")
    private String depositDue;
    @JsonProperty("depositTimeExtension")
    private String depositTimeExtension;
    @JsonProperty("depositTimeExtensionDue")
    private String depositTimeExtensionDue;
    @JsonProperty("depositReceived")
    private String depositReceived;
    @JsonProperty("dateDepositReceived")
    private String dateDepositReceived;
    @JsonProperty("depositRefund")
    private String depositRefund;
    @JsonProperty("amountRefunded")
    private String amountRefunded;
    @JsonProperty("depositRefundDate")
    private String depositRefundDate;
    @JsonProperty("chequeOrPONumber")
    private String chequeOrPONumber;
    @JsonProperty("receivedBy")
    private String receivedBy;
}
