package Programs;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        int x = input.nextInt();

        if(x%2==0){
            System.out.println("Number is even: " + x);
        }else {
            System.out.println("Number is odd: " + x);
        }
    }
}
