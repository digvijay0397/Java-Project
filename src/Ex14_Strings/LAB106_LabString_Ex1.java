package Ex14_Strings;

public class LAB106_LabString_Ex1 {
    public static void main(String[] args) {
        String s = "JAVA";
        char c = s.charAt(1);
        System.out.println(c);

        int result = "abc".compareTo("ABC"); // 97 - 65
        int result1 = "abc".compareTo("abc"); // 65 -65
        int result2 = "ABC".compareTo("abc"); //65 - 97
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);


        int idx = "Java".indexOf("a"); //1
        System.out.println(idx);
        //JAVA -> J = 0, A =1, V = 2, A = 3

        int idx2 ="JAVA".lastIndexOf("A"); //3
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String s11 = String.join("*", "Java", "Python");
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o'); //"Jova"
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); //True
        System.out.println(b1);

        String b2 = "Java".concat("Mava");
        System.out.println(b2);
         }
}
