package Programs;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number for which you want to print table: ");
        int num = input.nextInt();
        printTable(num);
    }

    private static void printTable(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}
