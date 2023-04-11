/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nestedClass;

/**
 *
 * @author newuser
 */
public class Test {

    public static void main(String[] args) {

        //object of outer class
        Outer outer = new Outer();

        outer.outerMethod();// this is outer class method

        //use object of the outer class to call the object of the inner class
        //to access inner class prop
        
        outer.inner.innerMethod(); // this is inner class method

    }
}
