package Ex06_Ternary_Operator;

public class Interview_Max_two {
    static void main() {
        int x = 10;
        int y= 20;
        int max = x < y ? x : y;
        int min = x < y ? y :x ;

        System.out.println(max);
        System.out.println(min);
    }
}
