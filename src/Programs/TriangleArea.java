package Programs;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your base: ");
        double b = input.nextDouble();
        System.out.print("Please enter your height: ");
        double h = input.nextDouble();
        double area = 0.5 * b * h;
        //double area = (b * h) / 2;
        System.out.println("Area of your triangle is: " + area + "sq cm");
    }
}
