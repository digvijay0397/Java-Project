package Ex04_Operator;

public class LAB04_All_Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
       boolean a1 = true;
       
       int a = 10;
       int b = 20;
         System.out.println(a + b);  //30
            System.out.println(a > b);  //-10
            System.out.println(a >= b);  //true
            System.out.println(a == b); //false
            System.out.println(a != b); //true

            //compound assignment operator
          int age = 10;
            a += 10; //a = a + 10 -> 20
            a -=10; //a = a - 10 -> 10
            a *= 10; //a = a * 10 -> 100
            a /= 10; //a = a / 10 -> 10
            System.out.println(age);
    }
    
}
