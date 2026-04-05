package Ex08_If_Condition;

public class LAB43_if {
    public static void main (String[] args) {
        System.out.println("Entering the age by using the CLI Method\n");
        int age = Integer.parseInt(args[0]);
        if (age > 18) {
            System.out.println("You are eligible to vote");
        } else{
            System.out.println("You are not eligible to vote");
        }

    }
}
