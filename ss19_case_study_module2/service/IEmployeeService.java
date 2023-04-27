package ss19_case_study_module2.service;

import ss19_case_study_module2.model.Employee;

public interface IEmployeeService extends IService<Employee> {
    @Override
    void add();

    @Override
    void display();

    @Override
    void edit();
}
