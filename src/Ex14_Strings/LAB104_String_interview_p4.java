package Ex14_Strings;

public class LAB104_String_interview_p4 {
    public static void main(String[] args) {

        String s1 ="Digvijay";
        String s4 ="Digvijay";


        String s2 = new String("Digvijay");
        String s3 = new String("Digvijay");
        String s5 = new String("digvijay");


        // == Comparision Operator -> String Check the ref in String

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);


        //equals (content) -> Value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));


        //equalIgnorecase -> digvijay, Digvijay, DIGVIJAY, DigVIJAY
        //== -> check for the reference
        // equals operator assignment the value


    }
}
