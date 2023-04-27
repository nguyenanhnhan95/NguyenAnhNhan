package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Customer;

import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    @Override
    public int find(String id) {
        return 0;
    }

    @Override
    public List<Customer> readFile() {
        return null;
    }

    @Override
    public void writeFile(List<Customer> customerList) {

    }


    @Override
    public Customer edit() {
        return null;
    }

    @Override
    public void add() {

    }
}
