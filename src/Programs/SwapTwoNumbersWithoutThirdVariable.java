package Programs;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThirdVariable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = input.nextInt();
        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping...");
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
    }
}
