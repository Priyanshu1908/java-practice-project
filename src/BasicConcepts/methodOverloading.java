package BasicConcepts;

public class methodOverloading {

    //methods with same name and having same no. of arguments of same datatype are not allowed

    public static void main(String[] args) {

        methodOverloading method = new methodOverloading();
        method.sum();
        method.sum(13);
        method.sum(34.12);
        method.sum(32, 21);
        method.sum(42, 13.43);
        method.sum(12, 43, 12);

    }

    public void sum() {
        System.out.println("Method with no parameter");
    }

    public void sum(int x) {
        System.out.println("Method with 1 parameter:" + x);
    }

    public void sum(double a) {
        System.out.println("Method with 1 parameter but different data type: " + a);
    }

    public void sum(int y, int z) {
        System.out.println("Method with 2 parameters: " + y + " and " + z);
    }

    public void sum(int l, double m) {
        System.out.println("Method with 2 parameters but different data types: " + l + " and " + m);
    }

    public void sum(int p, int q, int r) {
        System.out.println("Method with 3 parameters: " + p + ", " + q + " and " + r);
    }
}
