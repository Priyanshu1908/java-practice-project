package PractiseTest;

public class StringConstantPool {

    public static void main(String[] args){

        String s1 = new String("Hello World");
        String s2 = new String("Hello World");

        String s3 = "Hello World";
        String s4 = "Hello World";
        String s5 = "Hello World";

        System.out.println(s1 == s2);

        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s3 == s5);

        System.out.print(s1 == s3);
    }
}
