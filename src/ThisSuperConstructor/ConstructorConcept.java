package ThisSuperConstructor;

public class ConstructorConcept {

    //Default constructor
    public ConstructorConcept(){
        System.out.println("Inside default constructor");
    }

    //Constructor Overloading
    public ConstructorConcept(int x){
        System.out.println("Inside Constructor with 1 parameter");
    }

    //Constructor Overloading
    public ConstructorConcept(int x, int y){
        System.out.println("Inside Constructor with 2 parameter");
    }

    public static void main(String[] args){
        //don't need to call by object reference just create an instance of a class
        ConstructorConcept obj = new ConstructorConcept();
        ConstructorConcept obj1 = new ConstructorConcept(10);
        ConstructorConcept obj2 = new ConstructorConcept(15,30);

    }
}
