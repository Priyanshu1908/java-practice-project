package ExceptionHandling;

public class NullPointerExceptionHandle {

    int a = 10;
    static NullPointerExceptionHandle obj;

    public static void main(String[] args){

        //Uncaught exception
        //int x = 9/0;

        //caught exception
        //Thread.sleep(1000);

        //NullPointerExceptionHandle obj = new NullPointerExceptionHandle();
        obj = null;
        try {
            System.out.println(obj.a);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Null Pointer Exception was handled");
    }
}
