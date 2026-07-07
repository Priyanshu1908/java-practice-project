package Programs;

import java.util.ArrayList;

public class GetTheIndexesOfTwoNumbersInArrayIfTheirSumEqualsTarget {

    public static void main(String[] args) {
        int[] ar = {2,3,22,33,38};

        int target= 25;

        int[] output = {1,2};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < ar.length-1 ; i++){
            if((ar[i]+ar[i+1]) == target){
                list.add(i);
                list.add(i+1);
            }
        }
        System.out.println(list);
    }
}
