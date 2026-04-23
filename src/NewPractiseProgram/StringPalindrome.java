package NewPractiseProgram;

public class StringPalindrome {

    public static void main(String[] args) {

        String str = "Priyanshu";
        char[] chars = str.toCharArray();
        StringBuilder rev = new StringBuilder();

        for(int i = chars.length-1; i>=0; i--){
            rev.append(chars[i]);
        }

        System.out.println("String Palindrome: " + rev);
    }
}
