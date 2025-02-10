package PractiseTest;

public class ArmstrongNumber {

    public static void main(String[] args){

        int temp = 0;
        int n = 371;
        int x = n;
        int r;

        while(n>0){
            r = n%10;
            temp = temp + (r*r*r);
            n = n/10;
        }
        if(x == temp){
            System.out.println("Number is Armstrong");
        }else {
            System.out.println("Number is not Armstrong");
        }
    }
}
