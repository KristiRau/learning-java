package JavaTasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArray = scanner.nextLine().toCharArray();

        int bracketCount = 0;

        for (char character: charArray) {
            switch (character) {
                case '(' :
                    bracketCount++;
                    break;
                case ')' :
                    bracketCount--;
                    break;
            }

            if (bracketCount < 0) {
                break;
            }
        }

        if (bracketCount != 0) {
            System.out.println("Incorrect pairing of brackets");
        } else {
            System.out.println("OK");
        }






    }
}


/*Write a program that checks if the brackets are correctly matched in
the user-specified arithmetic expression. The expression is given as a single string.
If the brackets are correctly paired, the program should write to the
console the message: "OK". Otherwise, the program should write to the console
the message: "Incorrect pairing of brackets".
Example a: "2 * (3.4 - (-7) / 2) * (a-2) / (b-1)))", result: "Incorrect pairing of brackets"
Example b: "(2 * (3.4 - (-7) / 2) * (a-2) / (b-1))" result: "OK"
Example c: ") 2 * 4 (" result: "Incorrect pairing of brackets"
Get the data from the user in the console using the Scanner class.
*/