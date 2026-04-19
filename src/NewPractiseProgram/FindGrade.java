package NewPractiseProgram;

import java.util.Scanner;

public class FindGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        float number = input.nextFloat();
        getGrade(number);
    }

    private static void getGrade(float num) {
        if (num > 90) {
            System.out.println("A+ Grade");
        } else if (num > 80) {
            System.out.println("A Grade");
        } else if (num > 70) {
            System.out.println("B Grade");
        } else if (num > 60) {
            System.out.println("C Grade");
        } else if (num > 50) {
            System.out.println("D Grade");
        } else if (num >= 33) {
            System.out.println("E Grade");
        } else {
            System.out.println("FAIL");
        }
    }
}
