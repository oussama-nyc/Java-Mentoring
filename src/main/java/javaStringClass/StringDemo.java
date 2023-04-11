/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaStringClass;

import java.util.Arrays;

/**
 *
 * @author newuser
 */
public class StringDemo {

    public static void main(String[] args) {

        // Here is an example of creating a String object:
        //String myString = "Hello, world!";
        String myString = new String("Hello, world!");
        System.out.println(myString);
        //This creates a String object called myString that contains the text "Hello, world!".

        //Compare strings to find out if they are equal:
        //Here are some common methods of the String class:
        
        //0 - equals () : to compare 2 string 
        //String s1 = "HELLO";
        //String s2 = "HELLO";
        //System.out.println(s1==s2); // returns true 
        
        //String s1 = new String("HELLO");
        //String s2 = new String("HELLO");
        //System.out.println(s1==s2); // returns false
        
        //System.out.println(s1.equals(s2)); // return true
        
        // 1- length(): returns the length of the String
        int length = myString.length(); // returns 13
        System.out.println(myString.length());

        // 2- charAt(int index): returns the character at the specified index.
        char firstChar = myString.charAt(0); // returns 'H'
        System.out.println(firstChar);

        //3- substring(int beginIndex): returns a new String that is a substring 
        //of the original String starting from the specified index.
        String subString1 = myString.substring(7); // returns "world!"
        System.out.println(subString1);

        //4- substring(int beginIndex, int endIndex): returns a new String that is a substring
        //of the original String starting from the beginIndex and ending at endIndex - 1.
        String subString2 = myString.substring(0, 5); // returns "Hello"
        System.out.println(subString2);

        //5- toLowerCase(): returns a new String with all characters in lowercase.
        String lowerCaseString = myString.toLowerCase(); // returns "hello, world!"
        System.out.println(lowerCaseString);

        //6- toUpperCase(): returns a new String with all characters in uppercase.
        String upperCaseString = myString.toUpperCase(); // returns "HELLO, WORLD!"
        System.out.println(upperCaseString);

        //7- trim(): returns a new String with leading and trailing white spaces removed.
        String myString2 = "   Hello, world!    ";
        String trimmedString = myString2.trim(); // returns "Hello, world!"
        System.out.println(trimmedString);

        //8- startsWith(String prefix): returns true if the String starts with 
        // the specified prefix, false otherwise.
        boolean startsWithHello = myString.startsWith("Hello"); // returns true
        System.out.println(startsWithHello);
        boolean startsWithWorld = myString.startsWith("World"); // returns false
        System.out.println(startsWithWorld);

        //9- endsWith(String suffix): returns true if the String ends with 
        // the specified suffix, false otherwise.
        boolean endsWithWorld = myString.endsWith("world!"); // returns true
        System.out.println(endsWithWorld);
        boolean endsWithHello = myString.endsWith("Hello"); // returns false
        System.out.println(endsWithHello);

        //10- indexOf(String str): returns the index of the first occurrence of
        // the specified substring in the String, or -1 if the substring is not found.
        int index = myString.indexOf("world"); // returns 7
        System.out.println(index);

        //11- replace(char oldChar, char newChar): returns a new String with all
        //occurrences of the old character replaced by the new character.
        String replacedString = myString.replace('o', '0'); // returns "Hell0, w0rld!"
        System.out.println(replacedString);

        //12-split(String regex): returns an array of Strings that are the result 
        //of splitting the String around matches of the specified regular expression.
        String[] splitString = myString.split(", "); // returns {"Hello", "world!"}
        System.out.println(Arrays.toString(splitString));

        //13-concat(String str): returns a new String that is the concatenation
        //of the original String and the specified String. 
        String concatString = myString.concat(" From Java!"); // returns "Hello, world! From Java!"
        System.out.println(concatString);

        //14- isEmpty(): returns true if the String is empty 
        //(i.e., has a length of 0), false otherwise.
        String myString3 = "";
        boolean isEmpty = myString3.isEmpty(); // returns true
        System.out.println(isEmpty);

        //15- equalsIgnoreCase(String anotherString): returns true if 
        // the String is equal to another String, ignoring case considerations.
        boolean isEqualIgnoreCase = myString.equalsIgnoreCase("hello, WORLD!");
        System.out.println(isEqualIgnoreCase); // returns true

    }

}
