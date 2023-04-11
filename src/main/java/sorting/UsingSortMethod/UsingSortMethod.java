/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting.UsingSortMethod;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author newuser
 */
public class UsingSortMethod {

    // Main driver method
    public static void main(String[] args) {
        // Custom input array
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

        // Calling the sort() method present
        // inside Arrays class
        Arrays.sort(arr);

        // Printing and display sorted array
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));

        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr2 = {13, 7, 6, 45, 21, 9, 2, 100};

        // Sorts arr[] in descending order
        Arrays.sort(arr2, Collections.reverseOrder());
        
        System.out.println();
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr2));

    }
}
