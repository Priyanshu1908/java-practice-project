package NewPractiseProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordInString {

    public static void main(String[] args) {

        System.out.print("Please enter your string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String[] words = str.toLowerCase().split(" ");
        HashMap<String,Integer> wordCount = new HashMap<>();

        for(String s : words){
            if(wordCount.containsKey(s)){
                wordCount.put(s,wordCount.get(s)+1);
            }else {
                wordCount.put(s,1);
            }
        }

        for(Map.Entry<String,Integer> entry : wordCount.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
