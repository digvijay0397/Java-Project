package Ex15_StringBuffer_Builder_String;

public class LAB110_StringBuilder_VS_StringBuffer {
    public static void main(String[] args) {
              //String use- 90% Times
        String s0 = "Digvijay";
        String s1 = new String("Digvijay");

        //Less than 10% used.
        StringBuffer stringBuffer = new StringBuffer("Digvijay");
        StringBuilder stringBuilder = new StringBuilder("Digvijay");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());


    }
}
