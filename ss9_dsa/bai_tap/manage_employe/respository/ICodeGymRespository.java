package ss9_dsa.bai_tap.manage_employe.respository;

import java.util.List;

public interface ICodeGymRespository<E> {
    List<E> getList();

    void delete(int e);

    void add(E e);
}
