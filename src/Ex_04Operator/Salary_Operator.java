package Ex_04Operator;

public class Salary_Operator {
    public static void main(String[] args) {
        int Ashutosh_salary = 10000;
        boolean b = !(Ashutosh_salary > 5000 || Ashutosh_salary < 5000);
        System.out.println(b);

        // Divide and conquer
        // A  -> Ashutosh_salary > 5000 -> true
        // B  -> Ashutosh_salary < 5000 -> false
        // A || B -> true || false -> true
        // ! (A || B) -> ! (true || false) -> ! true -> false

    }
    
}
