package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EntityRoleCode {
    APPELLANT("APEL", Constants.APPLICANT, "Appellant", "", null),
    APPOINTEE("APIN", "Appointee", "Appointee", "", null),
    JOINT_PARTY("JOPA", Constants.APPLICANT, "Joint Party", "", null),
    OTHER_PARTY("OTPA", "Respondent", "Other Party", "", null),
    RESPONDENT("RESP", "Respondent", "Respondent", "", null),
    WELFARE_REPRESENTATIVE("WERP", Constants.REPRESENTATIVE, "Welfare Representative", "", PartyRelationshipType.SOLICITOR),
    LEGAL_REPRESENTATIVE("LGRP", Constants.REPRESENTATIVE, "Legal Representative", "", PartyRelationshipType.SOLICITOR),
    BARRISTER("BARR", Constants.REPRESENTATIVE, "Barrister", "", PartyRelationshipType.SOLICITOR),
    INTERPRETER("INTP", "Interpreter", "Interpreter", "", PartyRelationshipType.INTERPRETER),
    REPRESENTATIVE("RPTT", Constants.REPRESENTATIVE, "Barrister", "", PartyRelationshipType.SOLICITOR),
    SUPPORT("SUPP", "Support", "Support", "", null),
    APPLICANT("APPL", Constants.APPLICANT, Constants.APPLICANT, "", null),
    CLAIMANT("CLAI", "", "Claimant", "", null);

    @JsonValue
    private final String hmcReference;
    private final String parentRole;
    private final String valueEn;
    private final String valueCy;
    private final PartyRelationshipType partyRelationshipType;

    private static class Constants {
        public static final String APPLICANT = "Applicant";
        public static final String REPRESENTATIVE = "Representative";
    }
}