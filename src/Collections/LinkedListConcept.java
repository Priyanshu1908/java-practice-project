package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

    public static void main(String[] args){

        LinkedListConcept obj = new LinkedListConcept();
        obj.linkedList();
    }

    public void linkedList(){

        LinkedList<String> ll = new LinkedList<>();
        ll.add("My");
        ll.add("Name");
        ll.add("is");
        ll.add("Priyanshu");

        System.out.println(ll);

        System.out.println("*******Values using for loop*******");
        for(int i = 0; i<ll.size(); i++){
            System.out.println(ll.get(i));
        }

        System.out.println("*******Values using advance for loop*******");
        for(Object ob : ll){
            System.out.println(ob);
        }

        System.out.println("*******Values using while loop*******");
        int num =0;
        while(ll.size()>num){
            System.out.println(ll.get(num));
            num++;
        }

        System.out.println("*******Values using Iterator*******");
        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("*****Adding values to LinkedList*****");
        ll.addFirst("Hello");
        ll.addLast("Rathore");
        System.out.println(ll);

        System.out.println("*****Removing values to LinkedList*****");
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        System.out.println("******Changing any value from LinkedList*****");
        ll.set(3,"Divya");
        System.out.println(ll);

    }
}
