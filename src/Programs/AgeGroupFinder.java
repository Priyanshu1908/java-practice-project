package Programs;

import java.util.Scanner;

public class AgeGroupFinder {
    public static void main(String[] args) {
        System.out.println("Welcome to Age Group Finder");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        if(age<0){
            System.out.println("Invalid Input");
        }
        else if(age>=60){
            System.out.println("You are senior citizen");
        }else if(age >=20){
            System.out.println("You are an adult");
        } else if (age>=13) {
            System.out.println("You are a teenager");
        }else{
            System.out.println("You are a child");
        }

    }
}
