package ss9_dsa.bai_tap.test.service;
import ss9_dsa.bai_tap.test.responsitory.ITest1;
import ss9_dsa.bai_tap.test.responsitory.ITest2;
public interface ITeacher extends ITest1, ITest2{
        void teach();
        void doSth();
}
