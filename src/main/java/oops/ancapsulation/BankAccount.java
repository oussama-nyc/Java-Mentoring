/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops.ancapsulation;

/**
 *
 * @author newuser
 */
public class BankAccount {

    private int accountNumber;
    private String accountType;
    private double minSavings = 2500;
    private double minChecking = 1000;
    private double currentBalance;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, String accountType, double currentBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.currentBalance = currentBalance;
    }
    
    

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        if (accountType.startsWith("S")) {
            this.accountType = "Savings";
        } else if (accountType.startsWith("C")) {
            this.accountType = "Checking";
        }

    }
    
    public void displayDetails(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", accountType=" + accountType + ", minSavings=" + minSavings + ", minChecking=" + minChecking + ", currentBalance=" + currentBalance + '}';
    }
    
    
}
