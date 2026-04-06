package Ex13_Functions;

import java.util.Scanner;

public class LAB93_User_Defined_One {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number a = ");
        int a = scanner.nextInt();
        System.out.println("Enter a number b = ");
        int b = scanner.nextInt();
        int sum = sum_two_numbers(a,b);
        System.out.println("sum of the numbers is "+sum);

    }
    static int sum_two_numbers(int x,int y) {
        return x+y;
    }
    static void sum_of_two_numbers(){
        System.out.println("surprise");
    }
}
