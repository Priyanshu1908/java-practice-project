package NewPractiseProgram;

import java.util.Scanner;

public class EvenOddFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter any number: ");
        int num = input.nextInt();
        isEvenOrOdd(num);
    }

    private static void isEvenOrOdd(int num) {

        if (num == 0) {
            System.out.println("Invalid Input: " + num);
        } else if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
