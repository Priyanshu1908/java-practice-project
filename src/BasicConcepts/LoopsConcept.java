package BasicConcepts;

public class LoopsConcept {

    public static void main(String[] args){
        LoopsConcept loopsConcept = new LoopsConcept();
        loopsConcept.whileLoop();
        loopsConcept.forLoop();
    }
    //Print 1 to 10 natural numbers
    public void whileLoop() {
        int i = 1;
        System.out.print("Natural numbers 1 to 10 using while loop: ");
        while (i <= 10) {
            System.out.print(i);
            i++;
        }
    }

    public void forLoop(){
        System.out.println();
        System.out.print("Natural numbers 1 to 10 using for loop: ");
        for(int i = 1;i<=10;i++){
            System.out.print(i);
        }
    }
}
