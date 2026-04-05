package Ex08_If_Condition;

import java.util.Scanner;

public class LAB50_Multiple_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name1\n");
    int name1 = scanner.nextInt();

    System.out.println("Enter your name2\n");
    int name2 = scanner.nextInt();

    System.out.println("Enter your name3\n");
    int name3 = scanner.nextInt();

    System.out.println(name2 + name3 + name1);
    }
}
