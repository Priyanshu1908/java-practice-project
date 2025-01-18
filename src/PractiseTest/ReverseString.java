package PractiseTest;

public class ReverseString {

    public static void main(String[] args){

        String input = "Hello World";

        StringBuilder reverseString = new StringBuilder();

        for(int i = input.length()-1; i >= 0 ; i--){

            reverseString.append(input.charAt(i));
        }

        System.out.println("reverse string is: " + reverseString);
    }
}
