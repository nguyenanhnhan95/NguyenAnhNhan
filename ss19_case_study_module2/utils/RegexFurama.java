package ss19_case_study_module2.utils;

public class RegexFurama {
    public boolean regexEmail(String email) {
        return email.matches("^([a-z0-9]+)@([a-z]{2,6}.com)$");
    }

    public boolean regexName(String name) {
        return name.matches("^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$");
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
    public boolean regexCodeCustomer(String codeEmployee) {
        return codeEmployee.matches("^KH-[0-9]{4}$");
    }

    public boolean regexSalary(String salary) {
        return salary.matches("^[1-9][0-9]+$");
    }

    public boolean regexPhone(String numberOfPhone) {
        return numberOfPhone.matches("^0[0-9]{9}");
    }
    public boolean regexAddress(String address){
        return address.matches("^[A-Za-z0-9 ]+$");
    }
    public boolean regexCodeRoom(String codeRoom) {
        return codeRoom.matches("^SVRO-[0-9]{4}$");
    }
    public boolean regexCodeHouse(String codeHouse) {
        return codeHouse.matches("^SVHO-[0-9]{4}$");
    }
    public boolean regexCodeVilla(String codeVilla) {
        return codeVilla.matches("^SVVL-[0-9]{4}$");
    }
    public boolean regexCodeService(String codeService) {
        return codeService.matches("^[A-Z][a-z ]+$");
    }
    public boolean regexNumberInt(String number){
        return number.matches("^[1-9][0-9]*$");
    }
    public boolean regexNumberDouble(String number){
        return number.matches("^[1-9][0-9]*.[0-9]*$");
    }
    public boolean regexCodeBooking(String codeBooking){
        return codeBooking.matches("^BO-[0-9]{4}$");
    }
}
