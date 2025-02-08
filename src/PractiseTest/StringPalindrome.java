package PractiseTest;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String cleanedInput = input.replaceAll("\\s","");
        System.out.println(cleanedInput);

        StringBuilder reverseInput = new StringBuilder(cleanedInput).reverse();
        System.out.println(reverseInput);

        if(reverseInput.toString().equals(cleanedInput)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
