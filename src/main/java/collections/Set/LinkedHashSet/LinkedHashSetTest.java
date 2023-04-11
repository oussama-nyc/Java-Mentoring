/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.Set.LinkedHashSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author newuser
 */
public class LinkedHashSetTest {

    public static void main(String[] args) {

        //Creating LinkedHashSet from Other Collections
        // Creating an arrayList of even numbers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("ArrayList: " + evenNumbers);

        // Creating a LinkedHashSet from an ArrayList
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);
        System.out.println("LinkedHashSet: " + numbers);

        //Insert Elements to LinkedHashSet
        LinkedHashSet<Integer> numbers2 = new LinkedHashSet<>();
        // Using addAll() method
        numbers2.addAll(evenNumbers);
        numbers2.add(5);
        System.out.println("New LinkedHashSet: " + numbers2);

        //Access LinkedHashSet Elements
        // Calling the iterator() method
        Iterator<Integer> iterate = numbers2.iterator();

        System.out.print("LinkedHashSet using Iterator: ");

        // Accessing elements
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        //Remove Elements from HashSet
        // Using the remove() method
        boolean value1 = numbers2.remove(5);
        System.out.println("Is 5 removed? " + value1);

        boolean value2 = numbers2.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);

    }
}
