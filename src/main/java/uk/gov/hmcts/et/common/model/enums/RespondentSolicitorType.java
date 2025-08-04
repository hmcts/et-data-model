package uk.gov.hmcts.et.common.model.enums;

import lombok.Getter;

@Getter
public enum RespondentSolicitorType {
    SOLICITORA("[SOLICITORA]"),
    SOLICITORB("[SOLICITORB]"),
    SOLICITORC("[SOLICITORC]"),
    SOLICITORD("[SOLICITORD]"),
    SOLICITORE("[SOLICITORE]"),
    SOLICITORF("[SOLICITORF]"),
    SOLICITORG("[SOLICITORG]"),
    SOLICITORH("[SOLICITORH]"),
    SOLICITORI("[SOLICITORI]"),
    SOLICITORJ("[SOLICITORJ]");

    /**
     * The label for the RespondentSolicitorType.
     */
    private final String label;

    /**
     * Constructor for RespondentSolicitorType.
     *
     * @param label the label for the type
     */
    RespondentSolicitorType(String label) {
        this.label = label;
    }

    /**
     * Returns the RespondentSolicitorType corresponding to the provided label.
     *
     * @param label the label to match
     * @return the RespondentSolicitorType that matches the label
     * @throws IllegalArgumentException if no matching type is found
     */
    public static RespondentSolicitorType fromLabel(String label) {
        for (RespondentSolicitorType type : values()) {
            if (type.getLabel().equals(label)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No RespondentSolicitorType found for label: " + label);
    }
    /**
     * Checks if the provided label is a valid RespondentSolicitorType label.
     *
     * @param label the label to check
     * @return true if the label is valid, false otherwise
     */
    public static boolean isValidLabel(String label) {
        for (RespondentSolicitorType type : values()) {
            if (type.getLabel().equals(label)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the RespondentSolicitorType corresponding to the provided index.
     *
     * @param index the index of the type
     * @return the RespondentSolicitorType at the specified index
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public static RespondentSolicitorType getByIndex(int index) {
        if (index < 0 || index >= values().length) {
            throw new IndexOutOfBoundsException("Index out of bounds for RespondentSolicitorType: " + index);
        }
        return values()[index];
    }
}
