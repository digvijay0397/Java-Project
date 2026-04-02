package Ex05_TypeCasting;

public class TypeCasting_0 {
    public static void main (String[] args){
      //int b = 210;
      //int a = b; //valid syntax
       // int a1 = (byte)b;
      //  System.out.println(a1);

        int cource = 100;
        float NSRT_Tax = 18.45F;
       // int total = cource + NSRT_Tax;  //Narrowing - Implicit.
       // int total = cource + (int)NSRT_Tax;  //Narrowing - Explicit.

        float total2 = cource + NSRT_Tax;  //widening - Implicit.
        float total3 = (float) cource + NSRT_Tax; //widening - Explicit.
        System.out.println(total2);



    }
}
