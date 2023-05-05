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
        employeeList = getList();
        int size = employeeList.size();
        for (int i = 0; i < size; i++) {
            if (employeeList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Employee> getList() {
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
    public void add(Employee employee,boolean option) {
        readWriteFileEmployee.writeFile(employee.getInForCsv(), PATH_EMPLOYEE,option);
    }

    @Override
    public void edit(Employee employee) {
        String listEmployee="";
        employeeList = new ArrayList<>();
        employeeList = getList();
        int index = find(employee.getId());
        employeeList.add(index, employee);
        for (Employee e:employeeList) {
            listEmployee+=e.getInForCsv()+"\n";
        }
        readWriteFileEmployee.writeFile(listEmployee,PATH_EMPLOYEE,false);
    }
}
