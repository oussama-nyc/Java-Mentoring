/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops.polymorphism.methodOverloading;

/**
 *
 * @author newuser
 */
public class Shapes {

    public void area() {
        System.out.println("Find area ");
    }

    public void area(int r) {
        System.out.println("Circle area = " + 3.14 * r * r);
    }

    public void area(double b, double h) {
        System.out.println("Triangle area=" + 0.5 * b * h);
    }

    public void area(int l, int b) {
        System.out.println("Rectangle area=" + l * b);
    }
}
