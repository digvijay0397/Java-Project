package Ex15_StringBuffer_Builder_String;

public class LAB109_String_Function {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Digvijay");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());

    }
}
