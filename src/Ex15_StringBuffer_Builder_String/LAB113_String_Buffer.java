package Ex15_StringBuffer_Builder_String;

public class LAB113_String_Buffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Digvijay");
        stringBuffer.append("Singh");
        System.out.println(stringBuffer);

        stringBuffer.replace(0,3,"Hello");
        System.out.println(stringBuffer);

    }
}
