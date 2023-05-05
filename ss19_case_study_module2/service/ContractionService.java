package ss19_case_study_module2.service;

import ss19_case_study_module2.model.Booking;
import ss19_case_study_module2.model.Contraction;
import ss19_case_study_module2.repository.ContractRepository;
import ss19_case_study_module2.utils.RegexFurama;

import java.util.*;

public class ContractionService implements IContractService {
    private ContractRepository contractRepository = new ContractRepository();
    private Scanner sc = new Scanner(System.in);
    private Queue<Booking> bookingQueue;
    private RegexFurama regexFurama = new RegexFurama();
    private List<Contraction> contractionList;

    @Override
    public void display() {
        contractionList = new ArrayList<>();
        contractionList = contractRepository.getList();
        System.out.println("+--------------+--------------------+--------------------+--------------------+");

        System.out.println("|     Code     |     Code Book      |      Deposit       |      Pay           |");
        for (Contraction c : contractionList) {
            System.out.println("+--------------+--------------------+--------------------+--------------------+");
            System.out.printf("|%-14s|%-20s|%20s|%20s|\n",
                    c.getCodeContract(), c.getCodeContract(), c.getNumberOfDeposit(), c.getTotalOfPay());
        }
        System.out.println("+--------------+--------------------+--------------------+--------------------+");
    }

    @Override
    public void edit() {
        String codeContraction;
        String moneyDeposit=null;
        String moneyPay=null;
        contractionList=new ArrayList<>();
        contractionList=contractRepository.getList();
        System.out.println("Enter code contract to change :");
        codeContraction = sc.nextLine().trim();
        int index = contractRepository.find(codeContraction);
        Contraction contraction = contractionList.get(index);
        boolean flag=true;
        if(index!=-1){
        do {
            System.out.println("1. Deposit \n" +
                    "2. Pay\n" +
                    "3. Exit \n" +
                    "Enter choice");
            switch (sc.nextLine().trim()){
                case "1":
                    do {
                        System.out.println("Enter deposit :");
                        moneyDeposit = sc.nextLine();
                    }while (!regexFurama.regexNumberDouble(moneyDeposit));
                    contraction.setNumberOfDeposit(Double.parseDouble(moneyDeposit));
                        break;
                case "2":
                    do {
                        System.out.println("Enter Pay :");
                        moneyPay = sc.nextLine();
                    }while (!regexFurama.regexNumberDouble(moneyPay));
                    contraction.setTotalOfPay(Double.parseDouble(moneyPay));
                    break;
                case "3":
                    flag=false;
                    break;
                default:
                    System.out.println("You enter choice wrong");
            }
        }while (flag);
        contractRepository.edit(contraction);
    }else {
            System.out.println("You enter code don't existing :");
        }
}

@Override
public void add(){
        bookingQueue=new LinkedList<>();
        bookingQueue=contractRepository.getQueue();
        String codeContract;
        String moneyDeposit;
        String totalPayment;
        int count;
        if(bookingQueue.size()!=0){
        Booking b=bookingQueue.remove();
        codeContract=null;
        moneyDeposit=null;
        totalPayment=null;
        count=0;
        if(regexFurama.regexCodeRoom(b.getIdService())){
        do{
        switch(count){
        case 0:
        System.out.println("Enter code contract :");
        codeContract=sc.nextLine().trim();
        if(codeContract.matches("^CT-[0-9]{4}$")){
        ++count;
        }else{
        System.err.println("You enter fault :");
        }
        break;
        case 1:
        System.out.println("Enter number of deposit money :");
        moneyDeposit=sc.nextLine().trim();
        if(regexFurama.regexNumberDouble(moneyDeposit)){
        ++count;
        }else{
        System.err.println("You enter fault :");
        }
        break;
        case 2:
        System.out.println("Enter total payment :");
        totalPayment=sc.nextLine().trim();
        if(regexFurama.regexNumberDouble(totalPayment)){
        ++count;
        }else{
        System.err.println("You enter fault :");
        }
        break;
        case 3:
//                            public Contraction(String codeContract, String codeBook, double numberOfDeposit, double totalOfPay) {
        contractRepository.add(new Contraction(codeContract,b.getCodeBook(),
        Double.parseDouble(moneyDeposit),Double.parseDouble(totalPayment)),true);
        bookingQueue.remove();
        ++count;
        }
        }while(count!=4);
        }
        if(regexFurama.regexCodeVilla(b.getIdService())){
        do{
        switch(count){
        case 0:
        System.out.println("Enter code contract :");
        codeContract=sc.nextLine().trim();
        if(codeContract.matches("^CT-[0-9]{4}$")){
        ++count;
        }else{
        System.err.println("You enter fault :");
        }
        break;
        case 1:
        System.out.println("Enter number of deposit money :");
        moneyDeposit=sc.nextLine().trim();
        if(regexFurama.regexNumberDouble(moneyDeposit)){
        ++count;
        }else{
        System.err.println("You enter fault :");
        }
        break;
        case 2:
        System.out.println("Enter total payment :");
        totalPayment=sc.nextLine().trim();
        if(regexFurama.regexNumberDouble(totalPayment)){
        ++count;
        }else{
        System.err.println("You enter fault :");
        }
        break;
        case 3:
//                            public Contraction(String codeContract, String codeBook, double numberOfDeposit, double totalOfPay) {
        contractRepository.add(new Contraction(codeContract,b.getCodeBook(),
        Double.parseDouble(moneyDeposit),Double.parseDouble(totalPayment)),true);
        bookingQueue.remove();
        ++count;
        }
        }while(count!=4);
        }
        if(regexFurama.regexCodeHouse(b.getIdService())){
        do{
        switch(count){
        case 0:
        System.out.println("Enter code contract :");
        codeContract=sc.nextLine().trim();
        if(codeContract.matches("^CT-[0-9]{4}$")){
        ++count;
        }else{
        System.err.println("You enter fault :");
        }
        break;
        case 1:
        System.out.println("Enter number of deposit money :");
        moneyDeposit=sc.nextLine().trim();
        if(regexFurama.regexNumberDouble(moneyDeposit)){
        ++count;
        }else{
        System.err.println("You enter fault :");
        }
        break;
        case 2:
        System.out.println("Enter total payment :");
        totalPayment=sc.nextLine().trim();
        if(regexFurama.regexNumberDouble(totalPayment)){
        ++count;
        }else{
        System.err.println("You enter fault :");
        }
        break;
        case 3:
//                            public Contraction(String codeContract, String codeBook, double numberOfDeposit, double totalOfPay) {
        contractRepository.add(new Contraction(codeContract,b.getCodeBook(),
        Double.parseDouble(moneyDeposit),Double.parseDouble(totalPayment)),true);
        bookingQueue.remove();
        ++count;
        }
        }while(count!=4);
        }
        }else{
        System.out.println("Out of booking :");
        }
        }
        }
