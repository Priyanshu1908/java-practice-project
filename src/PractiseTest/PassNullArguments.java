package PractiseTest;

public class PassNullArguments {
    public static void main(String[] args){
        test(null);
    }
    public static void test(Object o){}

    //Preference will be given to most appropriate data type
    public static void test(String s){}
}
