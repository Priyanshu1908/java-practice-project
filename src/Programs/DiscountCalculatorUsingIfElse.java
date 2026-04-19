package Programs;

import java.util.Scanner;

public class DiscountCalculatorUsingIfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Gender(M/F): ");
        String gender = input.nextLine();
        System.out.print("Please Enter your age: ");
        int age = input.nextInt();

        if (gender.equalsIgnoreCase("M")) {
            if (age <= 5) {
                System.out.println("75% discount is provided as your are baby boy");
            } else if (age >= 60) {
                System.out.println("50% discount is provided as you are a Male Senior citizen");
            } else {
                System.out.println("No discount as you are Male Adult");
            }
        } else {
            if (age <= 5) {
                System.out.println("75% discount provided as you are baby girl");
            } else if(age >= 55) {
                System.out.println("50% discount provided as you are Female Senior Citizen");
            }else{
                System.out.println("25% discount provided as you are Female Adult");
            }
        }
    }
}
