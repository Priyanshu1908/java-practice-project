package BasicConcepts;

public class LocalGlobalVariable {

    //Global Variables or Class Variables
    static int a = 24;
    static float b = 95.15f;
    String c = "Selenium";

    public static void main(String[] args) {
        //local variable for main method
        int i = 20;
        System.out.println("Local Variable of main method: " + i);
        LocalGlobalVariable glo = new LocalGlobalVariable();
        System.out.println("Global int Variable a: " + a); //static global variable can be called directly from static method
        System.out.println("Global float variable b " + LocalGlobalVariable.b); //static variable can be called by class reference
        System.out.println("Global String Variable c: " + glo.c); //non-static variable is called by creating an object of class
        int s = glo.sum();
        System.out.println("Sum is: " + s);
    }

    public int sum() {
        int a = 10;
        int b = 20;
        return a + b;
    }
}