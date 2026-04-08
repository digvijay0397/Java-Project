package Ex16_Arrays;

public class LAB131_2nd_Highest_Array {
    public static void main(String[] args) {
        int [] number = {12,26,19,67,85,98,54,99,98,99};
        int highest = 0;
        int secondHighest = 0;

        for (int num : number) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {  //Edge case
                secondHighest = num;
            }
        }
        System.out.println(secondHighest);
    }
}
