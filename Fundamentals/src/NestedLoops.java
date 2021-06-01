public class NestedLoops {

    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {

                if (j == 1 || j == 10) {
                    System.out.print("# ");
                }
                else if (i == 1 || i == 10) {
                    System.out.print("# ");
                }
                else if (i == j) {
                    System.out.print("# ");
                }
                else if (i + j == 11) {
                    System.out.print("# ");
                }
                else {
                    System.out.print("* ");
                }

            }//i loop ends
            System.out.println();
        }//j loop ends
























    }// psvm
}//class
