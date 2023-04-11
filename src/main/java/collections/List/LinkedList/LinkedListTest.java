/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.List.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author newuser
 */
public class LinkedListTest {

    public static void main(String[] args) {

        //Creating a Java LinkedList
        // create Integer type linked list
        LinkedList<Integer> linkedList1 = new LinkedList<>();

        // create String type linked list
        LinkedList<String> linkedList2 = new LinkedList<>();

        // create linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        // add() method with the index parameter
        animals.add(1, "Horse");
        System.out.println("Updated LinkedList: " + animals);

        //Access LinkedList elements
        LinkedList<String> languages = new LinkedList<>();

        // add elements in the linked list
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Java");
        System.out.println("LinkedList: " + languages);

        // change elements at index 3
        languages.set(3, "Kotlin");
        System.out.println("Updated LinkedList: " + languages);

        // get the element from the linked list
        String str = languages.get(1);
        System.out.print("Element at index 1: " + str);

        // remove elements from index 1
        String str1 = languages.remove(1);
        System.out.println("Removed Element: " + str1);

        System.out.println("Updated LinkedList: " + languages);

    }
}
