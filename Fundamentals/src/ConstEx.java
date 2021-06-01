public class ConstEx {
    public static void main(String[] args) {

        Example obj = new Example(10, "Kristi");
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.myPi);

        Example obj1 = new Example();
        System.out.println(obj1.myPi);










    }//x
}// xx



class Example { //class should always start with capital letter
    int age;
    String name;
    float myPi; //= 3.14f;

    public Example() {
        this.myPi = 3.14f;
    }

    public Example(int age, String name) {
        System.out.println("zzzzzzzzzz");
        this.age = age;
        this.name = name;
        this.myPi = 3.14f;
    }

} // xxx