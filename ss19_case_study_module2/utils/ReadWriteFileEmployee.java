package ss19_case_study_module2.utils;

import ss19_case_study_module2.model.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileEmployee {
    private static final String PATH_EMPLOYEE = "D:\\Codegym\\Module2\\src\\ss19_case_study_module2\\data\\employee.csv";
    ;

    public void writeFile(Employee employee) {
        FileWriter fw = null;
        BufferedWriter br = null;
        try {
            fw = new FileWriter(new File(PATH_EMPLOYEE));
            br = new BufferedWriter(fw);
            br.write(employee.getInForCsv());
            br.newLine();
            br.flush();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    public Employee(String code, String name, LocalDate dayOfBirth, String gender, String id, String numberPhone,
//                    String email, ELevelEducation levelEducation, ELevelPosition levelPosition, double salary) {
    public List<Employee> readFile() {
        FileReader fr = null;
        BufferedReader br = null;
        List<Employee> employeeList = new ArrayList<>();
        try {
            fr = new FileReader(new File(PATH_EMPLOYEE));
            br = new BufferedReader(fr);
            String line = "";
            String[] arrayA;
            while ((line = br.readLine()) != null && !line.equals("")) {
                arrayA = line.split(",");
                employeeList.add(new Employee(arrayA[0], arrayA[1], LocalDate.parse(arrayA[2]), arrayA[3], arrayA[4],
                        arrayA[5], arrayA[6], ELevelEducation.valueOf(arrayA[7]), ELevelPosition.valueOf(arrayA[8]), Double.parseDouble(arrayA[9])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
