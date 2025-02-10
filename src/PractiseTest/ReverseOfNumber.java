package PractiseTest;

public class ReverseOfNumber {

    public static void main(String[] args){

        int x = 356;
        int rev = 0;
        int r;

        while(x>0){
            r = x%10;
            rev = rev*10 + r;
            x = x/10;
        }
        System.out.println(rev);
    }
}
