/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops.abstraction;

/**
 *
 * @author newuser
 */
public abstract class Car {
    
    // note: by default access modifire package is private 
    float height;
    float weight;
    int numberOfWheels;

    abstract void autopilot();

    abstract void streamingServices();

    abstract void parkingSensors();
    
}
