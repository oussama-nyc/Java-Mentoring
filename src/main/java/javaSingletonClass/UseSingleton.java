/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaSingletonClass;

/**
 *
 * @author newuser
 */
public class UseSingleton {
    
    public static void main(String[] args) {
        Singleton object1 = Singleton.getIndtance();
        System.out.println("This is the object1: ");
        object1.showMessage();
        
      Singleton object2 = Singleton.getIndtance() ;
        System.out.println("This is the object2: ");
        object2.showMessage();
        
    }
    
}
