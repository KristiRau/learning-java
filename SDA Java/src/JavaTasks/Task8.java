package JavaTasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            num = scanner.nextInt();
            sum = sum + num;
        } while (num != 0);
        System.out.println(sum);



    }
}
