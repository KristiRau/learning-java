package JavaTasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder reverse = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse.append(input.charAt(i));
        }

        System.out.println(reverse.toString());



    }
}
