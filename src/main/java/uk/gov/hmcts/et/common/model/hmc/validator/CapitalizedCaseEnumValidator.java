package uk.gov.hmcts.et.common.model.hmc.validator;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CapitalizedCaseEnumValidator implements ConstraintValidator<CapitalizedEnum, String> {
    private List<String> acceptedValues;

    @Override
    public void initialize(CapitalizedEnum annotation) {
        acceptedValues = Stream.of(annotation.enumClass().getEnumConstants())
                .map(enumValue -> enumValue.name().toLowerCase())
                .map(StringUtils::capitalize)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && acceptedValues.contains(value);
    }
}
