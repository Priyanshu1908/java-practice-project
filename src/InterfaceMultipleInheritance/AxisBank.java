package InterfaceMultipleInheritance;

public class AxisBank extends RBIBank implements USBank,UKBank{ //multiple inheritance

    //Is-a relationship
    //If a class is implementing the Interface then it must define or override all the methods from the Interface
    //USBank method Implementation
    public void credit() {
        System.out.println("Axis - Credit");
    }
    public void debit() {
        System.out.println("Axis - Debit");
    }
    public void chequeBook(){
        System.out.println("Axis - ChequeBook");
    }
    public void passBook(){
        System.out.println("Axis - PassBook");
    }
    //UKBank method Implementation
    public void homeLoan() {
        System.out.println("Axis - Home Loan");
    }
    public void carLoan() {
        System.out.println("Axis - Car Loan");
    }
    public void globalLoan() {
        System.out.println("Axis -- Global Loan");
    }
    public void goldLoan(){
        System.out.println("Axis -- Gold Loan");
    }
}
