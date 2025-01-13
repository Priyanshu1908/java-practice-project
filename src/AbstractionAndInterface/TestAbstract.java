package AbstractionAndInterface;

public class TestAbstract {

    public static void main(String[] args){

        AbstractChild a = new AbstractChild();
        a.credit();
        a.debit();
        a.loan();
        a.fund();

        AbstractionConcept b = new AbstractChild();
        b.credit();
        b.debit();
        b.loan();
        //b.fund(); Cannot use child class owned method by Abstract class obj reference
    }
}
