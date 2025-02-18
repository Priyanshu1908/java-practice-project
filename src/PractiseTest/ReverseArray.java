package PractiseTest;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = new int[]{23, 34, 35, 74, 56, 26, 16, 43, 63};

        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println("\n" + "Revered array");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
