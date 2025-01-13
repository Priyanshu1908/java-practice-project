package PractiseTest;

import java.util.Scanner;

public class AlphabetsFromString {

    public static void main(String[] args){

        System.out.println("Enter your String which contains Alphabets, Numeric values and Special Characters: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        char[] chars = s.toCharArray();

        for(char c : chars){
            if(Character.isAlphabetic(c)){
                System.out.print(c + " ");
            }
        }
    }


}
