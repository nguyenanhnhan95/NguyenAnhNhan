package ss4_class_object.bai_tap.fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fanOne = new Fan(Fan.SLOW,true, "yellow", 5);
        Fan fanTwo = new Fan(Fan.SLOW,false, "yellow", 5);
        System.out.println(fanOne.toString());
        System.out.println(fanTwo.toString());
    }
}
