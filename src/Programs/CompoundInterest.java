package Programs;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Principle amount: ");
        int P = input.nextInt();
        System.out.print("Enter your tenure: ");
        float T = input.nextFloat();
        System.out.print("Enter your rate of interest: ");
        float R = input.nextFloat();

        double CI = P * Math.pow((1 + R / 100), T);
        System.out.println("Your compound interest is: " + CI);
    }
}
