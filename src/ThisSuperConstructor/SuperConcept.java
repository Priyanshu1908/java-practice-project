package ThisSuperConstructor;

public class SuperConcept extends ParentSuperClass{

    SuperConcept(){
        super();
        System.out.println(super.x);
        System.out.println("Inside child super class default constructor");
    }
    SuperConcept(int x){
        super(x);
        System.out.println("Inside child class constructor with 1 parameter");
    }
    SuperConcept(int x, int y){
        super(x,y);
        System.out.println("Inside child class constructor with 2 parameter");
    }

    public static void main(String[] args){
        SuperConcept obj = new SuperConcept(); //parent default constructor is called first before child default constructor
        SuperConcept obj1 = new SuperConcept(10);
        SuperConcept obj2 = new SuperConcept(20,30);
    }
}
