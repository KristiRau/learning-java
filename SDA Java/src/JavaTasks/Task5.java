package JavaTasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 1; i <= number; i=i+2){
            System.out.println(i);
        }



    }
}
