package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Contraction;

import java.util.List;

public class ContractRepository implements IContactRepository{
    @Override
    public int find(String id) {
        return 0;
    }

    @Override
    public List<Contraction> readFile() {
        return null;
    }

    @Override
    public void writeFile(List<Contraction> contractionList) {

    }


    @Override
    public void add(Contraction contraction) {

    }

    @Override
    public void edit(Contraction contraction) {

    }
}
