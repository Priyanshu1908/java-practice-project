package NewPractiseProgram;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        swapTwoNumbers(a, b);
    }

    private static void swapTwoNumbers(int a, int b) {

        int c = a;
        a = b;
        b = c;

        System.out.println("Now your first number is " + a + " and second number is " + b);
    }
}
