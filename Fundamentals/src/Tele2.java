public class Tele2 {
    public static void main(String[] args) {
        Clients obj1 = new Clients("Kristi");
        obj1.display();
        Clients obj2 = new Clients("Kristjan");
        obj2.display();
        Clients obj3 = new Clients("Liisu");
        /*obj3.display();*/
        Clients obj4 = new Clients("Indrek");
        obj4.display();
        Clients obj5 = new Clients("Tom");
        obj5.display();

        System.out.println("================");

        Clients.statistics();
    }
}
class Clients {
    static int numCount = 0;
    String cust_name;
    int mobile_num;

    public Clients(String cust_name) {
        this.cust_name = cust_name;
        numCount++;
        mobile_num = numCount;
    }
    public void display() {
        System.out.println("Name: " + cust_name + "\nNumber: " + mobile_num);
    }
    public static void statistics() {
        System.out.println("Total numbers given out: " + numCount);
    }
    // make a method that keeps count. static variable. //student.java
}