package BasicConcepts;

public class FunctionsOrMethods {

    public static void main(String[] args){

        //We can't create method inside a method
        //non-static methods are called by class reference or by creating an object of a class
        FunctionsOrMethods obj = new FunctionsOrMethods();
        obj.testMethod();
        int sum = obj.sum();
        System.out.println("Sum is: " + sum);
        String s1 = obj.string();
        System.out.println("String is: " + s1);
        double d = obj.div(15, 2);
        System.out.println("Division is: " + d);
    }

    /**
     * no input and no output
     */
    public void testMethod(){
        System.out.println("Test Method");
    }

    /**
     * no input but some output
     * @return int c
     */
    public int sum(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum Method");
        return c;
    }

    /**
     * no input but some output
     * @return output string s
     */
    public String string(){
        String s = "Priyanshu Rathore";
        System.out.println("String method");
        return s;
    }

    /**
     * some input and some output
     * @param x input int x
     * @param y input int y
     * @return output int c
     */
    public double div(int x, int y){
        double c = (double) x/y;

        System.out.println("Division method");
        return c;
    }
}
