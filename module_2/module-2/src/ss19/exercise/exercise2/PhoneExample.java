package ss19.exercise.exercise2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    public static final String PHONE_REGEX = "^[(]\\d\\d[)]-[0](\\d{9})$";

    public PhoneExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
