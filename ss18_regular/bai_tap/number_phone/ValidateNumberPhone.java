package ss18_regular.bai_tap.number_phone;

import ss18_regular.bai_tap.name_class.ValidateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private Pattern pattern;
    private Matcher matcher;
    private static final String NUMBER_PHONE = "^\\((84)-(0+)[0-9]{9}+[)]+$";

    public ValidateNumberPhone() {
        pattern = Pattern.compile(NUMBER_PHONE);
    }

    public boolean checkNumberPhone(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
