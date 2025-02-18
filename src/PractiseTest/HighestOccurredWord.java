package PractiseTest;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurredWord {

    public static void main(String[] args){

        String s = "this is my practise program. Is hope program is correct";

        String text = s.replaceAll("[^a-zA-Z ]","").toLowerCase();
        String[] arrWord =  text.split(" ");

        HashMap<String,Integer> duplicateWordMap = new HashMap<>();

        for(String value : arrWord){
            duplicateWordMap.put(value, duplicateWordMap.getOrDefault(value,0)+1);
        }

        String maxWord = null;
        int maxCount = 0;

        for(Map.Entry<String,Integer> entry : duplicateWordMap.entrySet()){
            if(entry.getValue()>1){
                maxWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Highest word: " + maxWord + "\n" + "Count: " + maxCount);
    }
}
