package oop_assignment2;

import java.util.Scanner;

public class AverageCalculator {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int itemCount = scan.nextInt();

        double[] numbers = new double[itemCount];
        double sum = 0;

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scan.nextDouble();
            sum += numbers[i];
        }

        double average = sum / itemCount;

        int belowAverageCount = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            double number = numbers[i];
            if (number < average) {
                belowAverageCount++;
            }
        }

        System.out.printf("Average is %.2f\n", average);
        System.out.println("Number of elements below the average is " + belowAverageCount);
        
    }
}