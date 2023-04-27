package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Employee;
import ss19_case_study_module2.utils.ELevelEducation;
import ss19_case_study_module2.utils.ELevelPosition;
import ss19_case_study_module2.utils.ReadWriteFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String PATH_EMPLOYEE = "D:\\Codegym\\Module2\\src\\ss19_case_study_module2\\data\\employee.csv";
    private ReadWriteFile readWriteFileEmployee = new ReadWriteFile();
    private List<Employee> employeeList;

    @Override
    public int find(String id) {
        employeeList = readFile();
        int size = employeeList.size();
        for (int i = 0; i < size; i++) {
            if (employeeList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Employee> readFile() {
        List<String> employeeStrList = readWriteFileEmployee.readFile(PATH_EMPLOYEE);
        employeeList = new ArrayList<>();
        String[] arrayA;
        for (String s : employeeStrList) {
            arrayA = s.split(",");
            employeeList.add(new Employee(arrayA[0], arrayA[1], LocalDate.parse(arrayA[2]), arrayA[3], arrayA[4],
                    arrayA[5], arrayA[6], ELevelEducation.valueOf(arrayA[7]), ELevelPosition.valueOf(arrayA[8]), Double.parseDouble(arrayA[9])));
        }
        return employeeList;
    }

    @Override
    public void writeFile(List<Employee> employeeList) {
        String employeeStr = "";
        for (Employee e : employeeList) {
            employeeStr += e.getInForCsv() + "\n";
        }
        readWriteFileEmployee.writeFile(employeeStr, PATH_EMPLOYEE);
    }


    @Override
    public Employee edit() {
        return null;
    }

    @Override
    public void add() {

    }
}
