package Ex17_OOPs;

public class LAB136_Cats_OOPs {
    public static void main(String[] args) {
         Cat c1 = new Cat();
         Cat c2 = new Cat("Lucy");

        System.out.println(c2.name);

    }
}


      class Cat {
    String name;

    Cat() {
        System.out.println("AB");
    }
    Cat(String nameGiven ) {
        this.name = nameGiven;
    }
    void running (){
        int local_var = 10;
        System.out.println("Who is running" + this.name);
    }

      }
