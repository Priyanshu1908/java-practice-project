package PractiseTest;

public class PalindromeNumber {

    public static void main(String[] args){

        int x = 13531;
        int temp = x;
        int n = 0;
        int r;

        while (temp>0){
            r = temp%10;
            n = n*10 + r;
            temp = temp/10;
        }
        if(n == x){
            System.out.println("Number is Palindrome: " + n);
        } else {
            System.out.println("Number is not Palindrome: " + n);
        }
    }
}
