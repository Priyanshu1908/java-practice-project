package NewPractiseProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class SortAlphabetNumberSpecialCharacterFromAlphanumeric {

    public static void main(String[] args) {

        System.out.print("Enter any alphanumeric string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        char[] chars = str.toCharArray();
        ArrayList<Character> alphabet = new ArrayList<>();
        ArrayList<Character> numeric = new ArrayList<>();
        ArrayList<Character> specialChar = new ArrayList<>();

        for(char c : chars){
            if(Character.isAlphabetic(c)){
                alphabet.add(c);
            }else if(Character.isDigit(c)){
                numeric.add(c);
            }else {
                specialChar.add(c);
            }
        }

        System.out.println("Alphabet: " + alphabet);
        System.out.println("Numeric: " + numeric);
        System.out.println("Special Character: " + specialChar);
    }
}
