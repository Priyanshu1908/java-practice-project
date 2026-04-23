package NewPractiseProgram;

public class ReverseEachWordInString {

    public static void main(String[] args) {

        String str = "my name is priyanshu rathore";

        String[] words = str.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {

            StringBuilder strb = new StringBuilder();
            char[] ch = word.toCharArray();
            for (int j = word.length() - 1; j >= 0; j--) {
                strb.append(ch[j]);
            }
            output.append(strb).append(" ");
        }
        System.out.println(output.toString().trim());
    }
}
