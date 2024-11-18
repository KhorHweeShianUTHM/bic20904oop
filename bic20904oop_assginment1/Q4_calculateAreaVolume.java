// Name: Khor Hwee Shian
// Matric No: CI230085
// Section: 5

package oop_assginment1;

import java.util.Scanner;

public class Q4_calculateAreaVolume {
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double r, l;
        final double PI = 3.1415;
        
        System.out.print("Please Enter Radius: ");
        r = input.nextDouble();
        
        System.out.print("Please Enter Length: ");
        l = input.nextDouble();
        
        double a = r * r * PI;
        double v = a * l;
        
        System.out.println("Area of a Circle: " + a);
        System.out.println("Volume of a Cylinder: " + v);
        
    }
}