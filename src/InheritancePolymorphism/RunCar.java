package InheritancePolymorphism;

public class RunCar {
    public static void main(String[] args){
        //Polymorphism, Inheritance and Method Overriding Concepts
        Car c = new Car();
        c.engine();
        c.start();
        c.stop();
        c.refuel();
        System.out.println("---------------------");

        //static polymorphism or compile time polymorphism
        Hyundai venue = new Hyundai();
        venue.engine();
        venue.start(); //Method Overriding
        venue.stop();
        venue.refuel();
        venue.theftAlarm();
        System.out.println("---------------------");

        //dynamic polymorphism or run time polymorphism
        //Top Casting
        Car c1 = new Hyundai();
        c1.engine();
        c1.start(); //Method Overriding
        c1.stop();
        c1.refuel();

        //Down Casting - which is not allowed, it will throw ClassCastException
        Hyundai aura = (Hyundai) new Car();
        aura.engine();
    }
}
