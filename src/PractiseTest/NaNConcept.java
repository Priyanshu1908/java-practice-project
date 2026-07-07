package PractiseTest;

public class NaNConcept {

    public static void main(String[] args){

        System.out.println(0.0/0.0);  //NaN
        System.out.println(Math.sqrt(-1)); //Nan

        System.out.println(Float.NaN == Float.NaN); //false
        System.out.println(Float.NaN != Float.NaN); //true

        double d = 2.1 % 0;
        System.out.println(d); //Nan
        System.out.println(d == d); //false
    }
}
