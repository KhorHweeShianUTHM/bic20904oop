// Name: Khor Hwee Shian
// Matric No: CI230085
// Section: 5

package oop_assginment1;


public class Q2_mathTable {
    
    public static void main (String[] args){
        
        System.out.println("a\tb\ta to the power of b");
        
        for (int a = 1, b = 2; a <= 5; a++, b++) {
            
            int result = (int) Math.pow(a, b);
            
            System.out.println(a + "\t" + b + "\t" + result);
        }
    }
}