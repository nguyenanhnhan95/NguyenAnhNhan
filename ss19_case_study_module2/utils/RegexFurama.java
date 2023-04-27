package ss19_case_study_module2.utils;

public class RegexFurama {
    public boolean regexEmail(String email) {
        return email.matches("^([a-z0-9]+)@([a-z]{2,6}.com)$");
    }

    public boolean regexName(String name) {
        return name.matches("[A-Z][a-z]+(\\s[A-Z][a-z]+)*$");
    }

    public boolean regexYear(String years) {
        return years.matches("^[0-9]{4}-[0-9]{2}-[0-9]{2}$");
    }

    public boolean regexID(String id) {
        return id.matches("^([0-9]{9}|[0-9]{12})$");
    }

    public boolean regexCodeEmployee(String codeEmployee) {
        return codeEmployee.matches("^NV-[0-9]{4}$");
    }

    public boolean regexSalary(String salary) {
        return salary.matches("^[1-9][0-9]+$");
    }

    public boolean regexPhone(String numberOfPhone) {
        return numberOfPhone.matches("^0[0-9]{9}");
    }
}
