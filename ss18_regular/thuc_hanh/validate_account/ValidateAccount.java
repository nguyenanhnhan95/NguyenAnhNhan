package ss18_regular.thuc_hanh.validate_account;

import ss18_regular.thuc_hanh.validate_email.ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private Pattern pattern;
    private Matcher matcher;
    private static final String account = "^[_a-z0-9]{6,}";

    public ValidateAccount() {
        pattern = Pattern.compile(account);
    }

    public boolean confirmAccount(String account) {
        matcher = pattern.matcher(account);
        return matcher.matches();
    }
}
