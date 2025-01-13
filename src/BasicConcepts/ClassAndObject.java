package BasicConcepts;

public class ClassAndObject {

    int model;
    int wheels;

    public static void main(String[] args){
        ClassAndObject obj = new ClassAndObject();
        obj.classObject();
    }

    public void classObject(){

        ClassAndObject a = new ClassAndObject();
        ClassAndObject b = new ClassAndObject();
        ClassAndObject c = new ClassAndObject();

        a.model = 2013;
        a.wheels = 4;
        b.model = 2017;
        b.wheels = 4;
        c.model = 2021;
        c.wheels = 4;

        System.out.println("a: " + a.model + " b: " + b.model + " c: " + c.model);

        //Shifting the reference
        a=b;
        b=c;
        c=a;

        System.out.println("After shifting reference:");
        System.out.println("a model is: " + a.model);
        System.out.println("b model is: " + b.model);
        System.out.println("c model is: " + c.model);
    }
}
