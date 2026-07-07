package NewPractiseProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestOccurredAlphabetInString {

    public static void main(String[] args) {
        System.out.print("Please enter any string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : chars){
            if(c != ' ') {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }

        int maxCount = 0;
        char maxAlphabet = 0;
        for(Map.Entry<Character,Integer> cha : map.entrySet()){
            if(cha.getValue() > maxCount){
                maxAlphabet = cha.getKey();
                maxCount = cha.getValue();
            }
        }

        System.out.println("Highest occurred alphabet is '" + maxAlphabet + "' and value is: " + maxCount);
    }
}
