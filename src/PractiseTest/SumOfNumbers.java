package PractiseTest;

public class SumOfNumbers {

    public static void main(String[] args){

        int sum = 0;
        int x = 12345;
        int r;

        while(x>0){
            r = x%10;
            sum = sum + r;
            x = x/10;
        }
        System.out.println(sum);
    }
}
