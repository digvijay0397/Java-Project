package Ex10_ForLoop;

import java.util.Scanner;

public class LAB75_For_Loop_Continue {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the no.");
       int num = scanner.nextInt();
       for (int i = 0; i< num; i++) {
           if (i == 5) {
               continue;
           }
           System.out.println(i);
       }
    }
}
