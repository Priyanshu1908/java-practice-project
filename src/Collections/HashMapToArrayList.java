package Collections;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapToArrayList {

    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Google", 100000);
        map.put("Yahoo",200000);
        map.put("Microsoft",300000);
        map.put("LinkedIn",400000);

        Iterator it =  map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.println(pairs.getKey() + ": " + pairs.getValue());
        }

        System.out.println("--------------------");

        map.forEach((K,V)-> System.out.println("Keys: " + K + " | " +"Values: " + V));

        System.out.println("--------------------");

        ArrayList<String> listCompany= new ArrayList<>(map.keySet());
        for (String list : listCompany){
            System.out.println(list);
        }

        System.out.println("---------------------");

        ArrayList<Integer> values = new ArrayList<>(map.values());
        for (Integer emp : values){
            System.out.println(emp);
        }
    }
}
