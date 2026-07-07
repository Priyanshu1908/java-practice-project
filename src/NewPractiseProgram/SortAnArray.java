package NewPractiseProgram;

public class SortAnArray {

    public static void main(String[] args) {
        int[] ar = {2,1,5,4,7,6,9,8,3};

        for(int i =0; i < ar.length-1; i++){
            for(int j =0; j< ar.length-1; j++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1]= temp;
                }
            }
        }
        for(int a : ar){
            System.out.println(a);
        }
    }
}
