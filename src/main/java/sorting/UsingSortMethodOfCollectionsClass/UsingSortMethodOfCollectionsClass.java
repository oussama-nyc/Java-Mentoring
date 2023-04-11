/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting.UsingSortMethodOfCollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author newuser
 */
public class UsingSortMethodOfCollectionsClass {

    public static void main(String[] args) {
        // Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);

        // Let us print the sorted list
        System.out.println("List after the use of"
                + " Collection.sort() :\n" + al);

        // Create a list of strings
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Geeks For Geeks");
        al2.add("Friends");
        al2.add("Dear");
        al2.add("Is");
        al2.add("Superb");
 
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al2, Collections.reverseOrder());
 
        // Let us print the sorted list
        System.out.println("List after the use of"
                           + " Collection.sort() :\n" + al2);
    }

}
