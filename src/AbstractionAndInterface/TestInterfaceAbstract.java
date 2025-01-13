package AbstractionAndInterface;

public class TestInterfaceAbstract {

    public static void main(String[] args) {
        InterfaceChild a = new InterfaceChild();
        a.loan();
        a.credit();
        a.debit();
        a.fund();

        InterfaceAbstraction b = new InterfaceChild();
        b.loan();
        b.credit();
        b.debit();
        //b.fund(); Cannot use child class owned method by Interface obj reference
    }
}
