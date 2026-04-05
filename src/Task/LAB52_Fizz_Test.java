package Task;

public class LAB52_Fizz_Test {
    public static void main(String[] args) {


     //   ✅ FizzBuzz Test:

        // Write a program that prints numbers from 1 to 100. However,
        // for multiples of 3, print "Fizz" instead of the number, and
        // for multiples of 5, print "Buzz." For numbers that are multiples
        // of both 3 and 5, print "FizzBuzz."


        for(int i = 1; i <= 10; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + "FizzBuzz ");
            } else if (i % 3 == 0)
                    System.out.print("Fizz");
                else if (i % 5 == 0)
                    System.out.print("Buzz");
            }
        }
    }

