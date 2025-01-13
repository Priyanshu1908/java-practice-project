package BasicConcepts;

public class TwoDimensionalArray {

    public static void main(String[] args){
        twoDArray();
    }
    public static void twoDArray() {
        String[][] arr = new String[2][3];

        arr[0][0] = "A1";
        arr[0][1] = "B1";
        arr[0][2] = "C1";

        arr[1][0] = "A2";
        arr[1][1] = "B2";
        arr[1][2] = "C2";

        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                System.out.println(arr[row][col]);
            }
        }
    }
}
