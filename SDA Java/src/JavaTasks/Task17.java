package JavaTasks;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] split = input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < split.length; i++) {
            if (map.containsKey(split[i].toLowerCase())) {
                map.put(split[i].toLowerCase(), map.get(split[i])+1);
            } else {
                map.put(split[i].toLowerCase(), 1);
            }
        }
        map.forEach((key, val) -> System.out.println(key + " - " + val));









    }
}
