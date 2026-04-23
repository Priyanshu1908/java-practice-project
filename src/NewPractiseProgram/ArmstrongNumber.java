package NewPractiseProgram;

import java.util.Scanner;

public class ArmstrongNumber {

    static int x;
    public static void main(String[] args) {

        System.out.print("Please enter any number: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        findArmstrong(x);
    }

    private static void findArmstrong(int y){

        int arm = 0;
        int r;

        while (y>0){
            r = y %10;
            arm = r*r*r + arm;
            y = y/10;
        }

        if(arm == x){
            System.out.println("Number is Armstrong: " + arm);
        }else {
            System.out.println("Number is not Armstrong: " + arm);
        }
    }
}
