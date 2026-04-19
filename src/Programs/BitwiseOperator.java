package Programs;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int a = input.nextInt();
        System.out.print("Please enter your second number: ");
        int b = input.nextInt();
        int result = a & b;
        System.out.println("Output of AND operator is: " + result);
        result = a | b;
        System.out.println("Output of OR operator is: " + result);
        result = a ^ b;
        System.out.println("Output of XOR operator is: " + result);
        result = a << 1;
        System.out.println("Output of LeftShift operator for first number is: " + result);
        result = a >> 1;
        System.out.println("Output of RightShift operator for first number is: " + result);
    }
}
