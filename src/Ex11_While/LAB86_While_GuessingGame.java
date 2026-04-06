package Ex11_While;

import java.util.Random;
import java.util.Scanner;

public class LAB86_While_GuessingGame {
   public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt( 100);
//        System.out.println(numberToGuess);

       Scanner scanner = new Scanner(System.in) ;
       System.out.println("Enter a number");
       int guess;
       int attempts =0;

       while(true) {
           if (!scanner.hasNextInt()){
               System.out.println("Invalid Inputs");
               scanner.next();   //Consume Invalid token
               continue;
           }
           guess = scanner.nextInt();
           attempts++;

           if(guess < numberToGuess){
               System.out.println("Too Low,Try Again!!");
           } else if (guess > numberToGuess) {
               System.out.println("Too High,Try  Again!!");
           }else {
               System.out.println("Correct Guess-> Attempt Taken=" +attempts);
               break;
           }
       }

    }
}
