package JavaTasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.contains("Java")) {
            System.out.println("Found Java");
        }
        if (input.startsWith("Java")) {
            System.out.println("Starts with Java");
        }
        if (input.endsWith("Java")) {
            System.out.println("Ends with Java");
        }
        if (input.equals("Java")) {
            System.out.println("Equals Java");
        }

        System.out.println(input.indexOf("Java"));

    }
}
