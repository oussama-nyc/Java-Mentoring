/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaSingletonClass;

/**
 *
 * @author newuser
 */
public class Singleton {
    
    //Private Static instance of the singleton class. ( this refers to the single object )
    private static Singleton singleton = new Singleton();

    
    //Private Constructor : to restrict object creation outside of the class
    private Singleton() {
    }
    
    
    //Public Static method : this allows us to create and access the object we created inside the method.

    public static Singleton getIndtance(){
    
    return singleton;
    }
    
    //Message
    
    public void showMessage(){
        System.out.println("Hello World");
    }
}
