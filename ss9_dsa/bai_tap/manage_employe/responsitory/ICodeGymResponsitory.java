package ss9_dsa.bai_tap.manage_employe.responsitory;

import java.util.List;

public interface ICodeGymResponsitory<E> {
    List<E> getList();

    void delete(int e);

    void add(E e);
}
