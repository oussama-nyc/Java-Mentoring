/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nestedClass;

/**
 *
 * @author newuser
 */
public class Outer {

    int outerVar = 15;

    public Outer() {

    }

    public void outerMethod() {
        System.out.println("this is outer class method");
    }
    
    //object of inner class
    Inner inner = new Inner();

    //subclass or inner class
    public class Inner {


        int innerVar = 20;

        public Inner() {

        }

        public void innerMethod() {
            System.out.println("this is inner class method");
        }
    }
}
