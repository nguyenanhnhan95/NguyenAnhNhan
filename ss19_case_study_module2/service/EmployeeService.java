package ss19_case_study_module2.service;

import ss19_case_study_module2.model.Customer;
import ss19_case_study_module2.model.Employee;
import ss19_case_study_module2.repository.EmployeeRepository;
import ss19_case_study_module2.utils.ELevelEducation;
import ss19_case_study_module2.utils.ELevelPosition;
import ss19_case_study_module2.utils.RegexFurama;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private Scanner sc = new Scanner(System.in);
    private RegexFurama regexFurama = new RegexFurama();
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    private List<Employee> listEmployee;

    @Override
    public void add() {
        String codeEmployee = null;
        String name = null;
        String birthOfDayStr;
        LocalDate birthOfDay = null;
        String id = null;
        String email = null;
        String numberOfPhone = null;
        String salary = null;
        String gender = null;
        ELevelEducation levelEducation = null;
        ELevelPosition levelPosition = null;
        int count = 0;
        do {
            switch (count) {
                case 0:
                    System.out.println("Enter code employee :");
                    codeEmployee = sc.nextLine().trim();
                    if (regexFurama.regexCodeEmployee(codeEmployee)) {
                        ++count;
                    } else {
                        System.err.println("Please re-enter code employee :");
                    }
                    break;
                case 1:
                    System.out.println("Enter name employee :");
                    name = sc.nextLine().trim();
                    if (regexFurama.regexName(name)) {
                        ++count;
                    } else {
                        System.err.println("Please re-enter name employee");
                    }
                    break;
                case 2:
                    System.out.println("Enter employee's birthofday YYYY-MM-DD:");
                    birthOfDayStr = sc.nextLine().trim();
                    if (regexFurama.regexYear(birthOfDayStr)) {
                        birthOfDay = LocalDate.parse(birthOfDayStr);
                        if ((Period.between(birthOfDay, LocalDate.now()).getYears()) > 18) {
                            ++count;
                        } else {
                            System.err.println("Years old below 18 re-enter :");
                        }
                    } else {
                        System.err.println("you enter fault : Please re-enter");
                    }
                    break;
                case 3:
                    System.out.println("Enter 1 Female 2 Male :");
                    gender = sc.nextLine().trim();
                    switch (gender) {
                        case "1":
                            gender = "Female";
                            ++count;
                            break;
                        case "2":
                            gender = "Male";
                            ++count;
                            break;
                        default:
                            System.out.println("Please re-enter gender :");
                    }
                    break;
                case 4:
                    System.out.println("Please enter your ID :");
                    id = sc.nextLine().trim();
                    if (employeeRepository.find(id) != -1) {
                        System.err.println("Employee existing");
                        count = 10;
                        break;
                    }
                    if (regexFurama.regexID(id)) {
                        ++count;
                    } else {
                        System.err.println("Enter fault Please re-enter");
                    }
                    break;
                case 5:
                    System.out.println("Please enter your number of phone :");
                    numberOfPhone = sc.nextLine().trim();
                    if (regexFurama.regexPhone(numberOfPhone)) {
                        ++count;
                    } else {
                        System.err.println("You fault please re-enter");
                    }
                    break;
                case 6:
                    System.out.println("Please enter your email :");
                    email = sc.nextLine().trim();
                    if (regexFurama.regexEmail(email)) {
                        ++count;
                    } else {
                        System.err.println("you enter fault Please re-enter :");
                    }
                    break;
                case 7:
                    System.out.println("1 .Secondary,\n" +
                            "2. college,\n" +
                            "3. university,\n" +
                            "4 .graduatedUniversity,");
                    switch (sc.nextLine().trim()) {
                        case "1":
                            levelEducation = ELevelEducation.Secondary;
                            ++count;
                            break;
                        case "2":
                            levelEducation = ELevelEducation.college;
                            ++count;
                            break;
                        case "3":
                            levelEducation = ELevelEducation.university;
                            ++count;
                            break;
                        case "4":
                            levelEducation = ELevelEducation.graduatedUniversity;
                            ++count;
                            break;
                        default:
                            System.out.println("Please re-enter your choice :");
                    }
                    break;
                case 8:
                    System.out.println("1. receptionist,\n" +
                            "2. serve,\n" +
                            "3. expert,\n" +
                            "4. monitor,\n" +
                            "5. manage,\n" +
                            "6. director,");
                    switch (sc.nextLine().trim()) {
                        case "1":
                            levelPosition = ELevelPosition.receptionist;
                            ++count;
                            break;
                        case "2":
                            levelPosition = ELevelPosition.serve;
                            ++count;
                            break;
                        case "3":
                            levelPosition = ELevelPosition.expert;
                            ++count;
                            break;
                        case "4":
                            levelPosition = ELevelPosition.monitor;
                            ++count;
                            break;
                        case "5":
                            levelPosition = ELevelPosition.manage;
                            ++count;
                            break;
                        case "6":
                            levelPosition = ELevelPosition.director;
                            ++count;
                            break;
                        default:
                            System.out.println("Please re-enter your choice :");
                    }
                    break;
                case 9:
                    System.out.println("Enter your salary :");
                    salary = sc.nextLine().trim();
                    if (regexFurama.regexSalary(salary)) {
                        ++count;
                        employeeRepository.add(new Employee(codeEmployee, name, birthOfDay, gender, id, numberOfPhone,
                                email, levelEducation, levelPosition, Double.parseDouble(salary)));

                    } else {
                        System.err.println("Fault enter please re-enter :");
                    }
                    break;
            }
        } while (count != 10);
    }

    //        String code, String name, LocalDate dayOfBirth, String gender, String id, String numberPhone,
