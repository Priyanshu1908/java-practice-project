package InterfaceMultipleInheritance;

public class RunBank {
    public static void main(String[] args) {
        AxisBank bank = new AxisBank();
        //method implemented from USBank Interface
        bank.credit();
        bank.debit();

        //own methods
        bank.chequeBook();
        bank.passBook();

        //method implemented from UKBank Interface
        bank.homeLoan();
        bank.carLoan();

        //default method present in USBank Interface
        bank.mutualFunds();

        //method implemented from parent Interface WorldBank of child Interface USBank
        bank.globalLoan();

        //method overridden from parent class
        bank.goldLoan();

        //static method from Interface can be called in a static way
        USBank.rate();

        USBank us = new AxisBank();
        System.out.println(USBank.minBal);
        us.credit();
        us.debit();
        us.globalLoan();

        UKBank uk = new AxisBank();
        System.out.println(UKBank.minBal);
        uk.homeLoan();
        uk.carLoan();

        RBIBank rbi = new AxisBank();
        rbi.goldLoan();
    }
}
