package AbstractionAndInterface;

public class InterfaceChild implements InterfaceAbstraction{
    @Override
    public void loan() {
        System.out.println("Implemented loan method");
    }

    @Override
    public void credit() {
        System.out.println("Implemented credit method");
    }

    @Override
    public void debit() {
        System.out.println("Implemented debit method");
    }

    public void fund(){
        System.out.println("Child class own method");
    }
}
