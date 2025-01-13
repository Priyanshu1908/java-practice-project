package PractiseTest;

public class UpperCaseEachWord {

    public static void main(String[] args) {

        String input = "my name is priyanshu";

        char[] characters = input.toCharArray();
        boolean capitalize = true;

        for(int i = 0; i < characters.length; i++){

            if(Character.isWhitespace(characters[i]) || !Character.isLetter(characters[i])) {

                capitalize = true;

            }else if(capitalize){

                characters[i] = Character.toUpperCase(characters[i]);
                capitalize = false;
            }
        }

        System.out.println(characters);
    }
}
