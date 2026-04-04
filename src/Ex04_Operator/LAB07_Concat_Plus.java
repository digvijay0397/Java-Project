package Ex04_Operator;

public class LAB07_Concat_Plus {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        System.out.println(a + b);  //addition of two numbers

        String first_name = "Digvijay";
        String last_name = "Singh";
        System.out.println(first_name + last_name);  //concatenation of two strings
        System.out.println(a + b + first_name + " " + last_name );  //concatenation of two strings with space in between
        System.out.println(first_name + " " + last_name + a + b);  //concatenation of two strings with space in between and addition of two numbers at the end
        System.out.println(first_name + last_name + (a + b));  //concatenation of two strings with addition of two numbers at the end

   



    }
    
}
