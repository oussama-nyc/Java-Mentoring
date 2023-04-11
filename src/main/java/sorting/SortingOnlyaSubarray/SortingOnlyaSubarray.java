/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting.SortingOnlyaSubarray;

import java.util.Arrays;

/**
 *
 * @author newuser
 */
public class SortingOnlyaSubarray {

    // Main drive method
    public static void main(String[] args) {
        // Custom input array
        int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};

        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 5);

        // Printing sorted array
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }

}
