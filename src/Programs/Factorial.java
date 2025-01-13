package Programs;

public class Factorial {

    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(factorial(4));
        System.out.println(fact(5));
        System.out.println(fact(4));
    }

    public static int factorial(int x){
        int fact = 1;
        if(x == 0){
            return 1;
        }

        for(int i = 1; i<=x; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int fact(int x){
        if(x==0){
            return 1;
        }
        else{
            return (x * fact(x-1));
        }
    }
}
