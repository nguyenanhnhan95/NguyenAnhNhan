package ss19_case_study_module2.repository;

import java.util.List;

public interface IRepository <E>{
    int find(String id);
    List<E> readFile();
    void writeFile(List<E> e);
    E edit();
    void add();
}
