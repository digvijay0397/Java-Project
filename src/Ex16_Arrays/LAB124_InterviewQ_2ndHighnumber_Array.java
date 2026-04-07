package Ex16_Arrays;

import java.util.Arrays;

public class LAB124_InterviewQ_2ndHighnumber_Array {
    public static void main(String[] args) {

        int [] number = {12, 24, 99, 38,89, 61,2};

        Arrays.sort(number);
        System.out.println(number[number.length-2]);


    }
}
