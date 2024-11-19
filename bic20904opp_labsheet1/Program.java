package opp_labsheet03;

import java.util.Scanner;

public class Program {
    
    public static void main (String[] args){
        
        Scanner in = new Scanner(System.in);
        String name;
        
        System.out.println("Enter your name: ");
        name = in.nextLine();
        
        System.out.println("Thank you for your response.");
        
        System.out.println("Your Name is " + name);       
    
    }
    
}