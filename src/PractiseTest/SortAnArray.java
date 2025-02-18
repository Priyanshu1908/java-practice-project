package PractiseTest;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args){

        int[] arr = new int[]{12,54,34,56,16,76,39,79};
        Arrays.sort(arr);
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
