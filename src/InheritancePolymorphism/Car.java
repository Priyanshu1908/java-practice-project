package InheritancePolymorphism;

public class Car extends Vehicle {
    public void start(){
        System.out.println("Car - start");
    }
    public void stop(){
        System.out.println("Car - Stop");
    }
    public void refuel(){
        System.out.println("Car - Refuel");
    }
}
