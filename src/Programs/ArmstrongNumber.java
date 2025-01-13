package Programs;

public class ArmstrongNumber {

    public static void main(String[] args){
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.isArmstrong(153);
        obj.isArmstrong(1);
        obj.isArmstrong(0);
        obj.isArmstrong(370);
        obj.isArmstrong(371);
    }

    public void isArmstrong(int x){
        int r;
        int sum=0;
        int t;

        t = x;

        while(x>0){
            r = x%10;
            sum = sum + (r*r*r);
            x=x/10;
        }

        if(sum == t){
            System.out.println(t + " is Armstrong");
        }else{
            System.out.println(t + " is not Armstrong");
        }
    }
}
