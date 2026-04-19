package Programs;

import java.util.Scanner;

public class CheckPositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker");
        System.out.print("Please enter your number: ");
        int x = input.nextInt();
        if (x > 0) {
            System.out.println("Number is positive: " + x);
        } else if (x < 0) {
            System.out.println("Number is negative: " + x);
        } else {
            System.out.println("Number is Zero: " + x);
        }
    }
}
