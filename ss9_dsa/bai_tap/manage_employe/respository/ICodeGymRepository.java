package ss9_dsa.bai_tap.manage_employe.respository;

import ss9_dsa.bai_tap.manage_employe.model.Study;

import java.util.ArrayList;
import java.util.List;

public interface ICodeGymRepository<E> {
    List<E> getList();

    void delete(int e);

    void add(E e);
}
