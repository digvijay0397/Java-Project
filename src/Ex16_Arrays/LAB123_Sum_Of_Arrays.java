package Ex16_Arrays;

public class LAB123_Sum_Of_Arrays {
    public static void main(String[] args) {
        int number [] = {20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum+number[i];
        }
        System.out.println(sum);
    }
}
