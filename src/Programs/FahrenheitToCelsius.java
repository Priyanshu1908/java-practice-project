package Programs;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter temperature in Fahrenheit: ");
        float tempF = input.nextFloat();
        float tempC = (tempF - 32) * 5 / 9;
        System.out.println("Temp in Celsius is:" + tempC);
    }
}
