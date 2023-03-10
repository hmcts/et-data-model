package uk.gov.hmcts.et.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Strings;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.common.base.Strings.isNullOrEmpty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ClaimantIndType {

    @JsonProperty("claimant_preferred_title")
    private String claimantPreferredTitle;
    @JsonProperty("claimant_title1")
    private String claimantTitle;
    @JsonProperty("claimant_title_other")
    private String claimantTitleOther;
    @JsonProperty("claimant_first_names")
    private String claimantFirstNames;
    @JsonProperty("claimant_last_name")
    private String claimantLastName;
    @JsonProperty("claimant_date_of_birth")
    private String claimantDateOfBirth;
    @JsonProperty("claimant_gender")
    private String claimantGender;
    @JsonProperty("claimant_sex")
    private String claimantSex;
    @JsonProperty("claimant_gender_identity_same")
    private String claimantGenderIdentitySame;
    @JsonProperty("claimant_gender_identity")
    private String claimantGenderIdentity;

    private static final String Other = "Other";

    public String claimantFullNames() {
        String title = getTitle();

        var fullNameList = List.of(title, claimantFirstNames, claimantLastName);
        return String.join(" ", notNullOrEmptyAtt(new ArrayList<>(), fullNameList));
    }

    /**
     * Used to return claimant's full name with his/her title
     * Used while creating hearings, reports and docmosis documents.
     * @return claimant's full name
     */
    public String claimantFullName() {
        String title = getTitle();

        var fullNameList = List.of(title, getInitials(), claimantLastName);
        return String.join(" ", notNullOrEmptyAtt(new ArrayList<>(), fullNameList));
    }

    /**
     * Used to return title according to following conditions:
     * 1. If claimantTitle is not null or empty and not Other, then returns claimant title
     * 2. If claimantTitle is Other and claimantTitleOther is not null then returns claimantTitleOther
     * 3. If claimantTitle is null or empty and claimantPreferredTitle is not null or empty and not Other, then returns
     *    claimantPreferredTitle.
     * 4. If claimantTitle is null or empty and claimantPreferredTitle is Other and claimantTitleOther is not null then
     *    returns claimantTitleOther
     * 5. In any other case returns an empty string as ""
     * @return title according to conditions defined above
     */
    private String getTitle() {
        return !Strings.isNullOrEmpty(trimStringValue(claimantTitle)) ? Other.equals(claimantTitle)
                ? !Strings.isNullOrEmpty(claimantTitleOther)
                ? claimantTitleOther : "" : claimantTitle
                : !Strings.isNullOrEmpty(trimStringValue(claimantPreferredTitle))
                ? Other.equals(claimantPreferredTitle) ? !Strings.isNullOrEmpty(claimantTitleOther)
                ? claimantTitleOther : "" : claimantPreferredTitle : "";
    }

    /**
     * Implemented to ignore blank title values.
     * @param val string value to be trimmed
     * @return trimmed string value or null
     */
    private String trimStringValue(String val) {
        return val == null ? null : val.trim();
    }

    private String getInitials() {
        if (!isNullOrEmpty(claimantFirstNames)) {
            return Arrays.stream(claimantFirstNames.split(" "))
                    .map(str -> str.substring(0, 1))
                    .collect(Collectors.joining(" "));
        }
        return "";
    }

    private List<String> notNullOrEmptyAtt(List<String> fullClaimantName, List<String> attributes) {
        for (String aux : attributes) {
            if (!isNullOrEmpty(aux)) {
                fullClaimantName.add(aux);
            }
        }
        return fullClaimantName;
    }
}
