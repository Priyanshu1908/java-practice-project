package BasicConcepts;

public class LocalGlobalVariable {

    //Global Variables or Class Variables
    int a = 24;
    String b = "Selenium";

    public static void main(String[] args){
        //local variable for main method
        int i = 20;
        System.out.println("Local Variable of main method: " + i);
        LocalGlobalVariable glo = new LocalGlobalVariable();
        System.out.println("Global int Variable a: " + glo.a);
        System.out.println("Global String Variable b: " + glo.b);
        int s = glo.sum();
        System.out.println("Sum is: " + s);
    }
    public int sum(){
        //local variable for sum method
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }
}