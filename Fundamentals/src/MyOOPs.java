public class MyOOPs {
    public static void main(String[] args) {

        System.out.println("STARTED!!");

        System.out.println("=================");

        Studentz obj1 = new Studentz();
        obj1.name = "Yo";
        obj1.age = 1;
        obj1.sayName();
        obj1.sayAge();

        System.out.println("=================");

        Studentz obj2 = new Studentz();
        obj2.name = "Bob";
        obj2.age = 10;
        obj2.sayName();

        System.out.println("=================");

        obj1.checkForDiscount();
        obj2.checkForDiscount();

        System.out.println("=================");

        obj1.sayNameAndAge();

        System.out.println("=================");

        Studentz obj3 = new Studentz();
        obj3.name = "Kristi";
        obj3.lastname = "Raudsepp";
        obj3.sayNameAndLastname();

        System.out.println("=================");

        Studentz obj4 = new Studentz();
        obj4.fullname = "Kristi Raudsepp";
        obj4.sayFullName();









    } //psvm ends
} //public class ends



class Studentz {
    String name, lastname, fullname;
    int age;


    public void sayNameAndLastname() {
        System.out.println("My name is " + name + " " + lastname);
    }

    public void sayFullName() {
        System.out.println("My name is " + fullname);
    }

    public void sayNameAndAge() {
        System.out.println("My name is " + name + " and my age is " + age);
    }

    public void sayName() {
        System.out.println("My name is: " + name);
    }

    public void sayAge() {
        System.out.println("My age is: " + age);
    }

    public void checkForDiscount() {
        if (age > 18) {
            System.out.println(name + ", sorry no Discount!");
        }
        else {
            System.out.println(name + ", You got a Discount!!!");
        }
    }

} // class studentz ends