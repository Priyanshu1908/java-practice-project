package Programs;

import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        int x = input.nextInt();
        if((x & 1) == 1){
            System.out.println("Number is odd");
        }else {
            System.out.println("Number is even");
        }
    }
}
