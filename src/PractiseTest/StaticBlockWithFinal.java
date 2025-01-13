package PractiseTest;

public class StaticBlockWithFinal {

    public static void main(String[] args){
        System.out.println(Main.x);
    }
}

class Main{
public static final int x = 100; //If you remove the final block then only static block will be executed
    static {
        System.out.println("Inside static block");
    }

}
