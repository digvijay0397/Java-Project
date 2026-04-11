package Ex17_OOPs;

public class LAB138_Car {
    public static void main(String[] args) {
        car t =  new car();
        System.out.println(t.name);
        car p =  new car("xuv");
        System.out.println(p.name);

        car p1 =  new car( "Mercades", "2025");
        System.out.println(p1.name);
        System.out.println(p1.model);
    }
}
class car {
    String name;
    int years;
    String model;
    String color;

    car(){
        name = "i10";
        years = 2019;
        model = "Asta";
        color = "white";
    }

    car( String nameGiven) {
        name = nameGiven;
    }
    car ( String nameGiven, String modelGiven) {
        this.name = nameGiven;
        this.model = modelGiven;
    }
}