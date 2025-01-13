package Collections;

import javax.management.ImmutableDescriptor;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashmapConcept {
    public static Map<String, Integer> map1;

    static {
        map1 = new HashMap<>();
        map1.put("Divya", 123);
        map1.put("Rathore", 351);
    }

    public static void main(String[] args) {
        //1. Using HashMap Class
        System.out.println("HashMap Class:");
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Priyanshu",120);
        map.put("Rathore",200);
        map.put("Is",314);
        map.put("Name",140);
        map.put("Bro",515);

        map.put(null,321);
        System.out.println(map.get(null));
        map.put(null,210);
        System.out.println(map.get(null));

        //2. Using static way
        System.out.println("Static Way:");
        System.out.println(HashmapConcept.map1.get("Divya"));

        //3. Using ImmutableMap with single entry
        System.out.println("Immutable Map with Single Entry");
        Map<Integer,String> map2 = Collections.singletonMap(12,"One");
        System.out.println(map2.get(12));
        //map2.put(13,"Two"); //UnsupportedOperationException

        //4. Creating a 2D array of String and then converting it into Map
        System.out.println("String array to Map");
        Map<String,String> map3 = Stream.of(new String[][]{
            {"Divya","A"},
            {"Priyanshu","B"},
        }).collect(Collectors.toMap(data ->data[0],data->data[1]));

        System.out.println(map3.get("Divya"));
        map3.put("Raj","C");
        System.out.println(map3.get("Raj"));

        //5. Simple Entry
        System.out.println("Simple Entry Map:");
        Map<String,String> map4 = Stream.of(new AbstractMap.SimpleEntry<>("A","Priyanshu"),
                new AbstractMap.SimpleEntry<>("B","Divya")
        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map4.get("B"));
        map4.put("A","Ivaan");
        System.out.println(map4.get("A"));

        //6. SimpleImmutable Entry
        System.out.println("SimpleImmutableEntry");
        Map<String,String> map5 = Stream.of(new AbstractMap.SimpleImmutableEntry<>("A","Priyanshu"),
        new AbstractMap.SimpleImmutableEntry<>("B","Divya")
        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map5.get("B"));
        map5.put("A","Ivaan");
        System.out.println(map5.get("A"));

        //7. Empty Map
        System.out.println("Empty Map:");
        Map<String,String> emptyMap = Map.of();
        //emptyMap.put("A","Divya"); //UnsupportedOperationException

        //8. Singleton Map
        System.out.println("SingletonMap:");
        Map<Integer,String> singletonMap = Map.of(1,"Ivaan");
        System.out.println(singletonMap.get(1));
        //singletonMap.put(2,"Divya"); //UnsupportedOperationException

        //9. Multiple Values Map
        Map<Integer,String> map6 = Map.of(1,"first",2,"second",3,"third");
        System.out.println(map6.get(3));

        //10. Immutable Map with Map.ofEntries
        Map<Integer,String> map7 = Map.ofEntries(new AbstractMap.SimpleEntry<>(1,"First"),
        new AbstractMap.SimpleEntry<>(2,"Two"));
        System.out.println(2);
        //map7.put(3,"Three"); //UnsupportedOperationException
    }
}
