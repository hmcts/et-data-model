package uk.gov.hmcts.et.common.model.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RespondentSolicitorTypeTest {

    private static final String INDEX_OUT_OF_BOUNDS_NEGATIVE = "Index out of bounds for RespondentSolicitorType: -1";
    private static final String INDEX_OUT_OF_BOUNDS_POSITIVE = "Index out of bounds for RespondentSolicitorType: 10";
    private static final String RESPONDENT_SOLICITOR_TYPE_A = "[SOLICITORA]";
    private static final String RESPONDENT_SOLICITOR_TYPE_J = "[SOLICITORJ]";
    private static final String RESPONDENT_SOLICITOR_TYPE_INVALID = "[INVALID]";

    @Test
    void testGetByIndex_ValidIndexes() {
        assertEquals(RespondentSolicitorType.SOLICITORA, RespondentSolicitorType.getByIndex(0));
        assertEquals(RespondentSolicitorType.SOLICITORJ, RespondentSolicitorType.getByIndex(9));
    }

    @Test
    void testGetByIndex_InvalidNegativeIndex() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class,
                () -> RespondentSolicitorType.getByIndex(-1));
        assertTrue(exception.getMessage().contains(INDEX_OUT_OF_BOUNDS_NEGATIVE));
    }

    @Test
    void testGetByIndex_IndexTooHigh() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class,
                () -> RespondentSolicitorType.getByIndex(10));
        assertTrue(exception.getMessage().contains(INDEX_OUT_OF_BOUNDS_POSITIVE));
    }

    @Test
    void testGetLabel() {
        assertEquals(RESPONDENT_SOLICITOR_TYPE_A, RespondentSolicitorType.SOLICITORA.getLabel());
        assertEquals(RESPONDENT_SOLICITOR_TYPE_J, RespondentSolicitorType.SOLICITORJ.getLabel());
    }

    @Test
    void testValuesLength() {
        assertEquals(10, RespondentSolicitorType.values().length);
    }

    @Test
    void fromLabel_ValidLabels() {
        assertEquals(RespondentSolicitorType.SOLICITORA, RespondentSolicitorType.fromLabel(RESPONDENT_SOLICITOR_TYPE_A));
        assertEquals(RespondentSolicitorType.SOLICITORJ, RespondentSolicitorType.fromLabel(RESPONDENT_SOLICITOR_TYPE_J));
    }

    @Test
    void fromLabel_InvalidLabels() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> RespondentSolicitorType.fromLabel(RESPONDENT_SOLICITOR_TYPE_INVALID));
        assertTrue(exception.getMessage().contains("No RespondentSolicitorType found for label: "
                + RESPONDENT_SOLICITOR_TYPE_INVALID));
    }

    @Test
    void isValidLabel_ValidLabels() {
        assertTrue(RespondentSolicitorType.isValidLabel(RESPONDENT_SOLICITOR_TYPE_A));
        assertTrue(RespondentSolicitorType.isValidLabel(RESPONDENT_SOLICITOR_TYPE_J));
    }

    @Test
    void isValidLabel_InvalidLabels() {
        assertFalse(RespondentSolicitorType.isValidLabel(RESPONDENT_SOLICITOR_TYPE_INVALID));
    }
}
