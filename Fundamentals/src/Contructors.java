

public class Contructors {

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("MyCar specs: " + myCar.color + " | " + myCar.maxSpeed);
        myCar.maxSpeed = 50;
        myCar.color = "Red";
        System.out.println("MyCar specs: " + myCar.color + " | " + myCar.maxSpeed);

        System.out.println("\n===========================");




        Audi audi1 = new Audi();
        Audi audi2 = new Audi("black",100,true, false);
        Audi audi3 = new Audi(true);
        Audi audi4 = new Audi("blue", 120, true, true);

        audi1.getSpecifications();
        audi2.getSpecifications();
        audi3.getSpecifications();
        audi4.getSpecifications();

        Car car1 = new Car("green", 90);
        car1.getSpecs();

    } // psvm ends

} //public class ends

//========================================================
//different type of classes

class Car{
    String color;
    int maxSpeed;

    public Car () {     }

    public Car(String color, int maxSpeed){
        this.color = color;
        this.maxSpeed = maxSpeed;
    } //when it has name of the class, then its method

    public void getSpecs() {
        System.out.println("Color: " + color);
        System.out.println("maxSpeed: " + maxSpeed);
        System.out.println("===============");
    }
}


class Audi{
    String color;
    int max_Speed;
    boolean SUV, leather_Seats;

    public Audi(){ }//........1

    public Audi(String color, int max_Speed, boolean SUV, boolean leather_Seats){//.....2
        this.color = color;
        this.max_Speed = max_Speed;
        this.SUV = SUV;
        this.leather_Seats = leather_Seats;

    }

    public Audi(boolean SUV){//..........3
        this.SUV = SUV;
    }//.......3




    public void getSpecifications(){
        System.out.println("Color: " + color);
        System.out.println("MaxSpeed: " + max_Speed);
        System.out.println("SUV: " + SUV);
        System.out.println("LeatherSeats: " + leather_Seats);
        System.out.println("===================");
    }

}