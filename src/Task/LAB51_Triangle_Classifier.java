package Task;

import java.util.Scanner;

public class LAB51_Triangle_Classifier {
    public static void main(String[] args) {

        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        //determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.



        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side a: ");
        int a = scanner.nextInt();
        System.out.print("Enter side b: ");
        int b = scanner.nextInt();
        System.out.print("Enter side c: ");
        int c = scanner.nextInt();

        // Step 1: Validity Check
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Sides must be positive numbers!");

        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid Triangle! (Triangle inequality violated)");

            // Step 2: Classify by Sides
        } else if (a == b && b == c) {
            System.out.println("Equilateral Triangle (All sides are equal)");

        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle (Exactly two sides are equal)");

        } else {
            System.out.println("Scalene Triangle (No sides are equal)");
        }

        scanner.close();
    }
}