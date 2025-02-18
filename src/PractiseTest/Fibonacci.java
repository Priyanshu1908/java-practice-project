package PractiseTest;

public class Fibonacci {

    static int n1 = 0;
    static int n2 = 1;
    static int n3;

    public static void main(String[] args) {

        int x = 10;
        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.println(n1 + "\n" + n2);

        for (int i = 2; i < x; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }

        fibonacci(x);
    }

    public static void fibonacci(int count) {

        System.out.println("----" + "\n" + n1 + "\n" + n2);
        printFibonacci(count - 2);
    }

    public static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            printFibonacci(count - 1);
        }
    }
}
