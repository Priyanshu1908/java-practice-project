package NewPractiseProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestOccurredWordInString {

    public static void main(String[] args) {
        System.out.print("Please enter your string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String[] strings = str.toLowerCase().split(" ");
        HashMap<String,Integer> map = new HashMap<>();

        for(String st : strings){
            if(map.containsKey(st)){
                map.put(st,map.get(st)+1);
            }else {
                map.put(st,1);
            }
        }

        int maxValue = 0;
        String maxWord = null;

        for(Map.Entry<String,Integer> s : map.entrySet()){
            if(s.getValue() > maxValue){
                maxValue = s.getValue();
                maxWord = s.getKey();
            }
        }

        System.out.println("Highest occurred word in your string is '" + maxWord + "' and value is: " + maxValue);
    }
}
