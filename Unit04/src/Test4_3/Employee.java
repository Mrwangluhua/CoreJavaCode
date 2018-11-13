package Test4_3;

public class Employee {
    public static int nextId = 1;


    private String name;
    private double salary;
    private int id;

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
        this.id = 0;
    }
    public static void main(String[] args){
        Employee e = new Employee("harry",50000);
        System.out.println(e.getName()+"\t"+e.getSalary());
    }
}
