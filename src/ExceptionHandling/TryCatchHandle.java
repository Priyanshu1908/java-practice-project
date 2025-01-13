package ExceptionHandling;

public class TryCatchHandle {

    public static void main(String[] args){
        try {
            int a =9/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Arithmetic Exception Handled by Try Catch block");
    }
}
