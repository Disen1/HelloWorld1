/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld1;

import java.io.*;
import java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author DiKar9960
 */
public class HelloWorld1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World");
        double x = scan.nextDouble();
        double s = ((x/2)+0.5);
        System.out.println((int)s + " is half of the number rounded.");
        if(s>5 && s <10)
        {
            System.out.println("It is also between 5 and  10 exclusive.");
            System.out.println("Hi");
            System.out.println("this is a change");
            System.out.println("this is another test");
            System.out.println("another cange");
            System.out.println("This is another change testing fetching");
        }
    
 
    }
    
}
