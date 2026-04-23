package NewPractiseProgram;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.print("Please enter any number: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        doReverse(x);
    }

    private static void doReverse(int x) {

        int rev = 0;
        int r;

        while (x > 0) {
            r = x % 10;
            rev = rev * 10 + r;
            x = x / 10;
        }

        System.out.println("Reverse of your number is: " + rev);
    }
}
