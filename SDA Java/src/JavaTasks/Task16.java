package JavaTasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.replace(",", "-MAKARENA"));






    }
}



/* Write a program that reads the text entered by the user, and then for that
text converts all comma occurrences to the text "-MAKARENA" and displays in the console.
For example, for the text "Lorem ipsum dolor sit amet, consectetur adipiscing
elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
The program should write in the console "Lorem ipsum dolor sit amet-MAKARENA consectetur
adipiscing elit-MAKARENA sed to eiusmod tempor incididunt ut labore et dolore magna aliqua.".
Get the data from the user in the console using the Scanner class.*/