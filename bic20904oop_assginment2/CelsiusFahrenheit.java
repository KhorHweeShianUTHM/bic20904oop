package oop_assignment2;

public class CelsiusFahrenheit {
    
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5.0) * celsius + 32; 
        return fahrenheit;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9.0) * (fahrenheit - 32); 
        return celsius;
    }
    
    public static void main (String[] args){
        System.out.printf("Celsius to Fahrenheit: %.1f\n" , celsiusToFahrenheit(40));
        System.out.printf("Celsius to Fahrenheit: %.1f\n" , celsiusToFahrenheit(39)); 
        System.out.printf("Fahrenheit to Celsius: %.2f\n" , fahrenheitToCelsius(120));
        System.out.printf("Fahrenheit to Celsius: %.2f\n" , fahrenheitToCelsius(110));
    }
}