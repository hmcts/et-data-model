package uk.gov.hmcts.et.common.model.hmc;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.LuhnCheck;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CaseDetails {

    @NotEmpty(message = ValidationError.HMCTS_SERVICE_CODE_EMPTY_INVALID)
    @Pattern(regexp = "^\\w{4}$", message = ValidationError.HMCTS_SERVICE_CODE_EMPTY_INVALID)
    private String hmctsServiceCode;

    @NotEmpty(message = ValidationError.CASE_REF_EMPTY)
    @LuhnCheck(message = ValidationError.INVALID_CASE_REFERENCE, ignoreNonDigitCharacters = false)
    private String caseRef;

    @Size(max = 70, message = ValidationError.EXTERNAL_CASE_REFERENCE_MAX_LENGTH)
    private String externalCaseReference;

    // This has no further information on confluence and neither SSCS nor hmc-cft-serving-service have this defined.
    private LocalDateTime requestTimeStamp;

    @NotEmpty(message = ValidationError.CASE_DEEP_LINK_EMPTY)
    @Size(max = 1024, message = ValidationError.CASE_DEEP_LINK_MAX_LENGTH)
    @URL(message = ValidationError.CASE_DEEP_LINK_INVALID)
    private String caseDeepLink;

    @NotEmpty(message = ValidationError.HMCTS_INTERNAL_CASE_NAME_EMPTY)
    @Size(max = 1024, message = ValidationError.HMCTS_INTERNAL_CASE_NAME_MAX_LENGTH)
    private String caseNameHmctsInternal;

    @NotEmpty(message = ValidationError.PUBLIC_CASE_NAME_EMPTY)
    @Size(max = 1024, message = ValidationError.PUBLIC_CASE_NAME_MAX_LENGTH)
    private String publicCaseName;

    @Builder.Default
    private Boolean caseAdditionalSecurityFlag = false;

    private Boolean caseInterpreterRequiredFlag;

    @Valid
    @NotNull(message = ValidationError.CASE_CATEGORY_EMPTY)
    @NotEmpty(message = ValidationError.INVALID_CASE_CATEGORIES)
    private List<CaseCategory> caseCategories;

    @NotEmpty(message = ValidationError.CASE_MANAGEMENT_LOCATION_CODE_EMPTY)
    @Size(max = 40, message = ValidationError.CASE_MANAGEMENT_LOCATION_CODE_MAX_LENGTH)
    private String caseManagementLocationCode;

    @JsonProperty("caserestrictedFlag")
    @NotNull(message = ValidationError.CASE_RESTRICTED_FLAG_NULL_EMPTY)
    private Boolean caseRestrictedFlag;

    @JsonProperty("caseSLAStartDate")
    @NotNull(message = ValidationError.CASE_SLA_START_DATE_EMPTY)
    private LocalDate caseSlaStartDate;

}
