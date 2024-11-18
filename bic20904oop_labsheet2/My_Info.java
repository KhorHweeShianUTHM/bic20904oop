package oop_labsheet02;

import java.util.Scanner;

public class My_Info {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name : ");
        String fullName = input.nextLine();

        System.out.print("Enter your gender (Male or Female) : ");
        String gender = input.nextLine();

        System.out.print("Enter your year of birth : ");
        int yearOfBirth = input.nextInt();

        int ageIn2024 = 2024 - yearOfBirth;

        System.out.println("\n=== Your Information ===\n");
        System.out.println("Full Name : " + fullName);
        System.out.println("Gender : " + gender);
        System.out.println("Your Age in 2024 : " + ageIn2024);
    }
}