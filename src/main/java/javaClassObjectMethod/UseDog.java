/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaClassObjectMethod;

/**
 *
 * @author newuser
 */
public class UseDog {

    public static void main(String[] args) {

        // First Dog : Neapolitan Mastiff
        Dog neapolitanMastiff = new Dog();
        neapolitanMastiff.breed = "Neapolitan Mastiff";
        neapolitanMastiff.size = "Large";
        neapolitanMastiff.age = 5;
        neapolitanMastiff.color = "Black";
        System.out.println("First Dog :");
        System.out.println(neapolitanMastiff.getInfo());

        // Second Dog : maltese
        Dog maltese = new Dog();
        maltese.breed = "Maltese";
        maltese.size = "Small";
        maltese.age = 2;
        maltese.color = "white";
        System.out.println("Second Dog");
        System.out.println(maltese.getInfo());

        // Third Dog : Chow Chow
        Dog chowChow = new Dog();
        chowChow.breed = "Chow Chow";
        chowChow.size = "Midium";
        chowChow.age = 3;
        chowChow.color = "Brown";
        System.out.println("Third Dog :");
        System.out.println(chowChow.getInfo());
    }
}
