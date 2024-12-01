package oop_assignment2;

public class RandomNumberGenerator {
    
    public static void main(String[] args) {
        
        int number = 0;

        while (number < 5) {
            number = (int) (Math.random() * 20);
            System.out.println("Random number: " + number);
            number++;
        }

        System.out.println("Congratulations. A number equal or greater than 5 is found: " + number + " is >= 5");
    }
}