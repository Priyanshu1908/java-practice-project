package Programs;

public class SeparateCharacterNumericSpecialCharInString {

    public static void main(String[] args) {
        String input = "2345@#$%Pr345@#$%iy2345@#$%an2345@#$%shu234#$%";

        char[] chars = input.toCharArray();

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder();

        for(char c : chars){
            if(Character.isAlphabetic(c)){
                str1.append(c);
            }else if(Character.isDigit(c)){
                str2.append(c);
            }else{
                str3.append(c);
            }
        }

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
