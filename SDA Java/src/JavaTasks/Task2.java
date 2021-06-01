package JavaTasks;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float celsius = scanner.nextFloat();
        System.out.println(tempInFarenheit(celsius));
    }
    public static float tempInFarenheit(float celsius) {
        return (float) (1.8 * celsius + 32.0f);
    }
}



