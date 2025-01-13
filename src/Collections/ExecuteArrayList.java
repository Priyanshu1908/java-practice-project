package Collections;

import java.util.ArrayList;
import java.util.List;

public class ExecuteArrayList {
    public static void main(String[] args){

//        ArrayListConcepts ar = new ArrayListConcepts();
//        ar.arrayList();
//        ar.listHandle();

        List<Integer> l = new ArrayList();
        l.add(10);
        l.add(15);
        System.out.println(l);
        l.add(1,20);
        System.out.println(l);
    }
}
