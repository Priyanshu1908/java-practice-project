package NewPractiseProgram;

import java.util.Scanner;

public class AgeGroupFinder {

    public static void main(String[] args) {
        System.out.print("Please enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        FindAgeGroup(age);
    }

    private static void FindAgeGroup(int age) {
        if (age <= 0) {
            System.out.println("Invalid Age");
        } else if (age <= 13) {
            System.out.println("You're Child");
        } else if (age <= 17) {
            System.out.println("You're a Teenager");
        } else if (age <= 59) {
            System.out.println("You're an Adult");
        } else {
            System.out.println("You're Senior");
        }
    }
}
