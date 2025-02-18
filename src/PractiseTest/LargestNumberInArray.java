package PractiseTest;

public class LargestNumberInArray {

    public static void main(String[] args){

        int[] arr = new int[]{94,23,43,72,23,12,67};
        int max = arr[0];
        for(int i = 0; i<arr.length;i++){

            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
