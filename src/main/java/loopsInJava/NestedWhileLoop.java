/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopsInJava;

/**
 *
 * @author newuser
 */
public class NestedWhileLoop {

    public static void main(String[] args) {

        // Nested While Loop
        int i = 1, j = 1;
        while (i <= 3) {
            while (j <= 3) {
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
            j = 1; 
        }
    }

}
