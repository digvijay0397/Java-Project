package Ex08_If_Condition;

import java.util.Scanner;

public class LAB49_IF_ELSEIF_ELSE_Scannar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String name = scanner.next();

        if (age > 20) {
            System.out.println("You are eligible to earn money.");
        } else if ( age <20) {
            System.out.println("You are not eligible to earn money.");

        }else  {
            System.out.println("You are earning money.");
        }
        scanner.close();
    }
}