package NewPractiseProgram;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {

        System.out.print("Please enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        StringBuilder str1 = new StringBuilder();
        char[] chars = str.toCharArray();

        for(int i = chars.length-1; i>=0; i--){
            str1.append(chars[i]);
        }

        System.out.println(str1);
    }
}
