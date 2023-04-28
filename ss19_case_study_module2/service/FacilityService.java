package ss19_case_study_module2.service;

import ss19_case_study_module2.model.Facility;
import ss19_case_study_module2.utils.ERentalType;
import ss19_case_study_module2.utils.RegexFurama;

import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private Scanner sc = new Scanner(System.in);
    private RegexFurama regexFurama = new RegexFurama();
    @Override
    public void add() {
    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void addHouse() {

    }

    @Override
    public void addVila() {

    }

    @Override
    public void addRoom() {
//        public Room(String idService, String nameService, double areUse, double priceTax, int numberPerson, ERentalType typeRental, int voucher) {
//            super(idService, nameService, areUse, priceTax, numberPerson, typeRental);

        String codeService=null;
        String nameService=null;
        double areUse ;
        double priceRental;
        int numberOf;
        ERentalType typeRental=null;
        String voucher=null;
        int count=0;
        do {
            switch (count){
                case 0:
                    System.out.println("Please enter code service");
                    codeService=sc.nextLine().trim();
                    if(regexFurama.regexCodeService(codeService)){
                        ++count;
                    }else {
                        System.err.println("You enter fault :");
                    }
                    break;
                case 1:
                    System.out.println("Please enter name service :");
                    nameService=sc.nextLine().trim();
                    if(regexFurama.regexCodeRoom(nameService)){
                        ++count;
                    }
                    else {
                        System.err.println("You enter fault :");
                    }
                    break;
                case 2:
                    System.out.println("Please room's area :");
                    areUse=Double.parseDouble(sc.nextLine());
//                    if(areUse<)
            }
        }while(count==0);
    }
}
