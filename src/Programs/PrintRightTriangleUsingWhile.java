package Programs;

public class PrintRightTriangleUsingWhile {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        int x = 5;
        int count = 0;
        while (count < x) {
            System.out.print("*");
            int i = 0;
            while (i < count) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            count++;
        }
    }
}
