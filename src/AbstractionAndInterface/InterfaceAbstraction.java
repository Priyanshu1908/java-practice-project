package AbstractionAndInterface;

public interface InterfaceAbstraction {

    //100% abstraction can be achieved by the Interface before Java 8
    //By default the method in interface are abstract in nature
    //By default the variable in interface are static and final in nature
    //can create default method with method body and can be used by child class

    int x = 20;

    void loan();
    void credit();
    void debit();

}
