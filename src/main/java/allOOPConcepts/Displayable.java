/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package allOOPConcepts;

/**
 *
 * @author oussama
 */
public interface Displayable {

    // the attributes in the interface must be final 
    String company = "ABC";
    String fax = "0012356545678";
    
    public void displayAllDetails();
    public void displayEarnings();
}
