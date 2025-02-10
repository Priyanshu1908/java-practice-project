package PractiseTest;

public class RightTriangle {

    static int row = 6;

    public static void main(String[] args) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
