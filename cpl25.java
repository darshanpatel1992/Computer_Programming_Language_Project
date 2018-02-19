

import java.util.Scanner;

/**
 *
 *  Darshan Patel
 *  CS 635102
 * dap83@njit.edu
 */
public class cpl25 {

    public static void main(String[] args) {
        /*Entering user input part*/
        System.out.println("Enter the string ");
        /*Scan user input*/
        Scanner scan= new Scanner(System.in);
        String s= scan.next();
                        String[] input = s.split("->");
        /*Check Weather input is correct or not?*/
        if (input.length != 2) {            
            System.out.println("Given input is not correct");
            Scanner scan1= new Scanner(System.in);
            String s1= scan1.next();    
            
            input = s1.split("->");
         
            
        }
        System.out.print(input[0] + " -> ");
        /*Function call*/
        splitNT(input[1].trim());

    }

    public static void splitNT(String RemainSt) {
        char CharFirst = RemainSt.charAt(0);
        String NewSt = RemainSt.substring(1);
        /* Check Condition for first char of string is Lowercase or not?*/
        if (isLowerCase(CharFirst)) {
            System.out.print("<" + CharFirst + ">");
        } else if (NewSt.length() > 0) {
            System.out.print(CharFirst);
        }
        /* Check Condition for string contain lowercase char*/
        if (containsLowerCase(NewSt)) {
            System.out.println("<" + NewSt + ">");
        }
         else
         {
            System.out.println(NewSt);
        }
        /* condition for first char is lowercase and newstring not eq space*/
        if (isLowerCase(CharFirst) && !NewSt.equals("")) {
            System.out.println("<" + CharFirst + "> -> " + CharFirst);
        }

        if ((NewSt.length() > 1 && containsLowerCase(NewSt)) || (NewSt.length() == 1 && isLowerCase(NewSt.charAt(0)))) {
            System.out.print("<" + NewSt + "> -> ");
            //call  newst
            splitNT(NewSt);
        }

    }
//return ascii value of lowercase char
    public static boolean isLowerCase(char c) {
        return c <= 122 && c >= 97;
        
    }
    

    public static boolean containsLowerCase(String s) {
//string to char array convert
        for (char c : s.toCharArray()) {
            //if its lower case return true else false
            if (isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

}

