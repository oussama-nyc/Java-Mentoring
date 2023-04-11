/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allOOPConcepts;

/**
 *
 * @author oussama
 */
public class CommissionEmployee extends Employee implements Displayable {
    
    double gross_sales;
    double commission_rate;

    public double getGross_sales() {
        return gross_sales;
    }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }

    public CommissionEmployee() {
    }

    public CommissionEmployee(double gross_sales, double commission_rate) {
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }

    public CommissionEmployee(double gross_sales, double commission_rate, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }

    @Override
    public double earnings() {
        return gross_sales * commission_rate ;
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
        return "CommissionEmployee{" + "gross_sales=" + gross_sales + ", commission_rate=" + commission_rate + '}';
    }
    
    
    
    
    
}
