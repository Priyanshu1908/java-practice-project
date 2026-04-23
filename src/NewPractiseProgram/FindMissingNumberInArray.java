package NewPractiseProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingNumberInArray {

    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 4, 6, 8, 10};
        Arrays.sort(ar);
        int n = ar[ar.length-1];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            boolean found = false;
            for(int x : ar){
                if(x == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
