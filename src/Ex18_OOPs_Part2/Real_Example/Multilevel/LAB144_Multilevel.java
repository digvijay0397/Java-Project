package Ex18_OOPs_Part2.Real_Example.Multilevel;

public class LAB144_Multilevel {
    public static void main(String[] args) {

         Son Digvijay = new Son();
         Digvijay.home();
         Digvijay.gf();
         Digvijay.bhk3();
         Digvijay.extraMoney();


         Father f = new Father();
         f.home();
         f.gf();
//         f.bhk3();
         f.extraMoney();

         Grandfather g = new Grandfather();
         g.home();
         g.gf();
//         g.extraMoney();


        // Dynamic Dispatch

        Grandfather g1 = new Son();
        Father f1 = new Son();

    }
}
