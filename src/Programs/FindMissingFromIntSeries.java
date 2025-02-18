package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingFromIntSeries {

    public static void main(String[] args){

        int[] arr = new int[]{4,2,6,9,3,5};

        Arrays.sort(arr);
        int n = arr[arr.length-1];

        List<Integer> list = new ArrayList<>();

        for(int i=1; i <=n; i++){
            boolean found = false;
            for(int x : arr){
                if(x == i){
                    found =true;
                    break;
                }
            }
            if(!found){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
