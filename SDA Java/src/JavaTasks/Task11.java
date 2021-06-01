package JavaTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int m = number/2;
        int flag = 0;
        if (number <= 1) {
            System.out.println("I am interrupting work");
        } else {
            for (int i = 2; i <= m; i++) {
                if (number % i == 0) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }






    }
}

/***
 * Check whether a number is Prime or not.
 */
