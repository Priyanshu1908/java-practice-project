package PractiseTest;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args){

        int[] arr = new int[]{12,54,34,56,16,76,39,79};
        for(int i =0; i<arr.length-1;i++){
            for(int j = 0; j <arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int a : arr) {
            System.out.println(a);
        }
    }
}
