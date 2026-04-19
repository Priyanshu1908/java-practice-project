package NewPractiseProgram;

import java.util.Scanner;

public class SwapTwoWordsWithoutThirdVariable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st word: ");
        String a = input.nextLine();
        System.out.print("Enter 2nd word: ");
        String b = input.nextLine();
        swapWithoutThirdVariable(a, b);

    }

    private static void swapWithoutThirdVariable(String a, String b) {

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("Now 1st word is " + a + " and second word is " + b);
    }

}
