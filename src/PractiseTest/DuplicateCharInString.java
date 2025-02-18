package PractiseTest;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {

    public static void main(String[] args){


        String s = "My name is Priyanshu Rathore";
        char[] c = s.toLowerCase().toCharArray();

        HashMap<Character, Integer> duplicateChar = new HashMap<>();

        for(char c1 : c){
            if(c1 != ' ') {
                duplicateChar.put(c1, duplicateChar.getOrDefault(c1, 0) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : duplicateChar.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() +": "+ entry.getValue());
            }
        }
    }
}
