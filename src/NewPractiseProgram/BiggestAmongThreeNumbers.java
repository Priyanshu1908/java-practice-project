package NewPractiseProgram;

import java.util.Scanner;

public class BiggestAmongThreeNumbers {

    public static void main(String[] args) {
        FindBiggestNumber();
    }

    private static void FindBiggestNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int a = input.nextInt();
        System.out.print("Please enter your second number: ");
        int b = input.nextInt();
        System.out.print("Please enter your third number: ");
        int c = input.nextInt();

        if (a == b && a == c) {
            System.out.println("All Numbers are equal: " + a);
        } else if (a >= b && a >= c) {
            System.out.print("Biggest Number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.print("Biggest Number is: " + b);
        } else {
            System.out.print("Biggest Number is: " + c);
        }
    }
}
