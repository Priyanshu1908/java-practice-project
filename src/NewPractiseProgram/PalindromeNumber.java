package NewPractiseProgram;

import java.util.Scanner;

public class PalindromeNumber {

    static int x = 0;

    public static void main(String[] args) {
        System.out.print("Please enter any number: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        findPalindrome(x);
    }

    private static void findPalindrome(int y) {

        int rev = 0;
        int r;

        while (y > 0) {

            r = y % 10;
            rev = rev * 10 + r;
            y = y / 10;
        }

        if (rev == x) {
            System.out.println("Number is Palindrome: " + rev);
        } else {
            System.out.println("Number is not Palindrome: " + rev);
        }
    }
}
