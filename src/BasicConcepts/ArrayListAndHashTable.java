package BasicConcepts;

import java.util.ArrayList;
import java.util.Hashtable;

public class ArrayListAndHashTable {

    public static void main(String[] args){

        ArrayListAndHashTable arList = new ArrayListAndHashTable();
        arList.arrayList();
        arList.hashTable();

    }
    public void arrayList() {
        System.out.println("ArrayList Concept:");
        ArrayList ar = new ArrayList();
        ar.add(20);
        ar.add("Priyanshu");
        ar.add(12.45);
        ar.add(true);
        System.out.println(ar.size());
        for(int i=0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }
        ar.remove(2);
        System.out.println(ar.size());

        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(34);
        //ar1.add("Text");
        System.out.println(ar1.getFirst());

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("Priyanshu");
        ar2.add("Rathore");
        //ar2.add(134);
        System.out.println(ar2.get(1));
    }

    public void hashTable(){
        System.out.println("HashTable Concept:");
        Hashtable ht = new Hashtable();
        ht.put(1,"Priyanshu");
        ht.put(2,1919);
        ht.put('A',"Rathore");
        ht.put(12.43,'B');
        System.out.println(ht.size());
        System.out.println(ht.get(2));
        ht.remove(2);
        System.out.println(ht.size());

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(0, "Priyanshu");
        ht1.put(1,"Rathore");
        //ht1.put("invalid","and");
        for(int i = 0;i<ht1.size();i++){
            System.out.println(ht1.get(i));
        }
    }
}
