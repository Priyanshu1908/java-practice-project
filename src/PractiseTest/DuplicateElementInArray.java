package PractiseTest;

import java.util.Arrays;

public class DuplicateElementInArray {

    public static void main(String[] args){

        int[] arr = new int[]{4,5,2,4,6,5,2,5};

        for(int i = 0; i < arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Element found: " + arr[i]);
                }
            }
        }

        System.out.println("Another Approach: ---------");
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i + 1]){
                System.out.println("Duplicate Element found: " + arr[i]);
            }
        }
    }
}
