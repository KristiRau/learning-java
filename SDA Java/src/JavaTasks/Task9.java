package JavaTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(",");
        int[] nums = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(nums);
        int sum = nums[0] + nums[nums.length-1];
        System.out.println(sum);
        System.out.println(sum/2.00f);



    }
}
