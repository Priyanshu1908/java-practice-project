package PractiseTest;

public class SmallestNumberInArray {

    public static void main(String[] args){
        int[] arr = new int[]{23,54,13,56,48,9,87,64,52};
        int min = arr[0];

        for(int i = 0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
