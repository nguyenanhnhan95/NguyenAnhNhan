package ss19_case_study_module2.service;

import ss19_case_study_module2.model.Employee;
import ss19_case_study_module2.utils.ELevelEducation;
import ss19_case_study_module2.utils.ELevelPosition;

import java.time.LocalDate;

public class test {
    public static void main(String[] args) {
//         public Employee(String code, String name, LocalDate dayOfBirth, String gender, String id, String numberPhone,
//                   String email, ELevelEducation levelEducation, ELevelPosition levelPosition, double salary) {
        Employee employee = new Employee("x1","x", LocalDate.parse("2023-04-04"),"nam","154","039","nhan@", ELevelEducation.Secondary, ELevelPosition.manage,254);
        System.out.println(employee.getDayOfBirth());
    }
}
