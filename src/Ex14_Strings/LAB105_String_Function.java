package Ex14_Strings;

public class LAB105_String_Function {
    public static void main(String[] args) {

//        String s1 ="Hello";
//        String s2 = new String("Hello");

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
//        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
//equalIgnorecase -> digvijay, Digvijay, DIGVIJAY, DigVIJAY
//== -> check for the reference
// equals operator assignment the value