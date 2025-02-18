package PractiseTest;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

    public static void main(String[] args){

        String[] arr = new String[]{"Raj","Sam","Shiv","Sam","Raj","Sam"};

        HashMap<String, Integer> duplicateMap = new HashMap<>();

        for(String value : arr){
            duplicateMap.put(value, duplicateMap.getOrDefault(value,0)+1);
        }

        for(Map.Entry<String,Integer> entry : duplicateMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
