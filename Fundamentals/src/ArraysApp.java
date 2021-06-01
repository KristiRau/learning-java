import java.util.Arrays;

public class ArraysApp {

    public static void main(String[] args) {

        int[] arrayInt = new int[5]; // decleration

        //initialize each value
        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;
        arrayInt[3] = 40;
        arrayInt[4] = 50;

        System.out.println("value at index 0: " + arrayInt[0]);
        System.out.println("value at index 4: " + arrayInt[4]);

        System.out.println("======================================");


        String[] arrayStr = new String[5]; // decleration

        //initialize each value
        arrayStr[0] = "first";
        arrayStr[1] = "second";
        arrayStr[2] = "third";
        arrayStr[3] = "fourth";
        arrayStr[4] = "fifth";

        System.out.println("value at index 0: " + arrayStr[0]);
        System.out.println("value at index 4: " + arrayStr[4]);


        System.out.println("======================================");

        //Declare & initialise
        int[] arrayInt1 = {10,20,30,40,50};
        String[] arrayStr1 = {"first", "second", "third", "fourth", "fifth" };

        System.out.println("arrayInt1[3] : " + arrayInt1[3]);
        System.out.println("arrayStr1[3] : " + arrayStr1[3]);

        System.out.println("======================================");

        //System.out.println("arrayInt1[3] : " + arrayInt1[5]);//error

        System.out.println("=======================");
        System.out.println("2D Array");

        int[][] twoDimArray = new int[2][10];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = 1;
            }
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.println(Arrays.toString(twoDimArray[i]));
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j]++;
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=============================");
        System.out.println("3D Array");

        int[][][] threeDimArray = new int[2][3][4];

        int element = 0;

        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {
                    threeDimArray[i][j][k] = element;
                }
                element++;
            }
        }

        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                System.out.print(Arrays.toString(threeDimArray[i][j]) + " ");
            }
            System.out.println();
        }



    }






}
