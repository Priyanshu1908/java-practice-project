package ThisSuperConstructor;

import FinalFinallyFinalize.ParentClass;

public class ParentSuperClass {

    int x=20;

    ParentSuperClass(){
        System.out.println("Inside parent super class default constructor");
    }
    ParentSuperClass(int a){
        System.out.println("Inside parent super class constructor with 1 parameter");
    }
    ParentSuperClass(int a, int b){
        System.out.println("Inside parent super class constructor with 2 parameter");
    }
}
