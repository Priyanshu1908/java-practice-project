package NewPractiseProgram;

import java.util.ArrayList;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] a = {1, 3, 4, 5, 7, 2};
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = a.length - 1; i >= 0; i--) {
            ar.add(a[i]);
        }
        System.out.println(ar);
    }
}
