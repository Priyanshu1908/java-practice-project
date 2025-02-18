package PractiseTest;

public class PrintOddValueInArray {

    public static void main(String[] args){

        //Print odd indexes values
        int[] arr = new int[]{23,45,45,42,65,26,75,35,26};

        for(int i = 0;i<arr.length;i++){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }

    }
}
