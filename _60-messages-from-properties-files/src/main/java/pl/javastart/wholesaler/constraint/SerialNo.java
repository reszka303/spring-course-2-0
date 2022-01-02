package pl.javastart.wholesaler.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = SerialNoValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SerialNo {

//    String message() default "${validatedValue} is incorrect." +
//            " It should start with {startsWith} and have {codeLength} digit number";

    String message() default "{pl.javastart.wholesaler.constraint.SerialNo.message}";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    int codeLength();
    String startsWith();
}
