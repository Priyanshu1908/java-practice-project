package Programs;

import java.util.HashMap;
import java.util.Set;

public class DuplicateString {

    public static void main(String[] args) {
        getWordsCount("Hi this java course is very good but java is hard to learn");
        getWordsCount("Priyanshu is gentleman and he is nice man and is very talented man");
        getWordsCount("hi hi hi hi hi");
        getWordsCount("Divu Divu Divu Divu");
        getWordsCount("my name is divya my work is as a export marketing i love playing football my husband is very duffer that's it");
    }

    public static void getWordsCount(String inputString) {

        String[] stringArray = inputString.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : stringArray) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        Set<String> wordsInStrings = wordCount.keySet();

        for(String word : wordsInStrings){

            if(wordCount.get(word)>1){
                System.out.println(word + " " + wordCount.get(word));
            }

        }

    }
}
