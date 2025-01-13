package PractiseTest;

public class NaNConcept {

    public static void main(String[] args){

        System.out.println(0.0/0.0);  //NaN
        System.out.println(Math.sqrt(-1));

        System.out.println(Float.NaN == Float.NaN);
        System.out.println(Float.NaN != Float.NaN);

        double d = 2.1 % 0;
        System.out.println(d);
        System.out.println(d == d);
    }
}
