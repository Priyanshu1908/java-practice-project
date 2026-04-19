package Programs;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLease enter your Principle amount: ");
        int P = input.nextInt();
        System.out.print("Enter your Tenure: ");
        float T = input.nextFloat();
        System.out.print("Enter you rate of interest: ");
        float R = input.nextFloat();
        float SI = (P * R * T) / 100;
        System.out.println("Your Simple Interest is: " + SI);
    }
}
