/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allOOPConcepts;

/**
 *
 * @author oussama
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double base;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(double base) {
        this.base = base;
    }

    public BasePlusCommissionEmployee(double base, double gross_sales, double commission_rate) {
        super(gross_sales, commission_rate);
        this.base = base;
    }

    public BasePlusCommissionEmployee(double base, double gross_sales, double commission_rate, String name, String address, int ssn, Gender sex) {
        super(gross_sales, commission_rate, name, address, ssn, sex);
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double earnings() {
        return base + super.earnings();
    }

    @Override
    public void displayAllDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public void displayEarnings() {
        System.out.println("Earnings= " + earnings());
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" + "base=" + base + '}';
    }
    
    
}
