package com.sda;

public class TwoD {



    /*
          0   1   2   3   4
        [[n],[n],[n],[n],[n]]
          0   1   2   3   4
        [[1, [3, [5, [7, [9 ]
          2]  4]  6]  8]  0]
     */
        private static int[][] twoD;
        public static int[][] initialise(int n) {
            twoD = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    twoD[i][j] = i + 1;
                }
            }
            return twoD;
        }
        public static void printArray(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("\n");
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(twoD[i][j]);
                    System.out.print(" ");
                }
            }
        }








}

    /*public static void initialise() {

        twoD[0][0] = 1;
        twoD[0][1] = 2;
        twoD[1][0] = 3;
        twoD[1][1] = 4;



    }

    public static void printArray() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(twoD[i][j]);
            }
        }
    }*/




