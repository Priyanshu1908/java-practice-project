package Programs;

public class Palindrome {

    public static void main(String[] args){
        Palindrome obj = new Palindrome();
        obj.getPalindrome(14541);
    }

    public void getPalindrome(int a){

        int r = 0;
        int sum = 0;
        int t;

        t = a;

        while(a>0){
                r = a%10;
                sum = (sum*10) + r;
                a  = a/10;
        }

        if(sum == t){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
        }
    }
}
