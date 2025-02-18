package PractiseTest;

public class PrintEvenValuesInArray {

    public static void main(String[] args){

        //Print even indexes values
        int[] arr = new int[]{51,65,21,54,64,54,12};

        for(int i = 0; i< arr.length;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }

}
