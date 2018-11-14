package Test5_2;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

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

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public Employee() {

    }
    public void riseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary+=raise;
    }

    public Employee(String name, double salary, int year,int mouth,int day) {

        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,mouth,day);
    }
}
