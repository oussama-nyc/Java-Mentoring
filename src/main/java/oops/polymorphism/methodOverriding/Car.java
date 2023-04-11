/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops.polymorphism.methodOverriding;

/**
 *
 * @author newuser
 */
public class Car extends Vehicle {

    //defining the same method as in the parent class  
    @Override
    void run() {

        System.out.println("car is running safely");
    }

}
