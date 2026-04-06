package Ex13_Functions;

public class LAB94_UD_All_Examples {
    public static void main(String[] args) {

        //1. Without Parameters and Without Return Type.
        //2. Without Parameters but With Return Type
        //3. With Parameters and Without Return Type - **main**
        //4. With Parameters and With Return Type.

        //1. Without Argument/Parameters and Without Return Type.
        
        wop_wor_great() ;

        //2. Without Parameters but With Return Type
        String msg = wop_wr_greet_2();

        //3. With Parameters and Without Return Type - **main**
        greet_with_details("digvijay",50,60);


        //4. With Parameters and With Return Type.
        int sum = sum_of_two_numbers(3,4);
    }

    private static int sum_of_two_numbers(int i, int i1) {
        return i +i1;
    }

    private static void greet_with_details(String digvijay, int i, int i1) {
    }

    private static String wop_wr_greet_2() {
        return "null";
    }

    static void wop_wor_great() {
    }
}
