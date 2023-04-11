/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allOOPConcepts;

/**
 *
 * @author oussama
 */
public class Main {

    public static void main(String[] args) {

        Department d1 = new Department(1, "Information Systems");

        SalariedEmployee se = new SalariedEmployee(2000, 500, 50, "Ahmed", "Riyadh", 1200, Gender.male);

        d1.addEmployee(se);

        HourlyEmployee he = new HourlyEmployee(100, 6, "Mohamed", "Kharj", 1500, Gender.male);

        d1.addEmployee(he);

        CommissionEmployee ce = new CommissionEmployee(15000, 0.25, "Fatema", "Riyadh", 1200, Gender.female);

        d1.addEmployee(ce);
        
        //-------------- Print our data -----------------------//
        
        // Print Number Of Employee
        System.out.println("Number Of Employee= " + d1.getEmployeeCount());

        // Print Basic Data
        System.out.println("Basic Data");
        d1.printBasicData();

        // Print All Details
        System.out.println("All Details");
        d1.printAllDetails();

    }
}
