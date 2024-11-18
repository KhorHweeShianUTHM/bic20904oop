package oop_labsheet02;

public class  Variable_Example {

    // Instance variable (belongs to the object, not method-specific)
    int instanceVal = 10;

    // Reference variable (points to an object)
    String referenceVal = "Hello, World!";

    // Final variable (constant)
    final double FINAL_VAL = 3.14159;

    public void demoVal() {
        // Local variable (declared inside a method)
        int localVal = 5;

        // Printing the values
        System.out.println("Instance Variable: " + instanceVal);
        System.out.println("Reference Variable: " + referenceVal);
        System.out.println("Final Constant: " + FINAL_VAL);
        System.out.println("Local Variable: " + localVal);
    }

    public static void main(String[] args) {
        Variable_Example example = new Variable_Example();
        example.demoVal();
    }
}