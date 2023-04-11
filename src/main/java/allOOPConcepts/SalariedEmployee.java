/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allOOPConcepts;

/**
 *
 * @author oussama
 */
public class SalariedEmployee extends Employee implements Displayable {
    double salary;
    double bonus;
    double deductions;

    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public SalariedEmployee() {
    }

    public SalariedEmployee(double salary, double bonus, double deductions) {
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    public SalariedEmployee(double salary, double bonus, double deductions, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }
    
    @Override
    public double earnings(){
    return ( salary + bonus ) - deductions;
    }
    
    public void displayAllDetails(){
    System.out.println(super.toString());
    
    System.out.println(toString());
    
    }
    
    public void displayEarnings(){
        System.out.println("Earnings= " + earnings());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary + ", bonus=" + bonus + ", deductions=" + deductions + '}';
    }
    
    
}
