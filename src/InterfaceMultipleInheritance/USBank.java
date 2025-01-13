package InterfaceMultipleInheritance;

public interface USBank extends WorldBank{
    int minBal = 1000; //var are static and final in nature; value can't be changed

    //method are abstract without body; not static method; no main method; no object can be created;
    //can't create static method prototype in Interface
    //can create static method with method body can be used by Interface Name
    //can create default method with method body and can be used by child class

    public void credit();
    public void debit();
    default void mutualFunds(){
        System.out.println("USBank -- mutualFunds");
    }
    public static void rate(){
        System.out.println("USBank -- rate");
    }
}
