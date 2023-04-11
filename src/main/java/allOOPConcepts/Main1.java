/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allOOPConcepts;

/**
 *
 * @author oussama
 */
public class Main1 {


    // Note : I test the code without using the Department Class.
    public static void main(String[] args) {

        // Salaried Employee :
        SalariedEmployee se = new SalariedEmployee(2000, 500, 50, "Ahmed", "Riyadh", 1200, Gender.male);
        System.out.println("Salaried Employee :");
        se.displayAllDetails();
        se.displayEarnings();

        // Hourly Employee :
        HourlyEmployee he = new HourlyEmployee(100, 6, "Mohamed", "Kharj", 1500, Gender.male);
        System.out.println("Hourly Employee :");
        he.displayAllDetails();
        he.displayEarnings();

        // CommissionE mployee :
        CommissionEmployee ce = new CommissionEmployee(15000, 0.25, "Fatema", "Riyadh", 1200, Gender.female);
        System.out.println("CommissionE mployee :");
        ce.displayAllDetails();
        ce.displayEarnings();

        // Base Plus Commission Employee :
        BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee(2000, 15000, 0.25, "Fatema", "Riyadh", 1200, Gender.female);
        System.out.println("Base Plus Commission Employee :");
        bpce.displayAllDetails();
        bpce.displayEarnings();

    }
}
