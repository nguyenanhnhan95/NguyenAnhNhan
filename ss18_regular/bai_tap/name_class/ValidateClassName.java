package ss18_regular.bai_tap.name_class;

import ss18_regular.thuc_hanh.validate_email.ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private Pattern pattern;
    private Matcher matcher;
    private static final String NAME_CLASS = "^[CAP][0-9]{4}+[GHIK]$";

    public ValidateClassName() {
        pattern = Pattern.compile(NAME_CLASS);
    }

    public boolean checkClassName(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
