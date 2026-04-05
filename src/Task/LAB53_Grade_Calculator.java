package Task;

import java.util.Scanner;

public class LAB53_Grade_Calculator {
    public static void main(String[] args) {

        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade for a given
        // numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score between - 0-100");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter between 0 and 100.");
        } else if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score>= 80 && score <=89) {
            System.out.println("B");
        } else if (score>=70 && score <=79) {
            System.out.println("C");
        }else if (score>=60 && score <=69) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }
            scanner.close();
    }
}
