package Programs;

public class PrimeNumber {

    public static void main(String[] args){
     PrimeNumber obj = new PrimeNumber();
     obj.getPrimeNumbers(23);
     obj.getPrimeNumbers(7);
    }

    public boolean isPrime(int x){
        if(x<=1){
            return false;
        }
        for(int i = 2; i < x; i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }

    public void getPrimeNumbers(int x){
        for(int i = 0; i <= x; i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }
}
