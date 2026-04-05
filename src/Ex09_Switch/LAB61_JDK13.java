package Ex09_Switch;

public class LAB61_JDK13 {
    public static void main(String[] args) {
        //in JDK >13
        int itemcode = 005;
        switch (itemcode) {

            case 001, 003, 005:
                System.out.println("RCB lifts the IPL TROPHY");
                break;
            case 002, 004, 006:
                System.out.println("RCB wins all the matches");
                break;
            default:
                System.out.println("RCB cant loose any match");
        }
        }
}
