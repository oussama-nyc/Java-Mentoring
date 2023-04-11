/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopsInJava;

/**
 *
 * @author newuser
 */
public class BreakKeyword {

    public static void main(String[] args) {

        // Break keyword
        // For loop for iteration
        for (int i = 3; i <= 50; i += 3) {
            if (i == 39) {
                // Using Break keyword to suspend
                // loop when i become 39
                break;
            }

            // Printing elements showcasing break usage
            System.out.print(i + " ");
        }

    }

}
