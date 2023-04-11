/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopsInJava;

/**
 *
 * @author newuser
 */
public class NestedDoWhileLoop {

    public static void main(String[] args) {

        // Nested do while loop
        
        int row = 1, column = 1;
        int x;
        do {
            x = 4;
            do {
               System.out.print("");
                x--;
           } while (x >= row);
             column = 1;
            do {
              System.out.print(column + " ");
               column++;

           } while (column <= 5);
           System.out.println(" ");
           row++;
        } while (row <= 5);
    }

}
