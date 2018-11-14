package Test5_2;

import java.time.LocalDate;

public class Manager extends Employee{
    private double bonus;//奖金

    public Manager() {
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, int year, int mouth, int day) {
        super(name, salary, year, mouth, day);
        bonus = 0;

    }
}
