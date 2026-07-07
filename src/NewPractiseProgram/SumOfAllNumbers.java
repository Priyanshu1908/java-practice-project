package NewPractiseProgram;

import java.util.Scanner;

public class SumOfAllNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        int x = input.nextInt();
        findSum(x);
    }

    private static void findSum(int x) {
        int sum = 0;
        int r;

        while (x > 0) {

            r = x % 10;
            sum = sum + r;
            x = x / 10;
        }

        System.out.println("Sum of all numbers is: " + sum);
    }
}
