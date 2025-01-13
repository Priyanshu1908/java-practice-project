package FinalFinallyFinalize;

public class FinallyConcept {

    public static void main(String[] args) {
        test1();
        System.out.println("----------------------------");
        test2();
        System.out.println("----------------------------");
        test3();
    }
    public static void test1() {
        try {
            System.out.println("Inside test1 try block");
            throw new RuntimeException();
        }catch (Exception e) {
            System.out.println("Inside test1 catch block");
        } finally {
            System.out.println("Inside test1 finally block"); //finally block is always executed irrespective of condition
        }
    }
    public static void test2(){
        try {
            System.out.println("Inside test2 try block");
        } finally {
            System.out.println("Inside test2 finally block"); //finally block is always executed irrespective of condition
        }
    }
    public static void test3(){
        try {
            int a = 10;
            System.out.println("Inside test3 try block");
            int b = a/0;
            System.out.println(b);
        } catch (NullPointerException e) {
            System.out.println("Inside test3 catch block");
        } finally {
            System.out.println("Inside test3 finally block"); //finally block is always executed irrespective of condition
        }
    }

}