//                String email, ELevelEducation levelEducation, ELevelPosition levelPosition, double salary) {
    @Override
    public void display() {
        listEmployee = new ArrayList<>();
        listEmployee = employeeRepository.readFile();
        System.out.println("+---------+--------------------+-------------+----------+------------+---------------+" +
                "--------------------------+--------------------+-------------+------------+");
        System.out.println("| Code    | Name               | Birth       | Gender   | ID         | Phone         |" +
                " Email                    | Education          | Position    | Salary     |");
        for (Employee e : listEmployee) {
            System.out.println("+---------+--------------------+-------------+----------+------------+---------------+" +
                    "--------------------------+--------------------+-------------+------------+");
            System.out.printf("|%-9s|%-20s|%-13s|%-10s|%-12s|%-15s|%-26s|%-20s|%-13s|%-12s|\n",
                    e.getCode(), e.getName(), e.getDayOfBirth(), e.getGender(), e.getId(), e.getNumberPhone(),
                    e.getEmail(), e.getLevelEducation(), e.getLevelPosition(), e.getSalary());
        }
        System.out.println("+---------+--------------------+-------------+----------+------------+---------------+" +
                "--------------------------+--------------------+-------------+------------+");
    }

    @Override
    public void edit() {
        String codeEmployee = null;
        String name = null;
        String birthOfDayStr;
        LocalDate birthOfDay = null;
        String id = null;
        String email = null;
        String numberOfPhone = null;
        String salary = null;
        String gender = null;
        ELevelEducation levelEducation = null;
        ELevelPosition levelPosition = null;
        String idEmployee;
        int index;
        boolean flag = true;
        String choice;
        System.out.println("Please enter employee's id");
        idEmployee = sc.nextLine().trim();
        index = employeeRepository.find(idEmployee);
        if (index != -1) {
            do {
                System.out.println("1. Code \n" +
                        "2. name \n " +
                        "3. dayOfBirth\n" +
                        "4. gender\n " +
                        "5. id\n " +
                        "6. numberPhone\n" +
                        "7. email\n" +
                        "8. levelEducation\n" +
                        "9. levelPosition\n" +
                        "10. double salary\n" +
                        "11. Exit\n" +
                        "Please enter your choice");
                choice = sc.nextLine().trim();
                switch (choice) {
                    case "1":
                        do {
                            System.out.println("Edit code employee :");
                            codeEmployee = sc.nextLine().trim();
                            if (regexFurama.regexCodeEmployee(codeEmployee)) {
                                flag = true;
                            } else {
                                System.out.println("Please re-enter code employee :");
                                flag = false;
                            }
                        } while (flag != true);
                        break;
                    case "2":
                        do {
                            System.out.println("Edit name employee :");
                            name = sc.nextLine().trim();
                            if (regexFurama.regexName(name)) {
                                flag = true;
                            } else {
                                System.out.println("Please re-enter name employee");
                                flag = false;
                            }
                        } while (flag != true);
                        break;
                    case "3":
                        do {
                            System.out.println("Edit employee's birthofday YYYY-MM-DD:");
                            birthOfDayStr = sc.nextLine().trim();
                            if (regexFurama.regexYear(birthOfDayStr)) {
                                birthOfDay = LocalDate.parse(birthOfDayStr);
                                if ((Period.between(birthOfDay, LocalDate.now()).getYears()) > 18) {
                                    flag = true;
                                } else {
                                    System.out.println("Years old below 18 re-enter :");
                                    flag = false;
                                }
                            } else {
                                System.out.println("you enter fault : Please re-enter");
                                flag = false;
                            }
                        } while (flag != true);
                        break;
                    case "4":
                        do {
                            System.out.println("1. Female\n" +
                                    "2. Male\n");
                            switch (sc.nextLine().trim()) {
                                case "1":
                                    gender = "Female";
                                    flag = true;
                                    break;
                                case "2":
                                    gender = "Male";
                                    flag = true;
                                    break;
                                default:
                                    System.out.println("You enter fault");
                                    flag = false;
                            }
                        } while (flag != true);
                        break;
                    case "5":
                        do {
                            System.out.println("Please enter your ID to Edit:");
                            id = sc.nextLine().trim();
                            if (regexFurama.regexID(id)) {
                                flag = true;
                            } else {
                                System.out.println("Enter fault Please re-enter");
                                flag = false;
                            }
                        } while (flag != true);
                        break;
                    case "6":
                        do {
                            System.out.println("Please enter your number of phone to edit:");
                            numberOfPhone = sc.nextLine().trim();
                            if (regexFurama.regexPhone(numberOfPhone)) {
                                flag = true;
                            } else {
                                System.out.println("You fault please re-enter");
                                flag = false;
                            }
                        } while (flag != true);
                        break;
                    case "7":
                        do {
                            System.out.println("Please enter your email :");
                            email = sc.nextLine().trim();
                            if (regexFurama.regexEmail(email)) {
                                flag = true;
                            } else {
                                System.out.println("you enter fault Please re-enter :");
                                flag = false;
                            }
                        } while (flag != true);
                        break;
                    case "8":
                        do {
                            System.out.println("1 .Secondary,\n" +
                                    "2. college,\n" +
                                    "3. university,\n" +
                                    "4. graduatedUniversity\n" +
                                    "5. Exit");
                            switch (sc.nextLine().trim()) {
                                case "1":
                                    levelEducation = ELevelEducation.Secondary;
                                    flag = false;
                                    break;
                                case "2":
                                    levelEducation = ELevelEducation.college;
                                    flag = false;
                                    break;
                                case "3":
                                    levelEducation = ELevelEducation.university;
                                    flag = false;
                                    break;
                                case "4":
                                    levelEducation = ELevelEducation.graduatedUniversity;
                                    flag = false;
                                    break;
                                case "5":
                                    flag = true;
                                    break;
                                default:
                                    System.out.println("Please re-enter your choice :");
                            }
                        } while (flag != true);
                        break;
                    case "9":
                        do {
                            System.out.println("1. receptionist,\n" +
                                    "2. serve,\n" +
                                    "3. expert,\n" +
                                    "4. monitor,\n" +
                                    "5. manage,\n" +
                                    "6. director\n" +
                                    "7. exit");
                            switch (sc.nextLine().trim()) {
                                case "1":
                                    levelPosition = ELevelPosition.receptionist;
                                    flag = false;
                                    break;
                                case "2":
                                    levelPosition = ELevelPosition.serve;
                                    flag = false;
                                    break;
                                case "3":
                                    levelPosition = ELevelPosition.expert;
                                    flag = false;
                                    break;
                                case "4":
                                    levelPosition = ELevelPosition.monitor;
                                    flag = false;
                                    break;
                                case "5":
                                    levelPosition = ELevelPosition.manage;
                                    flag = false;
                                    break;
                                case "6":
                                    levelPosition = ELevelPosition.director;
                                    flag = false;
                                    break;
                                case "7":
                                    flag = true;
                                    break;
                                default:
                                    System.out.println("Please re-enter your choice :");
                            }
                        } while (flag != true);
                        break;
                    case "10":
                        do {
                            System.out.println("Enter your salary :");
                            salary = sc.nextLine().trim();
                            if (regexFurama.regexSalary(salary)) {
                                flag = true;
                            } else {
                                System.out.println("Fault enter please re-enter :");
                                flag = false;
                            }
                        } while (flag != true);
                        break;
                    case "11":
                        flag = false;
                        break;
                }
            } while (flag == true);
            employeeRepository.edit(new Employee(codeEmployee, name, birthOfDay, gender, id, numberOfPhone
                    , email, levelEducation, levelPosition, Double.parseDouble(salary)));
        } else {
            System.out.println("Don't find employee :");
        }
    }
}
