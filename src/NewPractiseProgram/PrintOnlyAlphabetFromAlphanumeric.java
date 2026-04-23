package NewPractiseProgram;

import java.util.Scanner;

public class PrintOnlyAlphabetFromAlphanumeric {

    public static void main(String[] args) {

        System.out.println("Enter an alphanumeric string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        char[] chars = str.toCharArray();

        for(char c : chars){
            if(Character.isAlphabetic(c)){
                System.out.println(c);
            }
        }
    }
}
