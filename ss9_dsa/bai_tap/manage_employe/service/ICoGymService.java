package ss9_dsa.bai_tap.manage_employe.service;

import java.util.List;

public interface ICoGymService<E> {
    List<E> getList();

    void add();

    String delete();

    void displayList();
}
