package BasicConcepts;

public class staticNonStatic {

    int a = 23;
    static int b = 32;

    public static void main(String[] args){
        System.out.println("Accessing global static variable b directly: " + b);
        System.out.println("Accessing global static variable by Class Name: " + staticNonStatic.b);
        System.out.println("Calling static method directly directly");
        sub();
        System.out.println("Calling static method by Class Name");
        staticNonStatic.sub();

        staticNonStatic obj = new staticNonStatic();
        System.out.println("Accessing global non static variable by object reference: " + obj.a);
        System.out.println("Calling non static method by object reference");
        obj.sum();
        System.out.println("Calling static method by Object reference");
        obj.sub();

    }
    public void sum(){
        System.out.println("Inside Non Static Method");
    }
    public static void sub(){
        System.out.println("Inside Static Method");
    }
}
