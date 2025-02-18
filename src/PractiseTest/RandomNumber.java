package PractiseTest;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args){

        Random randomNumber = new Random();
        System.out.println(randomNumber.nextInt(100));
    }
}
