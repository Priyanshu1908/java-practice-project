package PractiseTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

    public static void main(String[] args){
        duplicateChar("animation");

    }

    public static void duplicateChar(String text){

        char[] chars = text.toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for(char cha : chars){
            if(charCount.containsKey(cha)){
                charCount.put(cha, charCount.get(cha)+1);
            }else{
                charCount.put(cha,1);
            }
        }

        for(Map.Entry<Character,Integer> cha : charCount.entrySet()){
            if(cha.getValue()>1){
                System.out.println(cha.getKey() + ": " + cha.getValue());
            }
        }
    }
}
