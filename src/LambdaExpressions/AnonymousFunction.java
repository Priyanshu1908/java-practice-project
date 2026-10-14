package LambdaExpressions;

public class AnonymousFunction {
    public static void main(String[] args) {

        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World!");
            }
        };
        greet.sayHello();
    }

    interface Greeting{
        void sayHello();
    }
}
