package Ex16_Arrays;

import java.util.Arrays;

public class LAB120_Arrays_Max_Min {
    public static void main(String[] args) {

        int [] array = {25,15,80,76,60,53,10,49};
//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);


        int max = array[0];
        for (int i = 0; i< array.length; i++) {
             if (array[i] > max) {
                 max = array[i];
             }
        }
        System.out.println(max);

        int min = array[0] ;
        for (int i =0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
