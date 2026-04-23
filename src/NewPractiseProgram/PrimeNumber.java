package NewPractiseProgram;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the range for prime numbers: ");
        int x = input.nextInt();
        getPrime(x);
    }

    private static void getPrime(int x){
        for(int i = 2; i<=x; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int x){

        for(int i = 2; i< x; i++){

            if(x%i == 0) {
                return false;
            }
        }
        return true;
    }
}
