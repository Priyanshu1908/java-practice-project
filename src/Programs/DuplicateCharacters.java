package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

    public static void main(String[] args){
        duplicateCharacters("Java is the best language to learn");
    }

    public static void duplicateCharacters(String s){

        char[] characters =  s.toCharArray();

        Map<Character,Integer> charsMap = new HashMap<>();

        for(char c : characters){
            if(charsMap.containsKey(c)){
                charsMap.put(c, charsMap.get(c)+1);
            }else{
                charsMap.put(c,1);
            }
        }

        Set<Map.Entry<Character, Integer>> setChar = charsMap.entrySet();

        for(Map.Entry<Character, Integer> se : setChar){
            if(se.getValue() > 1){
                System.out.println(se.getKey() + ": " + se.getValue());
            }
        }
    }
}
