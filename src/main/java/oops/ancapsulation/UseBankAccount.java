/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops.ancapsulation;

/**
 *
 * @author newuser
 */
public class UseBankAccount {
    
    public static void main(String[] args) {
        
        BankAccount myBank = new BankAccount();
        myBank.setAccountType("Soouhlgh");
        //myBank.getAccountType();
        System.out.println(myBank.getAccountType());
        
        System.out.println(myBank.toString());
        
    }
    
}
