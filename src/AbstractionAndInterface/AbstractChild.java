package AbstractionAndInterface;

public class AbstractChild extends AbstractionConcept{
    @Override
    public void loan() {
        System.out.println("Abstract method loan method implementation");
    }
    public void fund(){
        System.out.println("Child class own method fund");
    }
}
