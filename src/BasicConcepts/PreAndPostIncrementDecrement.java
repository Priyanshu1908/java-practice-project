package BasicConcepts;

public class PreAndPostIncrementDecrement {

    public static void main(String[] args){

        preIncrement();
        postIncrement();
        preDecrement();
        postDecrement();
    }
    public static void preIncrement(){
        int i = 1;
        int j = ++i; //pre increment
        System.out.println("Pre Increment:");
        System.out.println(i);
        System.out.println(j);
        System.out.println("----");
    }
    public static void postIncrement(){

        int i = 1;
        int j = i++; //post increment
        System.out.println("Post Increment:");
        System.out.println(i);
        System.out.println(j);
        System.out.println("----");
    }
    public static void preDecrement(){
        int i = 2;
        int j= --i; //pre decrement
        System.out.println("Pre Decrement:");
        System.out.println(i);
        System.out.println(j);
        System.out.println("----");
    }
    public static void postDecrement(){
        int i = 2;
        int j = i--; //post decrement
        System.out.println("Post Decrement:");
        System.out.println(i);
        System.out.println(j);
    }
}
