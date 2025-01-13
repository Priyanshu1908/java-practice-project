package PractiseTest;

import java.util.HashMap;
import java.util.Map;

public class HighestWordCount {

    public static void main(String[] args){

        highestWordCount("My name is Sam, My wife's name is Divu.");
    }

    public static void highestWordCount(String text){

        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        System.out.println(text);

        String[] words = text.split("\\s+");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word : words){
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
            }else{
                wordCount.put(word,1);
            }
        }

        String highestWord = null;
        int highestCount = 0;

        for(Map.Entry<String,Integer> word : wordCount.entrySet()){
            if(word.getValue()>highestCount){
                highestWord = word.getKey();
                highestCount = word.getValue();
            }
        }

        System.out.println("Highest word is: " + highestWord + " and the count is: " + highestCount);

    }
}
