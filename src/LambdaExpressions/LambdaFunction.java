package LambdaExpressions;

public class LambdaFunction {
    public static void main(String[] args) {
        Greeting greet = () -> System.out.println("Hello World!");
        greet.sayHello();
    }
    interface Greeting{
        void sayHello();
    }
}
