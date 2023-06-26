package uk.gov.hmcts.et.common.model.hmc.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = CapitalizedCaseEnumValidator.class)
public @interface CapitalizedEnum {
    Class<? extends Enum<?>> enumClass();
    String fieldName();
    String message() default "Unsupported type for {fieldName}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
