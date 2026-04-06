package Ex14_Strings;

public class LAB97_String_Immutable {
    public static void main(String[] args) {
        String name = "Digvijay";
        boolean result = name.contains("D");
        System.out.println(result);

        // Strings are immutable in nature.

        name.toUpperCase();
        System.out.println(name);
    }
}
