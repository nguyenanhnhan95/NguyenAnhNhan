package ss19_case_study_module2.repository;
import ss19_case_study_module2.model.Customer;
import ss19_case_study_module2.model.Employee;
import ss19_case_study_module2.utils.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    private ReadWriteFile readWriteFile = new ReadWriteFile();
    private List<Customer> customerList;
    private static final String PATH_CUSTOMER="D:\\Codegym\\Module2\\src\\ss19_case_study_module2\\data\\customer.csv";
    @Override
    public int find(String id) {
        customerList=new ArrayList<>();
        customerList = getList();
        int size = customerList.size();
        for (int i = 0; i < size; i++) {
            if (customerList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Customer> getList() {
        List<String> customerStrList = readWriteFile.readFile(PATH_CUSTOMER);
        customerList=new ArrayList<>();
        String[] arrayA;
        for (String s : customerStrList) {
            arrayA = s.split(",");
            customerList.add(new Customer(arrayA[0], arrayA[1], LocalDate.parse(arrayA[2]), arrayA[3], arrayA[4],
                    arrayA[5], arrayA[6], ELevelCustomer.valueOf(arrayA[7]),arrayA[8]));
        }
        return customerList;
    }

    @Override
    public void add(Customer customer,boolean option) {
        readWriteFile.writeFile(customer.getInForCsv(),PATH_CUSTOMER,true);
    }
    @Override
    public void edit(Customer customer) {
        String customerStr="";
        customerList=new ArrayList<>();
        int index= find(customer.getId());
        customerList=getList();
        customerList.remove(index);
        customerList.add(index,customer);
        for (Customer c:customerList) {
            customerStr+=c.getInForCsv()+"\n";
        }
        readWriteFile.writeFile(customerStr,PATH_CUSTOMER,false);
    }
}
