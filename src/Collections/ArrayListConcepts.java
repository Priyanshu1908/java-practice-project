package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

    public void arrayList() {

        Employee e1 = new Employee("Nitin", 123, "Tester");
        Employee e2 = new Employee("Mukul", 135, "Designer");
        Employee e3 = new Employee("Priyanshu", 138, "Tester");
        ArrayList<Employee> ar = new ArrayList();
        ar.add(e1);
        ar.add(e2);
        ar.add(e3);
        Iterator<Employee> it = ar.iterator();
        while(it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.id);
            System.out.println(emp.role);
            System.out.println("-------------");
        }
    }
    public void listHandle(){
        ArrayList ar1 = new ArrayList();
        ar1.add("Priyanshu");
        ar1.add(138);
        ar1.add("Tester");

        ArrayList ar2 = new ArrayList();
        ar2.add("Divya");
        ar2.add(143);
        ar2.add("Queen");

        ar1.addAll(ar2);
        for(Object a : ar1){
            System.out.println(a);
        }
        System.out.println("----------");
        ar1.removeAll(ar2);
        for(Object b : ar1){
            System.out.println(b);
        }
        System.out.println("----------");

        ArrayList ar3 = new ArrayList();
        ar3.add("Priyanshu");
        ar3.add(143);
        ar3.add("Tester");

        ArrayList ar4 = new ArrayList();
        ar4.add("Divya");
        ar4.add(143);
        ar4.add("Queen");
        ar3.retainAll(ar4);
        for(Object c : ar3){
            System.out.println(c);
        }
    }

}
