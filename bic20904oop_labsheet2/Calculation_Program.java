package oop_labsheet02;

import java.util.Scanner;

public class Calculation_Program {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number 1: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter Number 2: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter Number 3: ");
        double num3 = input.nextDouble();
        
        System.out.println("\nValues entered are " + num1 + ", " + num2 + ", " + num3 + ".");
        
        double result = (num1 + Math.pow(num2, 2)) / num3;
        
        System.out.printf("Answer is %.2f.%n", result);
    }
}
