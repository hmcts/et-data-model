package uk.gov.hmcts.et.common.model.hmc.validator;

import uk.gov.hmcts.et.common.model.hmc.ListingReasonCode;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.TYPE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = ListingReasonCodeEnumValidator.class)
public @interface ListingReasonCodeEnum {
    Class<? extends Enum<ListingReasonCode>> enumClass();
    String fieldName();
    String message() default "Unsupported type or value for {fieldName}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
