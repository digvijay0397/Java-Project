package Ex14_Strings;

public class LAB108_LabStringEx3 {
    public static void main(String[] args) {
        String s = "DigVijay".substring(3);
        System.out.println(s);

//        "unhappy".substring(2) returns "happy"
//        "Harbison".substring(3) returns "bison"
//        "emptiness".substring(9) returns "" (an empty string)

        char[] arr = "Java".toCharArray();
        System.out.println(arr);

        boolean b = " ".isBlank();
        System.out.println(b);

        boolean b1 = "".isEmpty();
        System.out.println(b1);

        String s2 = "DS".repeat(4);
        System.out.println(s2);

        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11);

        long count = "a\nb\nc\na".lines().count();
        System.out.println(count);

    }
}
