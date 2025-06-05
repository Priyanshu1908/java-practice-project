package PractiseTest;

import java.util.*;

public class PractiseProgram {

    public static void main(String[] args) {
        int[] arr = {2,6,3,9};
        int n = arr[arr.length-1];
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=n;i++){
            boolean found = false;
            for(int x : arr){
                if(x == i){
                    found = true;
                }
            }

            if(!found){
                list.add(i);
            }
        }

        System.out.println(list);
    }


}
