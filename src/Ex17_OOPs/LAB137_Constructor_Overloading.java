package Ex17_OOPs;

public class LAB137_Constructor_Overloading {
    public static void main(String[] args) {

        Baby b1 = new Baby ();
        Baby b2 = new Baby ("Digvijay");
        Baby b3 = new Baby ("Digvijay","10k");





    }
}

class Baby{

    String name;

    Baby() {
        System.out.println("Default");
    }
    Baby(String name) {
        System.out.println("PC - name");
    }
    Baby (String name, String money) {
        System.out.println("PC - name.age");
    }
}
