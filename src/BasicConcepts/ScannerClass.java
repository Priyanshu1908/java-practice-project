package BasicConcepts;

import java.util.Scanner;

public class ScannerClass {

    //Write an introduction using different data types in the program by user input

    public static void main(String[] args) {

        //Class to read user input
        ScannerClass obj = new ScannerClass();
        obj.readValueFromUser();

    }
    public void readValueFromUser(){
        var scanner = new Scanner(System.in);
        System.out.print("Please enter your full name:");
        String name = scanner.nextLine();
        System.out.print("Enter your Age:");
        int age = scanner.nextInt();
        System.out.print("Enter your Gender(M/F):");
        char gender = scanner.next().charAt(0);
        System.out.print("Enter your your mobile number:");
        long mobile = scanner.nextLong();
        System.out.print("Enter your High School CGPA:");
        double cgpa = scanner.nextDouble();
        System.out.println("Your Introduction is as below:");
        System.out.println("My Name is " + name + ". I am " + age + " years old. " + "My Gender is " + gender + ". My mobile number is " + mobile + ". I got " + cgpa + " CGPA in High School.");
        scanner.close();
    }
}
