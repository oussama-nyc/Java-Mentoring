/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopsInJava;

/**
 *
 * @author newuser
 */
public class NestedWhileAndForLoop {

    public static void main(String[] args) {

        // Nested While And For Loop
        
        int weeks = 4;
        int days = 7;
        int i = 1;

        // outer loop
        while (i <= weeks) {
            System.out.println("Week: " + i);

            // inner loop
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Days: " + j);
            }
            ++i;
        }
    }

}
