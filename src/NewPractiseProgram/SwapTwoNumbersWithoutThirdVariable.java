package NewPractiseProgram;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThirdVariable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = input.nextInt();
        swapWithoutThirdVariable(a, b);
    }

    private static void swapWithoutThirdVariable(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Now first number is " + a + " and second number is " + b);
    }
}
