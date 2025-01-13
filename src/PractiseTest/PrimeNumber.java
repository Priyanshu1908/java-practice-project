package PractiseTest;

public class PrimeNumber {

    public static void main(String[] argrs){
        getPrime(19);
    }

    public static void getPrime(int x){
        for(int i=0;i<=x;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int x){
        if(x<=1){
            return false;
        }
        for(int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
