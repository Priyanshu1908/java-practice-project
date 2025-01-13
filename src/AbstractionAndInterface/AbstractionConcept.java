package AbstractionAndInterface;

public abstract class AbstractionConcept {

    //partial abstraction can be achieved by the abstract class
    //Abstract class can have abstract method as well as non abstract method
    // we can declare all types of variable in abstract class
    //It can have its own method implementation

    int x = 10;
    static String y = "test";
    final int z = 15;

    public abstract void loan();

    public void credit(){
        System.out.println("Abstract parent credit");
    }
    public void debit(){
        System.out.println("Abstract parent debit");
    }
}
