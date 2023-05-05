package ss19_case_study_module2.repository;

import ss19_case_study_module2.model.Booking;
import ss19_case_study_module2.model.Contraction;
import ss19_case_study_module2.utils.ReadWriteFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ContractRepository implements IContractRepository {
    private static final String PATH_CONTRACT = "D:\\Codegym\\Module2\\src\\ss19_case_study_module2\\data\\contract.csv";
    private Queue<Booking> queueBooking;
    private BookingRepository bookingRepository = new BookingRepository();
    private ReadWriteFile readWriteFile = new ReadWriteFile();
    private List<Booking> listBooking;
    private List<Contraction> contractionList;


    @Override
    public int find(String id) {
        contractionList = new ArrayList<>();
        contractionList = getList();
        int size = contractionList.size();
        for (int i = 0; i < size; i++) {
            if (contractionList.get(i).getCodeContract().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(Contraction contraction, boolean option) {
        readWriteFile.writeFile(contraction.getInForCsv(), PATH_CONTRACT, option);
    }

    @Override
    public void edit(Contraction contraction) {
        String listContract = "";
        contractionList = new ArrayList<>();
        contractionList = getList();
        int index = find(contraction.getCodeContract());
        contractionList.set(index, contraction);
        for (Contraction c : contractionList) {
            listContract += c.getInForCsv() + "\n";
        }
        readWriteFile.writeFile(listContract, PATH_CONTRACT, false);
    }

    @Override
    public Queue<Booking> getQueue() {
        queueBooking = new LinkedList<>();
        contractionList = new ArrayList<>();
        contractionList = getList();
        listBooking = new ArrayList<>();
        listBooking = bookingRepository.getList();
        if (contractionList.size() == 0) {
            queueBooking.addAll(listBooking);
        }
        for (Booking b : listBooking) {
            for (Contraction c : contractionList) {
                if (!b.getCodeBook().equals(c.getCodeBook())) {
                    queueBooking.add(b);
                }
            }
        }
        return queueBooking;
    }

    @Override
    public List<Contraction> getList() {
        List<Contraction> contractionList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        stringList = readWriteFile.readFile(PATH_CONTRACT);
        String[] arrayA;
        for (String s : stringList) {
            arrayA = s.split(",");
            contractionList.add(new Contraction(arrayA[0], arrayA[1], Double.parseDouble(arrayA[2]), Double.parseDouble(arrayA[3])));
        }
        return contractionList;
    }
}
