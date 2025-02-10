package PractiseTest;

public class LeftTriangle {

    public static void main(String[] args) {

        int row = 6;
        for (int i = 0; i < row; i++) {
            for (int j = 2 * (row - 1 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        for (int i = 0; i < row; i++) {
//            for (int j = 1; j < row - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
    }
}
