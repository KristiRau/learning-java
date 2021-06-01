package JavaTasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Loan amount: ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        System.out.println("Number of installments: ");
        int installments = scanner.nextInt();
        float intrest = 0.00f;

        if (installments >= 6 && installments <= 12) {
            intrest = 0.025f;
        } else if (installments >= 13 && installments <= 24) {
            intrest = 0.050f;
        } else {
            intrest = 0.10f;
        }
        System.out.format("Intrest to be paid: %f", intrest);


    }
}
