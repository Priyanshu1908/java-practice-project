package FinalFinallyFinalize;

//if a final keyword is used for parent class then child class can't extend it
public class ParentClass {

    //If a final keyword is added to overridden method in parent class then child class can't override it
    public final void start(){
        System.out.println("Start Method in Parent Class");
    }
}
