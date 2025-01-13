package BasicConcepts;

public class InheritanceConcept {

    private String empName;
    private int age;
    private int empID;


    public static void main(String[] args){
        InheritanceConcept emp = new InheritanceConcept();
        emp.setEmpName("Priyanshu");
        emp.setAge(29);
        emp.setEmpID(13221005);

        System.out.println("Employee Details are: ");
        System.out.println("Employee Name: " + emp.getEmpName()+ "\n" + "Employee Age: " + emp.getAge() + "\n" +"Employee ID: " + emp.getEmpID());
    }

    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
}
