package Programs;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Grading System");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your marks obtained: ");
        float marks = input.nextFloat();

        if(marks >= 90){
            System.out.println("A Grade");
        } else if (marks >=75) {
            System.out.println("B Grade");
        } else if (marks >= 60) {
            System.out.println("C Grade");
        } else if (marks >= 30) {
            System.out.println("D Grade");
        }else{
            System.out.println("Failed");
        }
    }
}
