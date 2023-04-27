package ss19_case_study_module2.repository;

import ss15_io_text_file.thuc_hanh.sum_number.ReadAndWriteFile;
import ss19_case_study_module2.model.Employee;
import ss19_case_study_module2.utils.ReadWriteFileEmployee;

import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private ReadWriteFileEmployee readWriteFileEmployee = new ReadWriteFileEmployee();
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
        return readWriteFileEmployee.readFile();
    }

    @Override
    public void writeFile(List<Employee> employeeList) {
        readWriteFileEmployee.writeFile(employeeList);
    }


    @Override
    public Employee edit() {
        return null;
    }

    @Override
    public void add() {

    }
}
