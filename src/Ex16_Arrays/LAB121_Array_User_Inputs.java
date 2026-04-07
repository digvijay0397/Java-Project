package Ex16_Arrays;

import java.util.Scanner;

public class LAB121_Array_User_Inputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = scanner.nextInt();

        String[] number_marks = new String[size];

        for ( int i =0; i < number_marks.length; i++) {
            System.out.println("Enter the marks");
            number_marks[i] = scanner.next();

        }
        System.out.println("===");

        for ( int i = 0; i < number_marks.length; i++) {

            System.out.println(number_marks[i]);
        }
    }
}
