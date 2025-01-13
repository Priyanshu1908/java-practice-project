package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExtended {

    public static void main(String[] args){

        HashMap<String, String> map = new HashMap<>();
        map.put("A","One");
        map.put("B","Two");
        map.put("C","Three");

        Map<String,String> syncMap = Collections.synchronizedMap(map);
        System.out.println(syncMap.get("B"));

        ConcurrentHashMap<Integer,String> conMap = new ConcurrentHashMap<>();
        conMap.put(1,"First");
        conMap.put(2,"Second");
        conMap.put(3,"Third");
        System.out.println(conMap.get(3));
    }
}
