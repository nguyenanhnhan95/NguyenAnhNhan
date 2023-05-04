package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer>{
    List<Customer> getList();
}
