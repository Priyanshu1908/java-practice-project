package PractiseTest;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementCount {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 5, 2, 5, 7, 5, 3, 2, 4};

        HashMap<Integer, Integer> duplicateMap = new HashMap<>();

        for (int num : arr) {
            duplicateMap.put(num, duplicateMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> value : duplicateMap.entrySet()) {
            if(value.getValue()>1){
                System.out.println(value.getKey() + ": " + value.getValue());
            }
        }
    }
}
