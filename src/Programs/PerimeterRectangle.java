package Programs;

import java.util.Scanner;

public class PerimeterRectangle {

    public static void main(String[] args) {
        System.out.println("Enter all sides of a rectangle");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int p = a + b + c + d;

        System.out.println("Perimeter of Rectangle is: " + p);
    }
}
