package oop_labsheet03;

import java.util.Scanner;

public class AppMenu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your selection [1-3]: ");
        int select = scan.nextInt();
        
        System.out.println("You have selected " + select + "\n");
        
        switch (select) {
            case 1:
                System.out.println("Free Apple Juice for you");
                break;
            case 2:
                System.out.println("Free Orange Juice for you");
                break;
            case 3:
                System.out.println("Sorry, you didn't get any free drink");
                break;
            default:
                System.out.println("Wrong selection");
                break;
        }
    }
    
}
