package Programs;

public class ReverseEachWordInString {

    public static void main(String[] args) {
        String input = "My name is Priyanshu";
        String[] words = input.split(" ");

        StringBuilder str = new StringBuilder();

        for(String word : words){
            str.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println(str.toString().trim());
    }
}
