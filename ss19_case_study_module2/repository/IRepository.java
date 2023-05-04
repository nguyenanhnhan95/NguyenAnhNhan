package ss19_case_study_module2.repository;

import java.util.List;

public interface IRepository <E>{
    int find(String id);
    void add(E e,boolean option);
    void edit(E e);
}
