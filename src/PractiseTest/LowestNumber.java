package PractiseTest;

public class LowestNumber {

    public static void main(String[] args){

        System.out.println(Double.MIN_VALUE); //+ve value
        System.out.println(Float.MIN_VALUE); //+ve value
        System.out.println(Integer.MIN_VALUE); //-ve value
        System.out.println(Long.MIN_VALUE); //-ve value

        System.out.println("------------------------------");

        System.out.println(Math.min(Double.MIN_VALUE,0.0d));
        System.out.println(Math.min(Float.MIN_VALUE,0.0f));
        System.out.println(Math.min(Integer.MIN_VALUE,0));
        System.out.println(Math.min(Long.MIN_VALUE,0L));

        System.out.println("------------------------------");

        System.out.println(Math.min(Double.MIN_VALUE,Double.NEGATIVE_INFINITY));
        System.out.println(Math.min(Float.MIN_VALUE,Float.NEGATIVE_INFINITY));
    }
}
