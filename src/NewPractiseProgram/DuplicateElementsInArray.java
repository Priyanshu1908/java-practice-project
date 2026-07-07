package NewPractiseProgram;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsInArray {

    public static void main(String[] args) {
        int[] arr = {2,4,7,2,9,2,5,2,7,1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a : arr){
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else {
                map.put(a, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
