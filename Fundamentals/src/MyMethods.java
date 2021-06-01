

public class MyMethods {

    int count = 0;
    String name = "Kristi";


    public void increaseCount(){
        count++;
    }

    public void increaseCountBy(int x){ //x = parameter

        count = count + x;
    }

    public void increaseCountBy4(){ //x = parameter

        count = count + 4;
    }

    public int add_numbers(int a, int b, int c){ // adds 3 integers

        int sum = 0;
        sum = a + b + c;

        return sum;
    }

    public String add_lastName(String str){

        name = name + " " + str;

        return name;
    }


    public boolean isNameCorrect(String vardas){
        boolean correct = false;

        if(name.equals("Kristi Raudsepp")){
            correct = true;
        }

        return correct;
    }


    public static void main(String[] args) {
        MyMethods m = new MyMethods();

        m.increaseCountBy4();
        System.out.println(m.count);

        m.increaseCount();
        System.out.println("1... " + m.count);
        m.increaseCount();
        m.increaseCount();
        System.out.println("2... " + m.count);

        m.increaseCountBy(5);
        m.increaseCountBy(6);
        System.out.println("2... " + m.count);


        int answer = m.add_numbers(12,15,99);
        System.out.println("3... " + answer);


        String ans = m.add_lastName("Raudsepp");
        System.out.println("4... " + ans);


        boolean reply = m.isNameCorrect("Yohan");
        System.out.println("5... " + reply);


    }


}// make a method that adds 4 numbers increaseCountBy4
