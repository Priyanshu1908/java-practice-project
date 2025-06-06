package Programs;

public class SwapTwoStringsWithoutThirdVariable {

    public static void main(String[] args){

        String a = "test";
        String b = "automation";

        System.out.println("First word:" + a);
        System.out.println("Second word: " + b);

        a = a + b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("First word:" + a);
        System.out.println("Second word: " + b);
    }
}