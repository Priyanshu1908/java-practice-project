package ExceptionHandling;

public class ThrowsKeyword {

    public static void main(String[] args) throws Throwable{
    sum();
    }

    public static void sum(){
    div();
    }

    public static void div(){
        try {
            int a = 19/0;
            System.out.println(a);
        }
        catch(Throwable e){
            System.out.println(e.getMessage());
        }
        System.out.println("this statement only prints when exception is handled by try catch block");
    }
}
