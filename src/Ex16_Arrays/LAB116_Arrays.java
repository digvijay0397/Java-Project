package Ex16_Arrays;

public class LAB116_Arrays {
    public static void main(String[] args) {


        int a = 20;
        int [] marks ={90, 88, 72, 83, 98};
        int marks2 [] ={82, 74, 23, 45, 99};

        boolean [] is_married = {true, false, true};

        String [] name = {"Digvijay", "Ashutosh", "Deepu"};
   // Not allowed -> String [] names = {"DS,AS,AK,32"};

   float[] values = new float[3];
   values [0] = 3.14F;
   values [1] = 4.14F;
   values [2] = 5.14F;
//   values [3] = 6.14F;


          for (String item: name) {

              System.out.println(item);
          }

    }
}
