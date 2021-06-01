package JavaTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }



    }
}



/*Write a program that takes an integer from the user and prints all its
divisors in the console, each divisor in seperate line.
For example, for the number 21, the program should
write in the console the numbers: 1, 3, 7, 21 (in new line each)
Get the data from the user in the console using the Scanner class.*/
