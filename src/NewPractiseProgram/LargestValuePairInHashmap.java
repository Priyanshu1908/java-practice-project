package NewPractiseProgram;

import java.util.HashMap;
import java.util.Map;

public class LargestValuePairInHashmap {

    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3,30);
        map.put(4,60);
        map.put(5,40);
        map.put(6,50);

        Map.Entry<Integer,Integer> maxEntry = null;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(maxEntry == null || entry.getValue() > maxEntry.getValue()){
                maxEntry = entry;
            }
        }

        System.out.println("Largest pair is: " + maxEntry.getKey() + "," + maxEntry.getValue());
    }
}
