package MainMethodOverloading;

public class MainMethodOverloading {

    public static void main(String[] args){
        System.out.println("In Main method");
        main("test");
        main(15);
        main(2,7);
    }
    public static void main(String args){
        System.out.println("In Main method 1");
    }
    public static void main(int a){
        System.out.println("In main method 2");
    }
    public static void main(int a,int b){
        System.out.println("In Main method 3");
    }
}
