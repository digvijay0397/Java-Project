package Ex18_OOPs_Part2.Real_Example.Single_Inheritance;

public class LAB142_SI {
    public static void main(String[] args) {

        Son Digvijay = new Son();
        System.out.println(Digvijay.gold_bar);
        Digvijay.bhk2();
        Digvijay.bhk3();


        Father f = new Father();
        System.out.println(f.gold_bar);
        f.bhk2();
//        f.bhk3();
    }
}
