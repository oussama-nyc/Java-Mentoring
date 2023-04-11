/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaEnum;

/**
 *
 * @author newuser
 */
public class UseOrder {
    public static void main(String[] args) {
        
        // Order 1
        Order order1 = new Order();
        order1.setStatus(Order.OrderStatus.DELIVERING);
        order1.isDeliverable();
        System.out.println(order1.isDeliverable());
        
        // Order 2 
        Order order2 = new Order();
        order2.setStatus(Order.OrderStatus.CANCELED);
        order2.isDeliverable();
        System.out.println(order2.isDeliverable());
    }
    
}
