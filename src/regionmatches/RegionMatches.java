/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regionmatches;

/**
 *
 * @author PolinaYoga
 */
public class RegionMatches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str = "January is the first month and december is the last. Violet is a purple color as are lilac and plum.";
        String str2 = "January is my favorite month";
        String str3 = "JANUARY is my favorite month";
        
        int first, last;
        first = str.indexOf('m');
        last = str.lastIndexOf('V'); // if we put lowercase v the result will be -1
        int position;
        
        System.out.println("The letter m first appears at " + "position " + first);
        
        System.out.println("The letter V last appears at " + "position " + last);
        
        System.out.println("The letter m appears at he " + "following location:");
        position = str.indexOf('m');
        while (position != -1)
        {
            System.out.println(position);
            position = str.indexOf('m', position +1);
        }
        
        if (str.regionMatches(0, str2, 0, 6))
            System.out. println("The regions match.");
        else
            System.out. println("The regions do not match.");
        
        if (str2.regionMatches(0, str3, 0, 6))
            System.out. println("The regions match.");
        else
            System.out. println("The regions do not match.");
        
        if (str2.regionMatches(true, 0, str3, 0, 6))
            System.out. println("The regions match.");
        else
            System.out. println("The regions do not match.");
        
        // startsWith method
        if (str.startsWith("January"))
            System.out.println("The string starts with January.");
        else
            System.out.println("The string does not starts with January.");
        
        // endsWith method
        if (str2.endsWith("month"))
            System.out.println("The string2 ends with month.");
        else
            System.out.println("The string2 does not ends with month.");
    }
    
}
