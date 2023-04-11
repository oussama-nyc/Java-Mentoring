/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allOOPConcepts;

import java.util.ArrayList;

/**
 *
 * @author oussama
 */
public class Department {

    int dno;
    String dname;

    ArrayList<Employee> emplist;

    public Department() {
    }

    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
        emplist = new ArrayList<Employee>();
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void addEmployee(Employee e) {
        emplist.add(e);
    }

    public void removeEmployee(int idx) {
        emplist.remove(idx);
    }

    public int getEmployeeCount() {
        return emplist.size();
    }

    public void printBasicData() {
        for (int i = 0; i < emplist.size(); i++) {
            System.out.println(emplist.get(i).getSsn() + " " + emplist.get(i).getName() + " " + emplist.get(i).getSex());
        }
    }

    public void printAllDetails() {
        for (int i = 0; i < emplist.size(); i++) {
            if (emplist.get(i) instanceof SalariedEmployee) {
                ((SalariedEmployee) emplist.get(i)).displayAllDetails();
            }
            if (emplist.get(i) instanceof HourlyEmployee) {
                ((HourlyEmployee) emplist.get(i)).displayAllDetails();
            }

            if (emplist.get(i) instanceof CommissionEmployee) {
                ((CommissionEmployee) emplist.get(i)).displayAllDetails();
            }

        }
    }
}
