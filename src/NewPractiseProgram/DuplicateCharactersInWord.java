package NewPractiseProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharactersInWord {

    public static void main(String[] args) {

        System.out.print("Please enter any string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        char[] chars = str.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for(Map.Entry<Character,Integer> ch : map.entrySet()){
            if(ch.getValue() > 1){
                System.out.println(ch.getKey() + ": " +ch.getValue());
            }
        }
    }
}
