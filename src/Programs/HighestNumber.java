package Programs;

import java.util.Scanner;

public class HighestNumber {

    public static void main(String[] args){

        HighestNumber highestNumber = new HighestNumber();
        highestNumber.findHighestNumber();

    }
    //Logic to find out highest among three numbers using comparison operator and if else condition
    public void findHighestNumber(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's find out highest among three numbers");

        System.out.print("Enter you first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter your second number is: ");
        int b = scanner.nextInt();
        System.out.print("Enter your third number is: ");
        int c = scanner.nextInt();

        if(a>b && a>c){
            System.out.println("First is highest number which is: " + a);
        } else if (b>c) {
            System.out.println("Second is highest number which is: " + b);
        }else{
            System.out.println("Third is highest number which is: " + c);
        }
        scanner.close();
    }
}
