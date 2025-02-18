package PractiseTest;

public class DiamondShape {

    public static void main(String[] args){
        int i, j, row = 6;
        for(i=0; i<row;i++){
            for(j=row-i; j>=0; j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=row-2;i>=0;i--){
            for(j=row;j>=i;j--){
                System.out.print(" ");
            }for(j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
