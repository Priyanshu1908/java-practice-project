package BasicConcepts;

public class WrapperClasses {

    public static void main(String[] args){
        WrapperClasses wrap = new WrapperClasses();
        wrap.wrapInt();
        wrap.wrapDouble();
        wrap.wrapBoolean();
        wrap.wrapString();
    }
    public void wrapInt() {

        String s = "1919";
        int i = Integer.parseInt(s);
        System.out.println("Using Integer Wrapper Class: " + (i+1));
    }
    public void wrapBoolean(){

        String s = "true";
        boolean b = Boolean.parseBoolean(s);
        System.out.println("Using Boolean Wrapper Class: " + b);
    }
    public void wrapDouble(){
        String s = "12.34";
        double d = Double.parseDouble(s);
        System.out.println("Using Double Wrapper Class: " + d);
    }
    public void wrapString(){
        int i = 1919;
        String s = String.valueOf(i);
        System.out.println("Using String Wrapper Class: " + s);
    }
}
