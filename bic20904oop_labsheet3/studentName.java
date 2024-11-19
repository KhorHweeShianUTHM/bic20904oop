package oop_labsheet03;

import java.util.Scanner;

public class studentName {
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        // declare 3 array with size 3
        String[] names = new String[3];
        String[] programCodes = new String[3];
        String[] phoneNums = new String[3];
        
        // using loop to prompt user to enter 3 student name, program code, phone number
        for (int i = 0; i < 3; i++){
            System.out.print("Add a Student's Name: ");
            String name = scan.nextLine();
            
            System.out.print("Add a Student's Program Code: ");
            String programCode = scan.nextLine();
            
            System.out.print("Add a Student's Phone Number: ");
            String phoneNum = scan.nextLine();
            
            System.out.println("");
            
            names[i] = name; // assign name to names at index 1
            programCodes[i] = programCode; // assign programCode to programCodes at index 1
            phoneNums[i] = phoneNum; // assign phoneNum to phoneNums at index 1
        } 
        
        System.out.println("\nSTUDENT'S INFORMATION ARE: ");
        
        // using another loop to display content of the array
        for (int i = 0; i < 3; i++){
            System.out.println("Student's Name: " + names[i]);
            System.out.println("Student's Program Code: " + programCodes[i]);
            System.out.println("Student's Phone Number: " + phoneNums[i]);
            System.out.println("");
        }
    }
    
}
