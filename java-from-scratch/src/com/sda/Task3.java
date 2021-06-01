package com.sda;

public class Task3 {

    public static int sumOfDigit(int num) {
        int sum = 0;

        while (num > 0) {
            int n = num % 10;
            sum = sum + n;
            num = num / 10;
        }
        return sum;
    }

    public static String test(String x) {
        if (x.length() % 2 == 0) {
            return x.toUpperCase();
        } else {
            return x.toLowerCase();
        }

    }

    public static int checkSum(int arg1, int arg2) {
        if (arg1 + arg2 < 100) {
            return 0;
        } else if (arg1 + arg2 > 100) {
            return 1;
        } else {
            return 2;
        }
    }

    public static double letterToGPA(String grade) {
        double gpa;
        switch (grade) {
            case "A":
            case "A+": gpa = 4;
                break;
            case "A-": gpa = 3.7;
                break;
            case "B+": gpa = 3.3;
                break;
            case "B": gpa = 3;
                break;
            default: gpa = -1;
                break;
        }
        return gpa;
    }

    public static int findMaxVal(int[] array) {
        int max = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
       return max;
    }

    public static void linearSort(int[] array) { //Task3.linearSort(new int[]{5,8,2,6,9});
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    swap(i, j, array);
                }
            }
        }
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(" ]");

    }

    private static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /*
    1 * * * *
    1 1 * * *
    1 2 1 * *
    1 3 3 1 *
    1 4 6 4 1
    */

    public static void printPascal(int n) {
        int [][] pasTr = new int[n][n];
        int row, col;

        for (row = 0; row < n; row++) {
            for (col = 0; col < n; col++) {
                pasTr[row][col] = 0;
            }
        }

        pasTr[0][0] = 1;
        pasTr[1][0] = 1;
        pasTr[1][1] = 1;

        for (row = 2; row < n; row++) {
            pasTr[row][0] = 1;
            for (col = 1; col <= row; col++) {
                pasTr[row][col] = pasTr[row - 1][col - 1] + pasTr[row - 1][col];
            }
        }

            for (row = 0; row < pasTr.length; row++) {
                for (col = 0; col <= row; col++) {
                    System.out.print(pasTr[row][col]);
                    System.out.print(" ");
                }
                System.out.print('\n');
            }
    }












}
