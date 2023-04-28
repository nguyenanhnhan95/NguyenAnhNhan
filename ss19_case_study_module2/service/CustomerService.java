package ss19_case_study_module2.service;

import ss19_case_study_module2.model.Customer;
import ss19_case_study_module2.model.Employee;
import ss19_case_study_module2.repository.CustomerRepository;
import ss19_case_study_module2.utils.ELevelCustomer;
import ss19_case_study_module2.utils.ELevelEducation;
import ss19_case_study_module2.utils.ELevelPosition;
import ss19_case_study_module2.utils.RegexFurama;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private RegexFurama regexFurama = new RegexFurama();
    private Scanner sc = new Scanner(System.in);
    private CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void add() {
        String codeCustomer = null;
        String name = null;
        String birthOfDayStr;
        LocalDate birthOfDay = null;
        String id = null;
        String email = null;
        String numberOfPhone = null;
        String adressCustomer = null;
        String gender = null;
        ELevelCustomer levelCustomer = null;
        int count = 0;
        do {
//            public Customer(String code, String name, LocalDate dayOfBirth, String gender, String id, String numberPhone, String email, ELevelCustomer levelCustomer, String addressCustomer) {
//                super(code, name, dayOfBirth, gender, id, numberPhone, email)
            switch (count) {
                case 0:
                    System.out.println("Enter code customer :");
                    codeCustomer = sc.nextLine().trim();
                    if (regexFurama.regexCodeCustomer(codeCustomer)) {
                        ++count;
                    } else {
                        System.err.println("Please re-enter code customer :");
                    }
                    break;
                case 1:
                    System.out.println("Enter name customer :");
                    name = sc.nextLine().trim();
                    if (regexFurama.regexName(name)) {
                        ++count;
                    } else {
                        System.err.println("Please re-enter name customer");
                    }
                    break;
                case 2:
                    System.out.println("Enter customer's birthofday YYYY-MM-DD:");
                    birthOfDayStr = sc.nextLine().trim();
                    if (regexFurama.regexYear(birthOfDayStr)) {
                        birthOfDay = LocalDate.parse(birthOfDayStr);
                        if ((Period.between(birthOfDay, LocalDate.now()).getYears()) >= 18) {
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
                    if (customerRepository.find(id) != -1) {
                        System.err.println("Customer existing");
                        count = 9;
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
                    System.out.println("1. Diamond,\n" +
                            "2. Platinum,\n" +
                            "3. Gold,\n" +
                            "4. Silver,\n" +
                            "5. Member,\n");
                    switch (sc.nextLine().trim()) {
                        case "1":
                            levelCustomer = ELevelCustomer.Diamond;
                            ++count;
                            break;
                        case "2":
                            levelCustomer = ELevelCustomer.Platinum;
                            ++count;
                            break;
                        case "3":
                            levelCustomer = ELevelCustomer.Gold;
                            ++count;
                            break;
                        case "4":
                            levelCustomer = ELevelCustomer.Silver;
                            ++count;
                            break;
                        case "5":
                            levelCustomer = ELevelCustomer.Member;
                            ++count;
                            break;
                        default:
                            System.err.println("Please re-enter your choice :");
                    }
                    break;
                case 8:
                    System.out.println("Enter your adress :");
                    adressCustomer = sc.nextLine().trim();
                    if (regexFurama.regexAddress(adressCustomer)) {
                        ++count;
                        customerRepository.add(new Customer(codeCustomer, name, birthOfDay, gender, id, numberOfPhone, email, levelCustomer, adressCustomer));
                    } else {
                        System.err.println("Fault enter please re-enter :");
                    }
                    break;
            }
        } while (count != 9);
    }

    @Override
    public void display() {
        List<Customer> customerList;
        customerList = customerRepository.readFile();
        if (customerList != null) {
            System.out.println("+---------+--------------------+-------------+----------+------------+---------------+" +
                    "--------------------------+--------------------+-------------+");
            System.out.println("| Code    | Name               | Birth       | Gender   | ID         | Phone         |" +
                    " Email                    | Level customer     | Address     |");
            for (Customer e : customerList) {
                System.out.println("+---------+--------------------+-------------+----------+------------+---------------+" +
                        "--------------------------+--------------------+-------------+");
                System.out.printf("|%-9s|%-20s|%-13s|%-10s|%-12s|%-15s|%-26s|%-20s|%-13s|\n",
                        e.getCode(), e.getName(), e.getDayOfBirth(), e.getGender(), e.getId(), e.getNumberPhone(),
                        e.getEmail(), e.getLevelCustomer(), e.getAddressCustomer());
            }
            System.out.println("+---------+--------------------+-------------+----------+------------+---------------+" +
                    "--------------------------+--------------------+-------------+");
        } else {
            System.out.println("Empty");
        }
    }

    @Override
    public void edit() {
        List<Customer> customerList = customerRepository.readFile();
        String codeCustomer = null;
        String name = null;
        String birthOfDayStr;
        LocalDate birthOfDay = null;
        String id = null;
        String email = null;
        String numberOfPhone = null;
        String address = null;
        String gender = null;
        ELevelCustomer levelCustomer;
        String idEmployee;
        int index;
        boolean flag = true;
        String choice;
        String idCustomer;
        System.out.println("Please enter customer's id :");
        idCustomer = sc.nextLine().trim();
        index = customerRepository.find(idCustomer);
        if (index != -1) {
            do {
                System.out.println("1. Code \n" +
                        "2. name \n " +
                        "3. dayOfBirth\n" +
                        "4. gender\n " +
                        "5. id\n " +
                        "6. numberPhone\n" +
                        "7. email\n" +
                        "8. levelCustomer\n" +
                        "9. double address\n" +
                        "10. Exit\n" +
                        "Please enter your choice");
                choice = sc.nextLine().trim();
                switch (choice) {
                    case "1":
                        do {
                            System.out.println("Edit code customer :");
                            codeCustomer = sc.nextLine().trim();
                            if (regexFurama.regexCodeCustomer(codeCustomer)) {
                                customerList.get(index).setCode(codeCustomer);
                                flag = true;
                            } else {
                                System.out.println("Please re-enter code customer :");
                                flag = false;
                            }
                        } while (flag != true);
                        break;
                    case "2":
                        do {
                            System.out.println("Edit name customer :");
                            name = sc.nextLine().trim();
                            if (regexFurama.regexName(name)) {
                                customerList.get(index).setName(name);
                                flag = true;
                            } else {
                                System.out.println("Please re-enter name customer");
                                flag = false;
                            }
                        } while (flag != true);
                        break;
                    case "3":
                        do {
                            System.out.println("Edit customer's birthofday YYYY-MM-DD:");
                            birthOfDayStr = sc.nextLine().trim();
                            if (regexFurama.regexYear(birthOfDayStr)) {
                                birthOfDay = LocalDate.parse(birthOfDayStr);
                                if ((Period.between(birthOfDay, LocalDate.now()).getYears()) > 18) {
                                    customerList.get(index).setDayOfBirth(birthOfDay);
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
                        if (customerList.get(index).getGender().equals("Female")) {
                            customerList.get(index).setGender("Male");
                        } else {
                            customerList.get(index).setGender("Female");
                        }
                        break;
                    case "5":
                        do {
                            System.out.println("Please enter your ID to Edit:");
                            id = sc.nextLine().trim();
                            if (regexFurama.regexID(id)) {
                                customerList.get(index).setId(id);
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
                                customerList.get(index).setNumberPhone(numberOfPhone);
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
                                customerList.get(index).setEmail(email);
                                flag = true;
                            } else {
                                System.out.println("you enter fault Please re-enter :");
                                flag = false;
                            }
                        } while (flag != true);
                        break;
                    case "8":
                        do {
                            System.out.println("1. Diamond,\n" +
                                    "2. Platinum,\n" +
                                    "3. Gold,\n" +
                                    "4. Silver,\n" +
                                    "5. Member,\n" +
                                    "6. Exit \n");
                            switch (sc.nextLine().trim()) {
                                case "1":
                                    customerList.get(index).setLevelCustomer(ELevelCustomer.Diamond);
                                    flag = false;
                                    break;
                                case "2":
                                    customerList.get(index).setLevelCustomer(ELevelCustomer.Platinum);
                                    flag = false;
                                    break;
                                case "3":
                                    customerList.get(index).setLevelCustomer(ELevelCustomer.Gold);
                                    flag = false;
                                    break;
                                case "4":
                                    customerList.get(index).setLevelCustomer(ELevelCustomer.Silver);
                                    flag = false;
                                    break;
                                case "5":
                                    customerList.get(index).setLevelCustomer(ELevelCustomer.Member);
                                    flag = false;
                                    break;
                                case "6":
                                    flag = true;
                                    break;
                                default:
                                    System.out.println("Please re-enter your choice :");
                            }
                        } while (flag != true);
                        break;
                    case "9":
                        do {
                            System.out.println("Enter your address :");
                            address = sc.nextLine().trim();
                            if (regexFurama.regexSalary(address)) {
                                customerList.get(index).setAddressCustomer(address);
                                flag = true;
                            } else {
                                System.out.println("Fault enter please re-enter :");
                                flag = false;
                            }
                        } while (flag != true);
                        break;
                    case "10":
                        flag = false;
                        break;
                }
            } while (flag == true);
            customerRepository.writeFile(customerList);
        } else {
            System.out.println("Don't find employee :");
        }
    }
}
