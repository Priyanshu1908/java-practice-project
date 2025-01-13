package PractiseTest;

public class IntegerCaching {

    public static void main(String[] args){

        Integer a = 128;
        Integer b = 128;

        //-128 to 127 = Range for Integer, so if out of this range will fail the condition
        //Integer Caching
        if(a == b){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
    }
}
