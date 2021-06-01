package JavaTasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double BASE_INCOME = 85528.00;
        double FLAT_TAX = 14839.02;
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();
        if (income <= BASE_INCOME) {
            double calculatedTax = income * 0.18 - 556.02;
            if (calculatedTax < 0) {
                calculatedTax = 0;
            }
            System.out.println(calculatedTax);
        } else {
            System.out.println(FLAT_TAX + (0.32 * (income - BASE_INCOME)));
        }
    }
}