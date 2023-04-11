/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapperClasses;

import java.util.ArrayList;

/**
 *
 * @author newuser
 */
public class WrapperTest {

    public static void main(String[] args) {

        // primitive value 
        int i = 100;   // this is primitive variable 

        // wrapper value
        //Integer iobj = new Integer(i);
        //Integer jobj = new Integer(200);
        // Autobox-in 
        Integer iobj = i;  // this is reference variable 
        Integer jobj = 200;

        // Autobox-out
        //int sum = iobj + jobj;
        //before Autobox-out was introduced, we use to call the method intValue()
        //to extract the primitive value of an integer object 
        int sum = iobj.intValue() + jobj.intValue();

        System.out.println("sum= " + sum);

        System.out.println("i = " + i);
        System.out.println("iobj = " + iobj);
        System.out.println("jobj = " + jobj.toString());

        String str = "12";
        int num = Integer.parseInt(str);
        System.out.println(num * 2);

        //---------------------------------------------------//
        char ch = 'a';

        // Autoboxing- primitive to Character object
        // conversion
        Character a = ch;
        
        System.out.println(a);

        //---------------------------------------------------//
        ArrayList<Integer> arrayList
                = new ArrayList<Integer>();

        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);

        // printing the values from object
        System.out.println(arrayList.get(0));

        //---------------------------------------------------//
        Character ch2 = 'b';

        // unboxing - Character object to primitive
        // conversion
        char b = ch2;
        
        System.out.println(b);
        
        //---------------------------------------------------//

        ArrayList<Integer> arrayList2
                = new ArrayList<Integer>();
        arrayList2.add(24);

        // unboxing because get method returns an Integer
        // object
        int num2 = arrayList2.get(0);

        // printing the values from primitive data types
        System.out.println(num2);

    }
}
