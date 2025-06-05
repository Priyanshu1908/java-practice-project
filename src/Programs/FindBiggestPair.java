package Programs;

import java.util.HashMap;
import java.util.Map;

public class FindBiggestPair {

    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 10);
        map.put("xyz", 20);
        map.put("def", 15);

        String maxWord  = null;
        int maxValue = 0;

        for( Map.Entry<String, Integer> entry : map.entrySet()){

            if(entry.getValue()>maxValue){
                maxWord = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        System.out.println(maxWord + ": " + maxValue);
    }
}
