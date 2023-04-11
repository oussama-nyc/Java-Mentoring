/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author newuser
 */
public class HashSetTest {

    public static void main(String[] args) {

        // using HashSet to remove duplicate 
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(1);
        numberList.add(3);
        numberList.add(3);

        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet();
        numberSet.addAll(numberList);

        //Set <Integer> numberSet = new HashSet(numberList); 
        System.out.println(numberSet);

        //Insert Elements to HashSet
        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();

        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);

        // Using remove() method
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);
        System.out.println("New HashSet: " + numbers);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);

        //Access HashSet Elements
        HashSet<Integer> numbers2 = new HashSet<>();
        numbers2.add(2);
        numbers2.add(5);
        numbers2.add(6);
        System.out.println("HashSet: " + numbers2);

        // Calling iterator() method
        Iterator<Integer> iterate = numbers2.iterator();
        System.out.print("HashSet using Iterator: ");
        // Accessing elements
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");

            //Remove Elements
        }

    }
}
