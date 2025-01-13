package ThisSuperConstructor;

public class ThisConcept {

    String name;
    int age;
    public ThisConcept(String name, int age){
        //Initializing class variable with local variable values using this keyword
        this.name = name;
        this.age = age;
        System.out.println("name: " + name + " age: " + age);
    }

    public int userAge(int age){
        this.age = age;
        System.out.println(age);
        return age;
    }

    public static void main(String[] args){
        ThisConcept obj = new ThisConcept("Priyanshu", 29);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(new ThisConcept("Sam",19).userAge(19));
    }
}
