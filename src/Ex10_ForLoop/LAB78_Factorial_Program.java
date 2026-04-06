package Ex10_ForLoop;
import java.util.Scanner;
public class LAB78_Factorial_Program {
    public static void main(String[] args) {
        System.out.println("Here is the Factorial program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the positive number to get output");

        int factorial = 1;

        if (scanner.hasNextInt()){
            int n = scanner.nextInt();
            System.out.println(n);
            for (int i = 1; i <=n; i++) {
                factorial = factorial*i;
            }
            System.out.println("Factorial is =>" + factorial);
        }
        else {
            System.out.println("Please Enter the valid value");
        }
        scanner.close();
    }
}