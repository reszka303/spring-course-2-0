package pl.javastart.emailapp;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class NotBadWordValidator implements ConstraintValidator<NotBadWord, String> {

    private Lang[] languages;

    @Override
    public void initialize(NotBadWord annotation) {
        this.languages = annotation.lang();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        for (Lang language : languages) {
            if (containsBadWord(value, language.getBadWords())) {
                return false;
            }
        }
        return true;
    }

    private boolean containsBadWord(String text, String[] badWords) {
        String lowerCaseText = text.toLowerCase();
        return Arrays.stream(badWords)
                .anyMatch(lowerCaseText::contains);
    }
}
