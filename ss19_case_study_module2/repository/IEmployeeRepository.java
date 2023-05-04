package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {
    List<Employee> getList();
}
