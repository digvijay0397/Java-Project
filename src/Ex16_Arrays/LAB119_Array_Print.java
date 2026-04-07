package Ex16_Arrays;

public class LAB119_Array_Print {
    public static void main(String[] args) {
        int [] marks = {50, 55, 90, 65, 97};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        for (int mark:marks) {
            System.out.println(marks);
        }
        System.out.println("==================");

          for (int i = 0; i < marks.length; i++) {
              System.out.println(marks[i]);
          }

    }
}
