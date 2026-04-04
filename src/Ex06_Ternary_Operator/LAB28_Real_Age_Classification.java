package Ex06_Ternary_Operator;

public class LAB28_Real_Age_Classification {
    static void main(String[] args) {
        String age_input = args[0];
        System.out.println(age_input instanceof  String);
        int age_user = Integer.parseInt(age_input);

        String result = (age_user < 18 ) ? "Minor" : (age_user <= 60) ? "Adult" : "Old Age Home " ;
        System.out.println(result);


    }
}
