/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops.inheritance;

/**
 *
 * @author newuser
 */
public class Test {

    public static void main(String args[]) {

        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
        
        mb.applyBrake(5);
        
        System.out.println(mb.toString());
        
    }

}
