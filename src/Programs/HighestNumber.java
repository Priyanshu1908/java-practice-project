package Programs;

import java.util.Scanner;

public class HighestNumber {

    public static void main(String[] args) {

        HighestNumber highestNumber = new HighestNumber();
        highestNumber.findHighestNumber();

    }

    //Logic to find out highest among three numbers using comparison operator and if else condition
    public void findHighestNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's find out highest among three numbers");

        System.out.print("Enter you first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter your second number is: ");
        int b = scanner.nextInt();
        System.out.print("Enter your third number is: ");
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is highest number");
        } else if (b >= c) {
            System.out.println(b + " is highest number");
        } else {
            System.out.println(c + " is highest number");
        }
        scanner.close();
    }
}
