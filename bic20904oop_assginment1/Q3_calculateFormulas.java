// Name: Khor Hwee Shian
// Matric No: CI230085
// Section: 5

package oop_assginment1;

import java.util.Scanner;

public class Q3_calculateFormulas {
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double a, b, c;
      
        System.out.print("Enter Value of a: ");
        a = input.nextDouble();
        
        System.out.print("Enter Value of b: ");
        b = input.nextDouble();
        
        System.out.print("Enter Value of c: ");
        c = input.nextDouble();
        
        double ans = Math.pow(b, 2) - (4 * a * c);
        
        if (a != 0 && ans >= 0) {
            
            double x1 = (-b + Math.sqrt(ans)) / (2 * a);
            double x2 = (-b - Math.sqrt(ans)) / (2 * a);
            
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            
        } else {
            
            System.out.println("Invalid Value. Please Try Again. ");
            
        } 
    }
}